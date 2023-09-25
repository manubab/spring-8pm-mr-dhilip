package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import my.manu.entity.Product;
@Component
public interface ProductRepo extends JpaRepository<Product, String> {

}
