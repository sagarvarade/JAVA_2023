package multithreading.domain;




public class Product {

    private String productId;
    private ProductInfo productInfo;
    private Review review;
    
    
     
	public Product() {
		super();
	}
	public Product(String productId, ProductInfo productInfo, Review review) {
		super();
		this.productId = productId;
		this.productInfo = productInfo;
		this.review = review;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
    
    
    
    
}
