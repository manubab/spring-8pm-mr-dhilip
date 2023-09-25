package my.manu.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.manu.entity.Product;
import my.manu.repo.ProductRepo;

@Component
public class DbOperations
{
	
	@Autowired
     private ProductRepo repo;
	
	
	public void addProduct(Product product)
	{
		repo.save(product);
	}
	
	public void adddMultipleProducts(List<Product> list)
	{
		repo.saveAll(list);
		
	}
	
	public void deleteProduct(Product product)
	{
		repo.deleteById(product.getProductCode());
	}

}
