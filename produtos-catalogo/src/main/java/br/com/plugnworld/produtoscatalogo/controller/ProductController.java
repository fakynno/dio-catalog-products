package br.com.plugnworld.produtoscatalogo.controller;

import br.com.plugnworld.produtoscatalogo.model.Product;
import br.com.plugnworld.produtoscatalogo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping(value = "/{id}")
    Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
