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
    public String helloCalculayter() {
        return calculateServis.helloCalculayter();
    }

    @GetMapping(path = "/plus")
    public String plusCalculayter(@RequestParam("number1") int number1,
                                  @RequestParam("number2") int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number НЕ 0");
        }
        int plus = calculateServis.plusCalculayter(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + plus;
    }

    @GetMapping(path = "/minus")
    public String minusCalculayter(@RequestParam("number1") int number1,
                                   @RequestParam("number2") int number2) {
        if (number1 == 0 || number2 == 0) {
            return (" НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number а  НЕ 0");
        }
        int minus = calculateServis.minusCalculayter(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + minus;

    }

    @GetMapping(path = "/multi")
    public String multiCalculayter(@RequestParam("number1") int number1,
                                   @RequestParam("number2") int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number НЕ 0");
        }
        int multi = calculateServis.multiCalculayter(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + multi;

    }

    @GetMapping(path = "/divide")
    public String divideCalculayter(@RequestParam("number1") int number1,
                                    @RequestParam("number2") int number2) {
        if (number1 == 0 || number2 == 0) {
            return ("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ number а НЕ 0");
        }
        if (number2 == 0) {
            return ("ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ");
        }
        int divide = calculateServis.divideCalculayter(number1, number2);
        return " number1  " + number1 + "  number2  " + number2 + "  = " + divide;
    }
}


