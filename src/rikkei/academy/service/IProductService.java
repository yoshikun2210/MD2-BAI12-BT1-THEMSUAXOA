package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> sortByPrice();

    List<Product> findAll();
    void save(Product product) ;


}