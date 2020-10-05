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
public class Boleto {
    
    private int codigo;
    private String data;
    private double valorPago;

    public Boleto(int codigo, String data, double valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

}
