package com.jahangir.config.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @GetMapping("/current-config")
    public String getCurrentApplicationConfig(){
        return "Hola!";
    }
}
