package ecommerce.service;

import ecommerce.entiity.Product;
import ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByProductName(String name){
        return repository.findByProductName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product deleted";
    }
}
