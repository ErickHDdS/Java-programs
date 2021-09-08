/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author erick
 */



public class Caixa {
    
    public static void main(String args[])
    {
        int quantDeVolumes = 2;
        Scanner leitor = new Scanner(System.in);
        
        Produto[] produtos = new Produto[quantDeVolumes];
        
        for(int i=0; i<quantDeVolumes; i++)
        {
            
            produtos[i] = new Produto();
          //  String inputCodigo = JOptionPane.showInputDialog("CODIGO PRODUTO:");
            String imprimaMensagemCodigo = String.format("CODIGO DO PRODUTO %d:",(i+1));
            String inputCodigo = JOptionPane.showInputDialog(imprimaMensagemCodigo,(i+1));
            int codigo = Integer.parseInt(inputCodigo);
            
            //System.out.println("CÓDIGO PRODUTO: "+ (i+1));
            produtos[i].setCodigo(codigo);
            
            String imprimaMensagemDescricao = String.format("DESCRICAO DO PRODUTO %d:",(i+1));
            String inputDescricao = JOptionPane.showInputDialog(imprimaMensagemDescricao,(i+1));
            //System.out.println("DESCRIÇÃO PRODUTO: "+ (i+1));
            produtos[i].setDescricao(inputDescricao);
            produtos[i].setPreco(i+10);
        }
        
        
        Item[] item = new Item[quantDeVolumes];
        for(int i=0; i<quantDeVolumes; i++)
        {
            item[i] = new Item();
            item[i].setProduto(produtos[i]);
            
            String imprimaMensagemQuantidade = String.format("QUANTIDADE DO PRODUTO %d:",(i+1));
            String inputQuantidade = JOptionPane.showInputDialog(imprimaMensagemQuantidade,(i+1));
            int quantidade = Integer.parseInt(inputQuantidade);
            
            //System.out.println("QUANTIDADE DO PRODUTO: "+ (i+1));
            //int verificarQuantidade = leitor.nextInt();
            if(quantidade >0 && quantidade <= quantDeVolumes)
            {
                item[i].setQuantidade(quantidade);
            }
            else
            {
                String imprimaMensagemErroQuantidade = String.format("ERRO NA QUANTIDADE DO PRODUTO!\nPRODUTO %s FOI EXCLUIDO DO CARRINHO",item[i].getProduto().getDescricao());
                JOptionPane.showMessageDialog(null,imprimaMensagemErroQuantidade);
                //System.out.println("ERRO NA QUANTIDADE DO PRODUTO, PRODUTO "+ item[i].getProduto().getDescricao()+" EXCLUÍDO DO CARRINHO");
                item[i].setQuantidade(0);
            }
        }     
        
         Carrinho carrinhoDeCompras = new Carrinho(quantDeVolumes);
         
         for(int i=0; i<quantDeVolumes; i++)
        {
            carrinhoDeCompras.setCarrinho(item);
        }
        
         // APLICANDO O DESCONTO
         int desconto;
         desconto = JOptionPane.showConfirmDialog(null,"DESCONTO","APLICAR DESCONTO?",JOptionPane.YES_NO_OPTION);
         
         if(desconto == 0)//SIM
         {      
                String imprimaMensagemDesconto = String.format("PRODUTO QUE TERÁ DESCONTO:");
                String inputDesconto = JOptionPane.showInputDialog(imprimaMensagemDesconto);
                int produtoDesconto = Integer.parseInt(inputDesconto);
                
                //System.out.println("PRODUTO QUE TERÁ DESCONTO: ");
                //int produtoEscolhidoParaDesconto = leitor.nextInt();
                String percentual = String.format("DESCONTO DE: %%");
                String percentualDesconto = JOptionPane.showInputDialog(percentual);
                
                //System.out.println("DESCONTO DE: X% ");
                int descontoAplicado = Integer.parseInt(percentualDesconto);
                Promocao promocao = new Promocao(produtos[produtoDesconto-1], descontoAplicado);
                promocao.descontando(produtos[produtoDesconto-1], descontoAplicado);

                System.out.println("PRODUTO: "+produtos[produtoDesconto-1].getDescricao() + " PREÇO UNITÁRIO: "+produtos[produtoDesconto-1].getPreco());
         }
         
         //SOMANDO A COMPRA
         JOptionPane.showMessageDialog(null, "SUPERMERCADOS SOCORROCEFET");
        // System.out.println("\nSUPERMERCADOS SOCORROCEFET\n");
         int valorTotalDoCarrinho = 0;
         for(int i=0; i<quantDeVolumes; i++)
         {
            valorTotalDoCarrinho+=carrinhoDeCompras.somandoACompra(i);
         }
         String valorTotalCompra = String.format("VALOR TOTAL DA COMPRA: %d DINHEIRUS",valorTotalDoCarrinho);
         //System.out.println("VALOR TOTAL DA COMPRA: "+valorTotalDoCarrinho + " DINHEIRUS");
         JOptionPane.showMessageDialog(null,valorTotalCompra);
    }    
    
}
