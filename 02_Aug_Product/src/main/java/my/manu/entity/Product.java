package my.manu.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Peoducts_Data")
public class Product
{
	@Id
	private String productCode;
	
	private String productName;
	
	private Double productPrice;
	
	private Date ProductManuFactureDate;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Date getProductManuFactureDate() {
		return ProductManuFactureDate;
	}

	public void setProductManuFactureDate(Date productManuFactureDate) {
		ProductManuFactureDate = productManuFactureDate;
	}

	public Product() {
		
	}

	public Product(String productCode, String productName, Double productPrice, Date productManuFactureDate) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		ProductManuFactureDate = productManuFactureDate;
	}
	
	
	
	
	
	
	
	
}
