/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author luizlaljr
 */
public class ProcessaBoletosTest {
    
    private ProcessaBoletos pb;
    private Fatura f;
    private List<Boleto> boletos;
    
    @BeforeEach
    public void setUp() {
        f = new Fatura("Luiz", 1000.0, "10/10/2020");
        boletos = new ArrayList<Boleto>();
        Boleto b1 = new Boleto(123425,"10/10/2020",500.0);
        boletos.add(b1);
        Boleto b2 = new Boleto(123426,"10/11/2020",400.0);
        boletos.add(b2);
        Boleto b3 = new Boleto(123427,"10/12/2020",50.0);
        boletos.add(b3);
        pb = new ProcessaBoletos(f,boletos);
    }
    
    @DisplayName("Teste do método para definir a fatura")
    @Test
    public void testSetFatura(){
        f = new Fatura("Diane", 500.0, "10/11/2020");
        pb.setFatura(f);
        assertEquals(f, pb.getFatura());
    }
    
    @DisplayName("Teste do método para obter a fatura")
    @Test
    public void testGetFatura(){
        assertEquals(f, pb.getFatura());
    }
    
    @DisplayName("Teste do método para definir a lista de boletos")
    @Test
    public void testSetBoletos(){
        Boleto b = new Boleto(123428,"10/12/2020",50.0);
        boletos.add(b);
        pb.setBoletos(boletos);
        assertIterableEquals(boletos, pb.getBoletos());
    }
    
    @DisplayName("Teste do método para obter a lista de boletos")
    @Test
    public void testGetBoletos(){
        assertIterableEquals(boletos, pb.getBoletos());
    }
    
    @DisplayName("Teste do método para processar o pagamento da fatura ainda não paga")
    @Test
    public void testProcessarPagamentoFalso(){
        boolean estaPaga = pb.processarPagamento();
        assertFalse(estaPaga);
    }
    
    @DisplayName("Teste do método para processar o pagamento da fatura paga")
    @Test
    public void testProcessarPagamentoVerdadeiro(){
        Boleto b = new Boleto(123428,"10/12/2020",50.0);
        boletos.add(b);
        pb.setBoletos(boletos);
        boolean estaPaga = pb.processarPagamento();
        assertTrue(estaPaga);
    }
    
    @AfterEach
    public void tearDown() {
    }
    
}
