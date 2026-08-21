package org.example.food_shop_ordering_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String loginPage() {
        // Trả về file giao diện login.html trong thư mục templates
        return "auth/login";
    }
}
