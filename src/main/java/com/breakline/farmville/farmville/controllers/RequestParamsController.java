package com.breakline.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.dto.ParamMixDto;
import com.breakline.farmville.farmville.models.dto.ParamsDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {
    @GetMapping("/foo")
    public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {

        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;

    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }


}
