package com.breakline.farmville.farmville.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
        model.addAttribute("author", "Johlver Pardo");
        return "details";
    }
}
