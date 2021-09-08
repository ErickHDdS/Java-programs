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
public class Item 
{
    private Produto produto;
    private int quantidade;
    private double valorTotalItem;

    public Item() 
    {
        produto = new Produto();
        quantidade = 0;
        valorTotalItem = 0.0;
    }
    
    public Item(Produto produto, int quantidade)
    {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalItem = valorTotalItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }
    
    public void valorTotalItem()
    {
        double preco;
        preco = this.getQuantidade()*this.getProduto().getValorUnitario();
        this.setValorTotalItem(preco);
    }
    
    
}
