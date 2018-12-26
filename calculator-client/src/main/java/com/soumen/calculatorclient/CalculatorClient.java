package com.soumen.calculatorclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CALCULATOR-SERVICE")
public interface CalculatorClient {
    @GetMapping("/calculator/add/{a}/{b}")
    CalculatorPojo addition(@PathVariable Integer a, @PathVariable Integer b);


}
