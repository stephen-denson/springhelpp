package ecommerce.service;

import ecommerce.entiity.Cart;
import ecommerce.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private CartRepository repository;

    public Cart saveCart(Cart cart){
        return repository.save(cart);
    }

    public List<Cart> getCartItems(){
        return repository.findAll();
    }
    public String deleteCartItems(){
        repository.deleteAllInBatch();
        return "Cart deleted";
    }
}
