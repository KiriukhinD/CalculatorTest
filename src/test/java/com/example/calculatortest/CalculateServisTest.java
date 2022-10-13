package com.example.calculatortest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculateServisTest {

    private final CalculateServis calculateServis = new CalculateServis();


    @Test
    public void plusTest() {
        Number actual = calculateServis.plus(2, 3);
        assertThat(actual).isEqualTo(5);

        actual = calculateServis.plus(-3, 1);
        assertThat(actual).isEqualTo(-2);
    }

    @Test
    public void minusTest() {
        Number actual = calculateServis.minus(2, 3);
        assertThat(actual).isEqualTo(-1);

        actual = calculateServis.minus(-3, 1);
        assertThat(actual).isEqualTo(-4);
    }

    @Test
    public void multiTest() {
        Number actual = calculateServis.multi(2, 3);
        assertThat(actual).isEqualTo(-1);

        actual = calculateServis.multi(-3, 1);
        assertThat(actual).isEqualTo(-4);
    }

    @Test
    public void divideTest() {
        Number actual = calculateServis.divide(4, 2);
        assertThat(actual).isEqualTo(-1);

        actual = calculateServis.divide(10, 3);
        assertThat(actual).isEqualTo(-4);
    }


}
