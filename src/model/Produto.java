
package model;


public class Produto {
    
    private int codigo = 0;
    private String descricao;
    private int quantidade = 0;
    private double custoMedio = 0;

    public Produto(String descricao, int quantidade, double custoMedio) {
        setDescricao(descricao);
        setQuantidade(quantidade);
        setCustoMedio(custoMedio);
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCustoMedio() {
        return custoMedio;
    }

    public void setCustoMedio(double custoMedio) {
        this.custoMedio = custoMedio;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }

    
    
    
}
