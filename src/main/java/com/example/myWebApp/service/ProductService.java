package com.example.myWebApp.service;

import com.example.myWebApp.model.Product;
import com.example.myWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product>products= new ArrayList<>(Arrays.asList(new Product(101,"iphone",5000),
//    new Product(102,"wife phone00",5020),
//    new Product(103,"meowphone",4560)));

    public List<Product> getProducts(){
        return repo.findAll();
//        return products;
    }


    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
//        for(Product i: products)
//        {
//            if(i.getProdId() == prodId)
//            {
//                return i;
//            }
//        }
//        return null;
        /*return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(100,"NewIphones",12);*/
    }

    public  void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);

    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(i).getProdId()==prod.getProdId()){
//                index=i;
//            }
//        }
//        products.set(index,prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prodId){
//                index=i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(prodId);
    }

}
