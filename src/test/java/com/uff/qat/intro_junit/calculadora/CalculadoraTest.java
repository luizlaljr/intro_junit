/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luizlaljr
 */
@DisplayName("Classe de Teste da classe Calculadora")
public class CalculadoraTest {
    
    private static Calculadora calc;
    
    @BeforeAll
    public static void inicializa(){
        calc = new Calculadora();
    }
    
    @DisplayName("Teste do método soma")
    @Test
    public void testSoma(){
        int soma = calc.soma(2,5);
        assertEquals(7, soma);
    }
    
    @DisplayName("Teste do método subtracao")
    @Test
    public void testSubtracao(){
        int subtracao = calc.subtracao(9, 5);
        assertEquals(4, subtracao);
    }
    
    @DisplayName("Teste do método multiplicacao")
    @Test
    public void testMultiplicacao(){
        int produto = calc.multiplicacao(2, 4);
        assertEquals(8, produto);
    }
    
    @DisplayName("Teste do método divisao")
    @Test
    public void testDivisao(){
        double quociente = calc.divisao(14, 7);
        assertEquals(2, quociente);
    }
    
    @DisplayName("Teste do método da divisao por zero")
    @Test
    public void testDivisaoPorZero(){
        assertThrows(ArithmeticException.class, () -> calc.divisao(8, 0));
    }
    
    @DisplayName("Teste do método somatoria")
    @Test
    public void testSomatoria(){
        int somatorio = calc.somatoria(4);
        assertEquals(10, somatorio);
    }
    
    @DisplayName("Teste do método ehPositivo caso verdadeiro")
    @Test
    public void testEhPositivoCasoVerdadeiro(){
        boolean ehPositivo = calc.ehPositivo(6);
        assertTrue(ehPositivo);
    }
    
    @DisplayName("Teste do método ehPositivo caso falso")
    @Test
    public void testEhPositivoCasoFalso(){
        boolean ehPositivo = calc.ehPositivo(-2);
        assertFalse(ehPositivo);
    }
    
    @DisplayName("Teste do método compara caso igual")
    @Test
    public void testComparaCasoIgual(){
        int compara = calc.compara(9, 9);
        assertEquals(0, compara);
    }
    
    @DisplayName("Teste do método compara caso maior")
    @Test
    public void testComparaCasoMaior(){
        int compara = calc.compara(17, 9);
        assertEquals(1, compara);
    }
    
    @DisplayName("Teste do método compara caso menor")
    @Test
    public void testComparaCasoMenor(){
        int compara = calc.compara(7, 9);
        assertEquals(-1, compara);
    }
    
    @AfterAll
    public static void finaliza(){
        calc = null;
    }
}
