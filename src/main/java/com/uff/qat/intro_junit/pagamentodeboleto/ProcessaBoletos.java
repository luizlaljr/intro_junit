/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.qat.intro_junit.pagamentodeboleto;

import java.util.List;

/**
 *
 * @author luizlaljr
 */
public class ProcessaBoletos {
    
       private Fatura fatura;
       private List<Boleto> boletos;

    public ProcessaBoletos(Fatura fatura, List<Boleto> boletos) {
        this.fatura = fatura;
        this.boletos = boletos;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }
       
    public boolean processarPagamento() {
        boolean estaPaga = false;
        double soma = 0;
        for(Boleto b : boletos){
            soma += b.getValorPago();
        }
        if(soma >= fatura.getTotal())
            estaPaga = true;
        return estaPaga;
    }  
    
}
