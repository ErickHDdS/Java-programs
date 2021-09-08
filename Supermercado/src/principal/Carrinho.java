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
public class Carrinho {
    private Item[] carrinho;

    public Carrinho(int quantDeVolume) {
        
        carrinho = new Item[quantDeVolume];

    }
    
    public Carrinho(Item[] carrinho) {
        this.carrinho = carrinho;
    }

    public Item[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Item[] carrinho) {
        this.carrinho = carrinho;
    }
    
    public double somandoACompra(int posicao)
    {
        int quantidade = carrinho[posicao].getQuantidade();
        if(carrinho[posicao].getQuantidade() !=0 )
        {
            double preco = carrinho[posicao].getProduto().getPreco();
            double valor = preco*quantidade;
            System.out.println("DESCRIÇÃO: "+carrinho[posicao].getProduto().getDescricao() + " VALOR: " + valor);

            return valor;
        }
        else
            return 0;
        
    }
    
}
