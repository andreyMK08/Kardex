
package model;

import java.util.Date;

public class Entrada extends Kardex {
    
    private Fornecedor fornecedor;
    
    public Entrada(Date data, int qtde, double valor, Fornecedor fornecedor) {
        super(data, qtde, valor);
        setFornecedor(fornecedor);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Entrada{" + "fornecedor=" + fornecedor + '}';
    }
    
    
}
