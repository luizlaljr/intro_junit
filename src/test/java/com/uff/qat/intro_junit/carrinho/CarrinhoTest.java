/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.carrinho;

import com.uff.qat.intro_junit.produto.Produto;
import com.uff.qat.intro_junit.produto.ProdutoNaoEncontradoException;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *
 * @author luizlaljr
 */
@DisplayName("Classe de Teste da classe Carrinho")
public class CarrinhoTest {
    
    private static Carrinho car;
    
    @BeforeAll
    public static void inicializa(){
        car = new Carrinho();
        
    }
    
    @DisplayName("Teste do método que adiciona item")
    @Test
    public void testAddItem(){
        Produto p = new Produto("Arroz", 100.0);
        car.addItem(p);
        int qtdItens =  car.getQtdeItems();
        assertEquals(1, qtdItens);
    }
    
    @DisplayName("Teste do método que conta a quantidade de items")
    @Test
    public void testGetQtdItems(){
        int qtdItems = car.getQtdeItems();
        assertEquals(2, qtdItems);
    }
    
    @DisplayName("Teste do método que obtem o valor total")
    @Test
    public void testGetValorTotal(){
        Produto p = new Produto("Feijao", 50.0);
        car.addItem(p);
        double total = car.getValorTotal();
        assertEquals(150.0, total);
    }
    
    @DisplayName("Teste do método que remove item")
    @Test
    public void testRemoveItem(){
        Produto p = new Produto("Feijao", 50.0);
        try {
            car.removeItem(p);
            int qtdItems = car.getQtdeItems();
            assertEquals(1, qtdItems);
        } catch (ProdutoNaoEncontradoException ex) {
            System.out.println("Erro no teste");
        }
    }
    
    @DisplayName("Teste do lançamento de excessão do método que remove item")
    @Test
    public void testRemoveItemNaoEncontrado(){
        Produto p = new Produto("Feijao", 50.0);
        assertThrows(ProdutoNaoEncontradoException.class, () -> car.removeItem(p));
    }
    
    @DisplayName("Teste do método que esvazia o carrinho")
    @Test
    public void testEsvazia(){
        car.esvazia();
        int qtdItems = car.getQtdeItems();
        assertEquals(0, qtdItems);
    }
    
    @AfterAll
    public static void finaliza(){
        car = null;
    }
}
