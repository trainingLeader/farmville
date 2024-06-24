package com.breakline.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.ParamsDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/demovar")

public class PathVariableController {

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/producto/{productname}/{id}")
    public Map<String,Object> getProduct(@PathVariable String productname,@PathVariable Long id ){
        Map<String,Object> jsonData = new HashMap<>();
        
        jsonData.put("product", productname);
        jsonData.put("id", id);

        return jsonData;
    }
    
    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
        return user;
    }
    
}
