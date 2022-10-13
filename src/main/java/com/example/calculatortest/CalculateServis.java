package com.example.calculatortest;

import org.springframework.stereotype.Service;


@Service
public class CalculateServis {
    public String hello() {
        return "Добро пожаловать в калькулятор ";
    }

    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    public int minus(int number1, int number2) {
        return number1 - number2;
    }

    public int multi(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new RuntimeException("делить на ноль нельзя");
        }
        return number1 / number2;
    }

}

