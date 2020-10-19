/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author andre_000
 */
public abstract class Kardex {
    
    private int codigo =0;
    private Date data;
    private int qtde = 0;
    private double valor = 0;

    public Kardex(Date data, int qtde, double valor) {
        setData(data);
        setQtde(qtde);
        setValor(valor);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Kardex{" + "codigo=" + codigo + ", data=" + data + ", qtde=" + qtde + ", valor=" + valor + '}';
    }
    
    
    
}
