/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author erick
 */
public class Produto 
{
    private String descricao;
    private double valorUnitario;

    public Produto() 
    {
        descricao  = null;
        valorUnitario = 0.0;
    }

    public Produto(String descricao, double valorUnitario) 
    {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public void listarProdutos(int controle)
    {
        System.out.printf("%s\t\t\tR$:%.2f\n",this.getDescricao(),this.getValorUnitario());
    } 
}
