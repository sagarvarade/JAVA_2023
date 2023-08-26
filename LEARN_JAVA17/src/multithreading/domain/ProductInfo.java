package multithreading.domain;

import java.util.List;


public class ProductInfo {
    private String productId;
    private List<ProductOption> productOptions;
    
	public ProductInfo() {
		super();
	}
	public ProductInfo(String productId, List<ProductOption> productOptions) {
		super();
		this.productId = productId;
		this.productOptions = productOptions;
	}
	public String getProductId() {
		return productId;
	}
	public ProductInfo setProductId(String productId) {
		this.productId = productId;
		return this;
	}
	public List<ProductOption> getProductOptions() {
		return productOptions;
	}
	public ProductInfo setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
		return this;
	}
    
    
}
