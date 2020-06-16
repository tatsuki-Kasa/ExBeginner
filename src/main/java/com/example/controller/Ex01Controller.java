package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")

public class Ex01Controller {

    @RequestMapping("")
    public String index() {
        return "Ex01/ex01";
    }

    @RequestMapping("/showName")
    public String showName(String name,Model model) {
        model.addAttribute("name", name);

        return "Ex01/result";
    }

}
