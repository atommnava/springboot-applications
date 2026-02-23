package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EjemploController {
    @GetMapping("detalles_info")
    public String info(Model model)
    {
        model.addAttribute("titulo", "Servidor en línea");
        model.addAttribute("servidor", "Informaticonfig");
        model.addAttribute("ip", "127.0.0.1");
        return "detalles_info";
    }

}
