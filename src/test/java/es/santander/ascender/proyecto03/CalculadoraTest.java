package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
        public void testSumar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.sumar(4, 5) == 9);
        }

        public void testRestar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.restar(5, 4) == 1);
        }
        
        public void testMultiplicar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.multiplicar(5, 4) == 20);
        }
        
        public void testDividir() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.dividir(20, 4) == 5);
        }
            
}
