/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.carrinho;

import com.uff.qat.intro_junit.produto.Produto;
import com.uff.qat.intro_junit.produto.ProdutoNaoEncontradoException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author luizlaljr
 */
public class Carrinho {
    private ArrayList items;

    public Carrinho() {
        this.items = new ArrayList();
    }
    
    public double getValorTotal() {
        double valorTotal = 0.0;
        
        for (Iterator i = items.iterator(); i.hasNext();) {
            Produto item = (Produto) i.next();
            valorTotal += item.getPreco();
        }
        
        return valorTotal;
    }
    
    public void addItem(Produto item) {
        items.add(item);
    }
    
    public void removeItem(Produto item) throws ProdutoNaoEncontradoException {
        if(!items.remove(item)) {
            throw new ProdutoNaoEncontradoException();
        }
    }
    
    public int getQtdeItems() {
        return items.size();
    }
    
    public void esvazia() {
        items.clear();
    }
}
