package com.amazon;
import java.util.*;
public class Products 
{
	private int productId;
	private String productName;
	private double productPrice;
	private boolean isExpaired;
	private List<String> products;
	private Map<Boolean,String> productManagement;
	
	

	public Products(int productId, String productName, double productPrice, boolean isExpaired, List<String> products,
			Map<Boolean, String> productManagement) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.isExpaired = isExpaired;
		this.products = products;
		this.productManagement = productManagement;
	}
	public Map<Boolean, String> getProductManagement() {
		return productManagement;
	}

	public void setProductManagement(Map<Boolean, String> productManagement) {
		this.productManagement = productManagement;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isExpaired() {
		return isExpaired;
	}

	public void setisExpaired(boolean isExpaired) {
		this.isExpaired = isExpaired;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}	
}
