package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EjemploController {
    @GetMapping("/detalles_info")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String info()
    {

        return "detalles_info";
    }

}
