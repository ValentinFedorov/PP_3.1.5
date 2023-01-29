package com.example.spring_boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "/login";
    }

    @GetMapping("/logout")
    public String logoutPage() {
        return "/login";
    }
}
