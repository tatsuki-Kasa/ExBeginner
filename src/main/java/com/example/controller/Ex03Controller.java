package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Ex03Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index() {
        return "/Ex03/ex03";
    }

    @RequestMapping("/calc")
    public String calc(Integer firstPrice, Integer secondPrice, Integer thirdPrice) {
        Integer withoutTax = firstPrice + secondPrice + thirdPrice;
        Integer withTax = (int)(withoutTax * 1.1);

        application.setAttribute("withoutTax", withoutTax);
        application.setAttribute("withTax", withTax);

        return "Ex03/ex03Result";
    }

}
