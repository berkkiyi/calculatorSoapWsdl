package com.wcf.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorClient calculatorClient;

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorClient.Somme(a, b);
        Map<String, Integer> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

    @GetMapping("/subtract")
    public Map<String, Integer> subtract(@RequestParam int a, @RequestParam int b) {
        int result = calculatorClient.substractNumber(a, b);
        Map<String, Integer> response = new HashMap<>();
        response.put("result", result);
        return response;
    }
}
