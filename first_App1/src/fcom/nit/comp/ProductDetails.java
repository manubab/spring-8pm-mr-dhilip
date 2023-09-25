package fcom.nit.comp;

public class ProductDetails {
	private String productName;
	private String productId;
	private String productPrice;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", productId=" + productId + ", productPrice="
				+ productPrice + "]";
	}

	public void printDetails() {
		super.toString();
	}

}
