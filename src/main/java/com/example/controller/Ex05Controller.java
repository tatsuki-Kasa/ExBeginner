package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/ex05")
public class Ex05Controller {
    @Autowired
    private MemberRepository repository;

    @RequestMapping("")
    public String index() {
        return "Ex05/ex05";
    }

    @RequestMapping("/findByName")
    public String serchLike(String name, Model model) {
        List<Member> memberList = repository.findByName(name);

        model.addAttribute("memberList", memberList);

        return "Ex05/ex05-result";
    }

}
