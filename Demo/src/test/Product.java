package test;

public class Product 
{
	private String prouctId;
	private String productName;
	
	public String getProuctId() {
		return prouctId;
	}
	public void setProuctId(String prouctId) {
		this.prouctId = prouctId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [prouctId=" + prouctId + ", productName=" + productName + "]";
	}
	
	
	
	

}
