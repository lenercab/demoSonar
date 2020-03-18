package com.example.sonarDemoAPIrets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarDemoController {

    @GetMapping("/Sonar")
    public String getSonarDemo() {
        return "Hola a todos..";
    }
}
