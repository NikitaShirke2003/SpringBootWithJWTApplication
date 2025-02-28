package com.core.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@SecurityRequirement(name = "Bearer Auth")
public class ApplicationController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER, PUNE");
    }

    @GetMapping("/services")
    public ResponseEntity<String> services() {
        return ResponseEntity.ok("Software Services");
    }

    @GetMapping("/address")
    public ResponseEntity<String> address() {
        return ResponseEntity.ok("INSPIRIA MALL | PUNE");
    }
}
