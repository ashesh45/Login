package com.spring1.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        // Add any model attributes needed for the login page
        return "index";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                Model model) { 
        if (username.equals("user") && password.equals("password")) {
    
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index";
        }
    }
}
