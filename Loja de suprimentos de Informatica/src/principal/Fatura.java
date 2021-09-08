/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.PrintStream;

/**
 *
 * @author erick
 */
public class Fatura 
{
    private Item[] itens;
    private double valorTotalFatura;
    private int posicao;

    public Fatura(int quantItens) 
    {
        itens = new Item[quantItens];
        valorTotalFatura = 0.0;
        posicao = 0;
    }

    public Fatura(Item[] itens, double valorTotalFatura, int quantItens) 
    {
        this.itens = new Item[quantItens];
        this.valorTotalFatura = valorTotalFatura;
        this.posicao = 0;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public double getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(double valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }
    
    public void adicionarItem(Item item, int posicao)
    {
        if(posicao < itens.length)
        {
            this.itens[posicao] = item;
            item.valorTotalItem();
        }

    }
    
    public void imprimirFatura(int quantItens)
    {
        for(int i=0; i<quantItens && itens[i]!=null ; i++)
        {
            this.setValorTotalFatura(valorTotalFatura+itens[i].getValorTotalItem());
            System.out.printf("\n%s: %s\t\t%s: %s\t%s: R$%.2f\t%s: R$%.2f","ITEM",itens[i].getProduto().getDescricao(),"QUANTIDADE",itens[i].getQuantidade(),
                              "PREÇO UNIT",itens[i].getProduto().getValorUnitario(),"PREÇO TOTAL",itens[i].getValorTotalItem());
            
        }
        String valorTotalFatura = String.format("%.2f", this.getValorTotalFatura());
        if(this.valorTotalFatura != 0)
        {
            System.out.println("\nVALOR TOTAL DA COMPRA: R$"+valorTotalFatura);
        }
        else
            System.out.println("\nFICAMOS TRISTES EM SABER QUE NADA LHE AGRADOU ;(");
        
    }

}
