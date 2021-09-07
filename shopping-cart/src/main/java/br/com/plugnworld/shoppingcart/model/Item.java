package br.com.plugnworld.shoppingcart.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Data
public class Item {

    private Integer productId;
    private Integer amount;

}
