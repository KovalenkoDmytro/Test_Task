package com.test_task.controller;

import com.test_task.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

    @GetMapping()
    public String about(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

}
