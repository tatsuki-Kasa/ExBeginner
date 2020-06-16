package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "ex02";
    }

    @RequestMapping("/calc")
    public String calc(int firstNum, int secondNum) {
        int answer = firstNum + secondNum;
        session.setAttribute("firstNum", firstNum);
        session.setAttribute("secondNum", secondNum);
        session.setAttribute("answer", answer);

        return "Ex02Result";
    }

}
