package org.bdp.com.bo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    
    @GetMapping("/")
    public String retornaHolaMundo() {
        return "Hola mundo desde GET";
    }

    @GetMapping("/retornar-numeric")
    public Integer retornar1() {
        return 1;
    }
}
