package com.example.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatController {
    private final CalculateServis calculateServis;

    CalculatController(CalculateServis calculateServis) {
        this.calculateServis = calculateServis;
    }


    @GetMapping
    public String hello() {
        return calculateServis.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(int number1,
                       int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number НЕ 0");
        }
        int plus = calculateServis.plus(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + plus;
    }

    @GetMapping(path = "/minus")
    public String minus(int number1,
                        int number2) {
        if (number1 == 0 || number2 == 0) {
            return (" НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number а  НЕ 0");
        }
        int minus = calculateServis.minus(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + minus;

    }

    @GetMapping(path = "/multi")
    public String multi(int number1,
                        int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number НЕ 0");
        }
        int multi = calculateServis.multi(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + multi;

    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("number1") int number1,
                         @RequestParam("number2") int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number а НЕ 0");
        }
        if (number2 == 0) {
            return ("ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ");
        }
        int divide = calculateServis.divide(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + divide;
    }
}


