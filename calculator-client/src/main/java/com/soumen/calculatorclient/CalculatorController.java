package com.soumen.calculatorclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorClient client;
    @GetMapping("/calculator/add/{a}/{b}")
    public CalculatorPojo add(@PathVariable Integer a, @PathVariable Integer b){
        CalculatorPojo addition = client.addition(a, b);
        return addition;
    }
}
