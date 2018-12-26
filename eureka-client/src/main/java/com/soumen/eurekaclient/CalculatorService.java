package com.soumen.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

    @GetMapping("/calculator/add/{a}/{b}")
    public CalculatorPojo addition(@PathVariable Integer a, @PathVariable Integer b) {
        CalculatorPojo pojo = new CalculatorPojo();
        pojo.setInputs(new Integer[]{a, b});
        pojo.setOutput(a + b);
        pojo.setOperation("ADDITION");
        return pojo;
    }

}
