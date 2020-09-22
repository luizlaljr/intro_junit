/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.produto;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luizlaljr
 */
@DisplayName("Classe de Teste da classe Produto")
public class ProdutoTest {
    
    private Produto p;
    
    @BeforeEach
    public void inicializa(){
        p = new Produto("Arroz",100.0);
    }
    
    @DisplayName("Teste do método getNome")
    @Test
    public void testGetNome(){
        String nome = p.getNome();
        assertEquals("Arroz", nome);
    }
    
    @DisplayName("Teste do método getPreco")
    @Test
    public void testGetPreco(){
        double preco = p.getPreco();
        assertEquals(100.0, preco);
    }
    
    @DisplayName("Teste do método setNome")
    @Test
    public void testSetNome(){
        p.setNome("Feijao");
        String nome = p.getNome();
        assertEquals("Feijao", nome);
    }
    
    @DisplayName("Teste do método setPreco")
    @Test
    public void testSetPreco(){
        p.setPreco(50.0);
        double preco = p.getPreco();
        assertEquals(50.0, preco);
    }
    
    @DisplayName("Teste do método equals caso verdadeiro")
    @Test
    public void testEqualsVerdadeiro(){
        Produto p1 = new Produto("Arroz",120.0);
        boolean ehIgual = p.equals(p1);
        assertTrue(ehIgual);
    }
    
    @DisplayName("Teste do método equals caso falso")
    @Test
    public void testEqualsFalso(){
        Produto p1 = new Produto("Feijao",120.0);
        boolean ehIgual = p.equals(p1);
        assertFalse(ehIgual);
    }
    
    @AfterEach
    public void finaliza(){
        p = null;
    }
    
}
