package com.example.myWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor//for a constructor for lombok an empty constructor which isnt created froom @allargsconstructor
@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;



}
