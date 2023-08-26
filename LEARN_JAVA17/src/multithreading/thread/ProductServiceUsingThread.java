package multithreading.thread;

import static multithreading.util.CommonUtil.stopWatch;
import static multithreading.util.LoggerUtil.log;

import multithreading.domain.Product;
import multithreading.domain.ProductInfo;
import multithreading.domain.Review;
import multithreading.service.ProductInfoService;
import multithreading.service.ReviewService;

public class ProductServiceUsingThread {
	private ProductInfoService productInfoService;
	private ReviewService reviewService;

	public ProductServiceUsingThread(ProductInfoService productInfoService, ReviewService reviewService) {
		this.productInfoService = productInfoService;
		this.reviewService = reviewService;
	}

	public Product retrieveProductDetails(String productId) throws InterruptedException {
		stopWatch.start();

		ProductInfoRunnable productInfoRunnable = new ProductInfoRunnable(productId);
		Thread productInfoThread=new Thread(productInfoRunnable);
		
		ReviewRunnable reviewRunnable=new ReviewRunnable(productId);
		Thread reviewThread=new Thread(reviewRunnable);
		
		productInfoThread.start();
		reviewThread.start();
		
		productInfoThread.join();
		reviewThread.join();
		// Sequential changed to asynchronous
		//ProductInfo productInfo = productInfoService.retrieveProductInfo(productId); // blocking call
		//Review review = reviewService.retrieveReviews(productId); // blocking call
		ProductInfo productInfo = productInfoRunnable.getProductInfo();
		Review review=reviewRunnable.getReview();
		
		stopWatch.stop();
		log("Total Time Taken : " + stopWatch.getTime());
		return new Product(productId, productInfo, review);
	}

	public static void main(String[] args) throws InterruptedException {

		ProductInfoService productInfoService = new ProductInfoService();
		ReviewService reviewService = new ReviewService();
		ProductServiceUsingThread productService = new ProductServiceUsingThread(productInfoService, reviewService);
		String productId = "ABC123";
		Product product = productService.retrieveProductDetails(productId);
		log("Product is " + product);

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
		public ReviewRunnable(String productId)
		{
			this.productId=productId;
		}
		
		
		@Override
		public void run() {
			review=reviewService.retrieveReviews(productId);
		}


		public Review getReview() {
			return review;
		}
		
	}
}
