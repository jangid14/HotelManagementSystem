package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.User;
import com.example.hotelmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }
}
