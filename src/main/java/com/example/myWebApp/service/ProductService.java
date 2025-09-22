package com.example.myWebApp.service;

import com.example.myWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product>products= Arrays.asList(new Product(101,"iphone",5000),
    new Product(102,"wife phone00",5020),
    new Product(3,"meowphone",4560));
    public List<Product> getProducts(){
        return products;
    }

}
