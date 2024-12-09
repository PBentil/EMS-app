package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";  // This will serve the login.html page from templates
    }


    @GetMapping("/employee")
    public String employee() {
        return "employee";  // This will serve the login.html page from templates
    }

    @GetMapping("/attendance")
    public String attendance() {
        return "attendance";  // This will serve the login.html page from templates
    }
}
