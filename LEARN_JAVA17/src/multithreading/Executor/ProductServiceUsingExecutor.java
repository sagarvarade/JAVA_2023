package multithreading.Executor;

import static multithreading.util.CommonUtil.stopWatch;
import static multithreading.util.LoggerUtil.log;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import multithreading.domain.Product;
import multithreading.domain.ProductInfo;
import multithreading.domain.Review;
import multithreading.service.ProductInfoService;
import multithreading.service.ReviewService;

public class ProductServiceUsingExecutor {

	static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

	private ProductInfoService productInfoService;
	private ReviewService reviewService;

	public ProductServiceUsingExecutor(ProductInfoService productInfoService, ReviewService reviewService) {
		this.productInfoService = productInfoService;
		this.reviewService = reviewService;
	}

	public Product retrieveProductDetails(String productId)
			throws InterruptedException, ExecutionException, TimeoutException {
		stopWatch.start();

		Future<ProductInfo> productFuture = executorService
				.submit(() -> productInfoService.retrieveProductInfo(productId));
		Future<Review> reviewFuture = executorService.submit(() -> reviewService.retrieveReviews(productId));

		ProductInfo productInfo = productFuture.get();
		Review review = reviewFuture.get(2, TimeUnit.SECONDS);

		stopWatch.stop();
		log("Total Time Taken : " + stopWatch.getTime());
		return new Product(productId, productInfo, review);
	}

	public static void main(String[] args) throws InterruptedException, TimeoutException {

		ProductInfoService productInfoService = new ProductInfoService();
		ReviewService reviewService = new ReviewService();
		ProductServiceUsingExecutor productService = new ProductServiceUsingExecutor(productInfoService, reviewService);
		String productId = "ABC123";
		Product product = null;
		try {
			product = productService.retrieveProductDetails(productId);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		log("Product is " + product);
		System.out.println("Done");
		executorService.shutdown();

	}

	private class ProductInfoRunnable implements Runnable {

		private ProductInfo productInfo;
		private String productId;

		public ProductInfoRunnable(String productId) {
			this.productId = productId;
		}

		@Override
		public void run() {
			productInfo = productInfoService.retrieveProductInfo(productId);
		}

		public ProductInfo getProductInfo() {
			return productInfo;
		}

	}

	private class ReviewRunnable implements Runnable {
		private String productId;
		private Review review;

		public ReviewRunnable(String productId) {
			this.productId = productId;
		}

		@Override
		public void run() {
			review = reviewService.retrieveReviews(productId);
		}

		public Review getReview() {
			return review;
		}

	}
}
