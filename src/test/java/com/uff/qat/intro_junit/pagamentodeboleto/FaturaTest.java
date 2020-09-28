/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author luizlaljr
 */
public class FaturaTest {
    
    @BeforeAll
    public static void inicializa() {
        Fatura f;
    }
    
    @BeforeEach
    public void setUp() { 
        f = new Fatura("Luiz",2020/10/10,1000.0);
    }
    
    @DisplayName("Teste do método para obter o nome")
    @Test
    public void testGetNome(){
        String nome = f.getNome();
        assertEquals("Luiz", nome);
    }
    
    @AfterEach
    public void tearDown() {
        f = null;
    }
    
    @AfterAll
    public static void finaliza() {
        f = null;
    }

}
