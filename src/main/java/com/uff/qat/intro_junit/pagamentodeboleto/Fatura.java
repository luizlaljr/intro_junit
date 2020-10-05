/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

/**
 *
 * @author luizlaljr
 */
public class Fatura {
    
    private String nome;
    private double total;
    private String data;
    
    public Fatura(String nome, double total, String data){
        this.nome = nome;
        this.total = total;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data){
        this.data = data;
    }
    
}
