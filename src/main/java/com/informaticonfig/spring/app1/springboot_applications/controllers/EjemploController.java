package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EjemploController {
    @GetMapping("/detalles_info")
    
    public String info(Model model) {
        model.addAttribute("Título", "Servidor en línea");

        
        return "Detalles_Info";
    }
}
