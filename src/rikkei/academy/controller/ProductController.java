package rikkei.academy.controller;

import rikkei.academy.model.Product;
import rikkei.academy.service.IProductService;
import rikkei.academy.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    private IProductService iProductService =new ProductServiceIMPL();

    public List<Product > showProduct(){
        return iProductService.findAll();

    }
    public List<Product > sortProduct(){
        return iProductService.sortByPrice();

    }

}