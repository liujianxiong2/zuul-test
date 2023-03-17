package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;
/*
 * <ul>
 *  <li>test</li>
 *  <li>@author liujianxiong ; @date 2022/1/1818:15</li>
 * <ul>
 */
@RestController
public class CommonController {


    @RequestMapping("/add")
    public String add(String name) {
        System.out.println("-------------");
        return "Holle " + name + " ，郭强的好朋友";
    }

    @RequestMapping("/hi")
    public String hi(String name) {
        return String.format("hello %s , 吃饭了么", "郭强");
    }

}
