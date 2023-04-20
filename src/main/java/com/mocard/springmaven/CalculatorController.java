package com.mocard.springmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

   @GetMapping
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1, num2);
    }
    @GetMapping
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + "=" + calculatorService.plus(num1, num2);
    }
    @GetMapping
    public String multi(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "*" + num2 + "=" + calculatorService.plus(num1, num2);
    }
    @GetMapping
    public String division(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "/" + num2 + "=" + calculatorService.plus(num1, num2);
    }
}
