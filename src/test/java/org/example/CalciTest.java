package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalciTest {
    Calc calc;

    @BeforeEach
    public void setup() {
        calc = new Calc();
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }

    @Test
    public void addTest() {
        double n1 = 10, n2 = 20;
        Assertions.assertEquals(30, calc.add(n1, n2));
        Assertions.assertNotEquals(11, calc.add(n1, n2));
    }

    @Test
    public void subTest() {
        double n1 = 10, n2 = 20;

        Assertions.assertEquals(-10, calc.sub(n1,n2));
        Assertions.assertNotEquals(76, calc.sub(n1,n2));
    }
    @Test
    public void multiplicationTest(){
        double n1 = 10, n2 = 20;
        double res = calc.multiply(n1,n2);
        Assertions.assertEquals(200,res);
        Assertions.assertNotEquals(11,res);
    }

    @Test
    public void divisionTest(){
        double n1 = 10, n2 = 20;
        double res = calc.div(n1,n2);
        Assertions.assertEquals(0.5,res);
        Assertions.assertNotEquals(11,res);
    }
    @Test
    public void moduloTest(){
        double n1 = 10, n2 = 20;
        double res = calc.modulo(n1, n2);
        Assertions.assertEquals(10.0,res);
        Assertions.assertNotEquals(11,res);
    }
}
