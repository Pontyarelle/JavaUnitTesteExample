package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(2, 3, '+');
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(5, 3, '-');
        assertEquals(2.0, resultado, 0.0001);
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(2, 5, '*');
        assertEquals(10.0, resultado, 0.0001);
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.calcular(10, 2, '/');
        assertEquals(5.0, resultado, 0.0001);
    }
}
