package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {

    @ModelAttribute
    public UserForm setUp() {
        return new UserForm();
    }

    @RequestMapping("")
    public String index() {
        return "Ex04/ex04";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@Validated UserForm userForm,BindingResult result,Model model) {

        if(result.hasErrors()) {
            return index();
        }

        User user = new User();

        user.setName(userForm.getName());
        user.setAge(userForm.getAge());
        user.setComment(userForm.getComment());

        model.addAttribute("user",user);

        return "Ex04/output";
    }

}
