package com.laman.paydaytradesystem.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payday/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello(){

        return ResponseEntity.ok("Hello form Secured point!"); 
    }

}
