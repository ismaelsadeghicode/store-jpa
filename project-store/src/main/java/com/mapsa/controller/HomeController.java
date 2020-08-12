package com.mapsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;

@Controller
public class HomeController {

    @Autowired
    ProductDao productDao;
    @Autowired
    UserDao userDao;


    @RequestMapping("/")
    public String index(){
//        productDao.findAllProduct();
        return "index";
    }
}
