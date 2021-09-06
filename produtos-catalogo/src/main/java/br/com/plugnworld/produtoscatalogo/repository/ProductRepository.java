package br.com.plugnworld.produtoscatalogo.repository;

import br.com.plugnworld.produtoscatalogo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
