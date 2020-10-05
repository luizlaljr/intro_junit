/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author luizlaljr
 */
public class FaturaTest {
    
    private Fatura f;
    
    @BeforeEach
    public void setUp() { 
        f = new Fatura("Luiz", 1000.0, "10/10/2020");
    }
    
    @DisplayName("Teste do método para obter o nome")
    @Test
    public void testGetNome(){
        String nome = f.getNome();
        assertEquals("Luiz", nome);
    }
    
    @DisplayName("Teste do método para definir o nome")
    @Test
    public void testSetNome(){
        String nome = "Diane";
        f.setNome(nome);
        assertEquals("Diane", f.getNome());
    }
    
    @DisplayName("Teste do método para obter a data")
    @Test
    public void testGetData(){
        String data = f.getData();
        assertEquals("10/10/2020", data);
    }
    
    @DisplayName("Teste do método para definir a data")
    @Test
    public void testSetData(){
        String data = "20/10/2020";
        f.setData(data);
        assertEquals("20/10/2020", f.getData());
    }
    
    @DisplayName("Teste do método para obter o total")
    @Test
    public void testGetTotal(){
        double total = f.getTotal();
        assertEquals(1000.0, total);
    }
    
    @DisplayName("Teste do método para definir o total")
    @Test
    public void testSetTotal(){
        double total = 1500.0;
        f.setTotal(total);
        assertEquals(1500.0, f.getTotal());
    }
    
    @AfterEach
    public void tearDown() {
        f = null;
    }

}
