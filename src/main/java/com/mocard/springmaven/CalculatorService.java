package com.mocard.springmaven;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    public int plus(int num1,int num2) {
        return num1 + num2;
    }
    @GetMapping
    public int minus(int num1,int num2) {
        return num1 - num2;
    }
    @GetMapping
    public int multi(int num1,int num2) {
        return num1 * num2;
    }
    @GetMapping
    public int division(int num1,int num2) {
        return num1 / num2;
    }
}
