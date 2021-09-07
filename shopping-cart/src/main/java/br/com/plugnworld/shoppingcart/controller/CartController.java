package br.com.plugnworld.shoppingcart.controller;

import br.com.plugnworld.shoppingcart.model.Cart;
import br.com.plugnworld.shoppingcart.model.Item;
import br.com.plugnworld.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping(value = "/{id}")
    public Cart createItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart();
        } else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    @GetMapping(value = "/{id}")
    public Optional<Cart> findById(@PathVariable("id") Integer id) {
        return cartRepository.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCart(@PathVariable("id") Integer id) {
        cartRepository.deleteById(id);
    }
}
