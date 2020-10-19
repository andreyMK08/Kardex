
package model;

import java.util.Date;


public class Saida extends Kardex{
    
    private Cliente cliente;
    
    public Saida(Date data, int qtde, double valor, Cliente cliente) {
        super(data, qtde, valor);
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Saida{" + "cliente=" + cliente + '}';
    }
    
    
}
