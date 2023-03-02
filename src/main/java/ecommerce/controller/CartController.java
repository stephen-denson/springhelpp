package ecommerce.controller;

import ecommerce.entiity.Cart;
import ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService service;

    @GetMapping("/getCartItems")
    public List<Cart> getItems(){
        return service.getCartItems();
    }

    @PostMapping("/addItemToCart")
    public Cart addNUser(@RequestBody Cart cart){
        return service.saveCart(cart);
    }

    @DeleteMapping("/deleteCart")
    public String clearCart(){
        return service.deleteCartItems();
    }
}
