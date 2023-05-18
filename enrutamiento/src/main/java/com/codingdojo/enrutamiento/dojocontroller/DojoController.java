package com.codingdojo.enrutamiento.dojocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DojoController {
    @GetMapping("{dojo}")
    public String dojo(@PathVariable("dojo") String prueba) {
        return prueba;            
    }   
   
    @GetMapping("{burbank}")
    public String prueba(@PathVariable("burbank") String burbank) {
        return "burbank.jsp";
    }
  
}
