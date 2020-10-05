/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luizlaljr
 */
public class BoletoTest {
    
    private Boleto b;
    
    @BeforeEach
    public void setUp() { 
        b = new Boleto(123425,"10/10/2020",500.0);
    }
    
    @DisplayName("Teste do método para obter o codigo")
    @Test
    public void testGetCodigo(){
        int codigo = b.getCodigo();
        assertEquals(123425, codigo);
    }
    
    @DisplayName("Teste do método para obter a data")
    @Test
    public void testGetData(){
        String data = b.getData();
        assertEquals("10/10/2020", data);
    }
    
    @DisplayName("Teste do método para obter valor pago")
    @Test
    public void testGetValorPago(){
        double valorPago = b.getValorPago();
        assertEquals(500.0, valorPago);
    }
    
    @DisplayName("Teste do método para definir o código")
    @Test
    public void testSetCodigo(){
        b.setCodigo(123426);
        int codigo = b.getCodigo();
        assertEquals(123426, codigo);
    }
    
    @DisplayName("Teste do método para definir a data")
    @Test
    public void testSetData(){
        b.setData("12/10/2020");
        String data = b.getData();
        assertEquals("12/10/2020", data);
    }
    
    @DisplayName("Teste do método para definir valor pago")
    public void testSetValorPago(){
        b.setValorPago(400.0);
        double valorPago = b.getValorPago();
        assertEquals(400.0, valorPago);
    }
    
    @AfterEach
    public void tearDown() {
        b = null;
    }
}
