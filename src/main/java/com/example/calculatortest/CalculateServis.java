package com.example.calculatortest;

import org.springframework.stereotype.Service;


@Service
public class CalculateServis {
    public String helloCalculayter() {
        return "Добро пожаловать в калькулятор ";
    }

    public int plusCalculayter(int number1, int number2) {
        return number1 + number2;
    }

    public int minusCalculayter(int number1, int number2) {
        return number1 - number2;
    }

    public int multiCalculayter(int number1, int number2) {
        return number1 * number2;
    }

    public int divideCalculayter(int number1, int number2) {
        return number1 / number2;
    }

}

