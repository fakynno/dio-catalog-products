package br.com.plugnworld.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
@Data
public class Cart {

    @Id
    private Integer id;

    private List<Item> items;

    public List<Item> getItems() {

        if (items == null) items = new ArrayList<>();
        return items;
    }
}
