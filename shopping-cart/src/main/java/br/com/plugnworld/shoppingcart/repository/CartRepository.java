package br.com.plugnworld.shoppingcart.repository;

import br.com.plugnworld.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findCustomerId(Integer customerId);
}
