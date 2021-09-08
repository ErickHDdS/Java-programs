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
public class Promocao {
    private Produto produtoPromo;
    private double desconto;

        
    public Promocao(Produto produtoPromo, double desconto) {
        this.produtoPromo = produtoPromo;
        this.desconto = desconto;
    }

    public Produto getProdutoPromo() {
        return produtoPromo;
    }

    public void setProdutoPromo(Produto produtoPromo) {
        this.produtoPromo = produtoPromo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void descontando(Produto produtoPromo, double desconto)
    {
        double percentual = (desconto*(-1))/10 ;
        double valor = produtoPromo.getPreco();
        valor = valor + percentual;
        
            produtoPromo.setPreco(valor);
    }
}
