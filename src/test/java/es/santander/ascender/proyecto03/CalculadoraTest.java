package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertTrue; //los imports static hay que ponerlos por delante de los imports

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
        public void testSumar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.sumar(4, 5) == 9);
        }
    @Test    
        public void testRestar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.restar(5, 4) == 1);
        }
    @Test    
        public void testMultiplicar() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.multiplicar(5, 4) == 20);
        }
    @Test    
        public void testDividir() {
            Calculadora sut = new Calculadora();
            assertTrue(sut.dividir(20, 4) == 5);
        }
            
}

//public class TestSumando {
//@test
//  public void testSumar(){
//      Calculadora Calculadora = new Calculadora();
//      long resultado = calculadora.sumar(5,10);
//      assertEquals(15,resultado,debería ser 15)
//}
//
//
//
//}