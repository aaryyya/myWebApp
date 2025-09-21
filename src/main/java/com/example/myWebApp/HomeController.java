package com.example.myWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        System.out.println("Hi World Web App");
        return "Welcome to my Arya's Web Page!";
    }
    @RequestMapping("/about")
//    @ResponseBody
    public String about(){
        return "This is ABOUT page";
    }
}
