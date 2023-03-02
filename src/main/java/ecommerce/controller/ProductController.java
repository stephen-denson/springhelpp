package ecommerce.controller;

import ecommerce.entiity.Product;
import ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addNewProduct")
    public Product addNewProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
