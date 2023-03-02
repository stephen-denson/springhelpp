package ecommerce.repository;

import ecommerce.entiity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProductName(String name);
}
