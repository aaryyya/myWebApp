package com.example.myWebApp.service;

import com.example.myWebApp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product>products= Arrays.asList(new Product(101,"iphone",5000),
    new Product(102,"wife phone00",5020),
    new Product(103,"meowphone",4560));
    public List<Product> getProducts(){

        return products;
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(int prodId){
        for(Product i: products)
        {
            if(i.getProdId() == prodId)
            {
                return i;
            }
        }
        return null;
    }
}
