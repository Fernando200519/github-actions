package com.github_actions.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OperacionTest {
    @Test
    void testSumar() {
        Operacion op = new Operacion(5, 3);
        assertEquals(8, op.sumar());
    }

    @Test
    void testDividir() {
        Operacion op = new Operacion(10, 2);
        assertEquals(5, op.dividir());
    }
}