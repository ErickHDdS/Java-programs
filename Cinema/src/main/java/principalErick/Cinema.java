/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;


import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Cinema {
    public static void main(String[] args)
    {
        int opcao;
        Scanner input = new Scanner(System.in);
        boolean option = true;
        
        Maquina maquina = new Maquina();
        
        Sala[] sala = new Sala[2];
        
        sala[0] = new Sala(01,40);
        sala[1] = new Sala(02,40);
        maquina.adicionarSalas(sala[0]);
        maquina.adicionarSalas(sala[1]);
        
        Filme filme1 = new Filme("Batata","Ação",2010,"Andre",10,sala[0]);
        Filme filme2 = new Filme("Arroz","Romance",2011,"Ana",20,sala[1]);
        maquina.adicionarFilmes(filme1);
        maquina.adicionarFilmes(filme2);
        while(option == true)
        {
            String acesso = "123ADM";
                            
            System.out.println("\nDIGITE A OPÇÃO DESEJADA");
            System.out.println("0-SAIR");
            System.out.println("1-CONSULTAR VALOR");
            System.out.println("2-ADICIONAR SALA *OPÇÃO PARA ADM*");
            System.out.println("3-ADICIONAR FILME *OPÇÃO PARA ADM*");
            System.out.println("4-LISTAR FILMES");
            System.out.println("5-COMPRAR INGRESSOS");
            
            opcao = input.nextInt();
            
            if(opcao == 0)
            {
                option = false;
                break;
            }
            
            if(opcao == 1)
            {
                maquina.listarpreco();
            }
            
            if(opcao == 2)
            {
                System.out.println("DIGITE A SENHA DE ADMINISTRADOR: ");
                String senha = input.next();//123ADM
                int num_sala,capa_sala,number;
                if(senha.equals(acesso)) {
                    System.out.println("ACESSO PERMITIDO");
                    System.out.println("DIGITE A CAPACIDADE DA SALA");
                    capa_sala = input.nextInt();
                    number = maquina.getSalas().size()+1;
                    maquina.adicionarSalas(new Sala(number,capa_sala));
                    
                } 
                else System.out.println("ACESSO NEGADO");
            }
            
            if(opcao == 3)
            {
                System.out.println("DIGITE A SENHA DE ADMINISTRADOR: ");
                String senha = input.next();//123ADM
                String titulo,genero,diretor = new String();
                int ano,num_sala;
                if(senha.equals(acesso)) {
                    System.out.println("ACESSO PERMITIDO");
                    System.out.println("DIGITE O TITULO DO FILME");
                    titulo = input.next();
                    System.out.println("DIGITE O GENERO DO FILME");
                    genero = input.next();
                    System.out.println("DIGITE O ANO DO FILME");
                    ano = input.nextInt();
                    System.out.println("DIGITE O DIRETOR DO FILME");
                    diretor = input.next();
                    Sala nova = maquina.salasDisponiveis();
                    
                    Filme filme3 = new Filme(titulo,genero,ano,diretor,30,nova);
                    maquina.adicionarFilmes(filme3);
                } 
                else System.out.println("ACESSO NEGADO");
            }
            
            if(opcao == 4)
            {
                maquina.listar();
            }
            
            if(opcao == 5)//COMPRANDO INGRESSO
            {
                int num_sala, resposta;
                System.out.println("ESCOLHA A SALA ONDE O FILME SERA EXIBITO: ");
                maquina.listar();
                num_sala = input.nextInt();
                Filme escolhido = maquina.procurandoFilme(num_sala);
                
                Ingresso ingresso = new Ingresso(escolhido);
                resposta = maquina.calcularPrecoTotal(ingresso);
                
                for(int i=1; i < resposta+1; i++)
                {
                   Sala escolhida = maquina.procurandoSala(num_sala); 
                   escolhida.addAssento(i, new Ingresso(escolhido.getPrecoIngresso(),escolhido));
                }
            }
        }
    }
}
