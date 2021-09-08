/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Carrinho 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("SEJA BEM VINDO A LOJA!\nNossos Produtos:\n");
        System.out.println("     PRODUTO: \t\t\t\t  PREÇO:");
        Produto[] produtos = new Produto[4];
        produtos[0] = new Produto("Cooler para processador",40.00);
        produtos[1] = new Produto("Mouse Gamer sem fio",70.00);
        produtos[2] = new Produto("Teclado / mouse sem fio",125.00);
        produtos[3] = new Produto("Monitor LED 24''",692.00);
        
        //imprimindo os produtos
        for(int i=0; i<4; i++)
        {
            produtos[i].listarProdutos(i+1);
        }
        
        //selecionando os produtos
        int quantItens = 4;//input.nextInt();
        Fatura fatura = new Fatura(quantItens);
        Item [] itens = new Item[quantItens];
        System.out.println("\nSelecione os itens para inserir no carrinho:\nPara finalizar aperte '0'");
        int item,quantidade;
        for(int i=0; i< quantItens; i++)
        {
            System.out.println("\nPRODUTO: ");
           // limpaBuffer();            
            item = input.nextInt();
                if(item == 0 )
                {
                    break;
                }
                while(item<1 || item>4)
                {
                    System.out.println("ITEM INEXISTENTE\nDIGITE UM ITEM VÁLIDO");
                    item = input.nextInt();
                }
            System.out.println("QUANTIDADE: ");
            quantidade = input.nextInt();
            while(quantidade <= 0)
            {
                System.out.println("QUANTIDADE INVÁLIDA\nDIGITE A QUANTIDADE DESEJADA");
                quantidade = input.nextInt();  
            }
            itens[i] = new Item(produtos[item-1],quantidade);
            fatura.adicionarItem(itens[i], i);  
        }
        
        //imprimindo fatura
        System.out.println("OBRIGADO PELA PREFERÊNCIA!");
        System.out.println("CUPOM FISCAL");
        fatura.imprimirFatura(quantItens);
    }
}
