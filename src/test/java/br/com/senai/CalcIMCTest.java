package br.com.senai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcIMCTest {
    private final CalcIMC calculadora = new CalcIMC();

    @Test
    void calculaImcComPesoEAlturaValidos() {
        assertEquals(22.86, calculadora.calcularIMC(70, 1.75), 0.01);
    }

    @Test
    void rejeitaAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularIMC(70, 0));
    }
}
