package com.breakline.farmville.farmville.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.breakline.farmville.farmville.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Johlver","Pardo");
        user.setEmail("jjpardo2002@gmail.com");
        model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
        model.addAttribute("user", user);
        return "details";
    }
    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Carlos", "Perez","email1@correo.com"),
            new User("Martha","Sanchez","email1@correo.com"),
            new User("Vicente","Camargo","email1@correo.com")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }
}
