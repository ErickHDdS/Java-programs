/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Teste 
{

    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null, "VAMOS CRIAR UMA PEQUENA ÁRVORE GENEALÓGICA");
       
        Pessoa[] pessoas = new Pessoa[10];
        for(int contadorDePessoas = 0; contadorDePessoas <10; contadorDePessoas++)
        {
            pessoas[contadorDePessoas] = new Pessoa(null);
        }
        String nome = new String();
        nome = JOptionPane.showInputDialog(null,"DIGITE SEU NOME:","NOME");
        pessoas[0].setNome(nome);
        
        int opcao,limite=10;
        for(int contadorDePessoas = 0; contadorDePessoas < limite; contadorDePessoas++)
        {
            if(pessoas[contadorDePessoas].getPai() == null)
            {
                nome = JOptionPane.showInputDialog(pessoas[contadorDePessoas].getNome()+" PAI:");
                for(int i=0; i<10; i++)
                {
                    if(pessoas[i].getNome()== null)
                    {
                        pessoas[i].setNome(nome);
                        limite--;
                        pessoas[contadorDePessoas].setPai(pessoas[i]);
                        i=10;
                    }
                }
            }
            
            if(pessoas[contadorDePessoas].getMae() == null)
            {
                nome = JOptionPane.showInputDialog(pessoas[contadorDePessoas].getNome()+" MAE:");
                for(int i=0; i<10; i++)
                {
                    if(pessoas[i].getNome()== null)
                    {
                        pessoas[i].setNome(nome);
                        limite--;
                        pessoas[contadorDePessoas].setMae(pessoas[i]);
                        i=10;
                    }
                }
            }
            
            opcao = JOptionPane.showConfirmDialog(null,pessoas[contadorDePessoas].getNome()+" TEM IRMÃOS?","PERGUNTA",JOptionPane.YES_NO_OPTION);
            System.out.println(opcao);

            if(opcao == 0) // Sim
            {
                String Q_irmaos = JOptionPane.showInputDialog(null, "QUANTOS?","QTDE IRMÃOS");
                int Qirmaos = Integer.parseInt(Q_irmaos);
                int resp1,resp2;
                for(int contIrmaos = 0;contIrmaos< Qirmaos; contIrmaos++)
                {

        for(int i=0; i<10; i++)
                    {
                        if(pessoas[i].getNome()== null)
                        {
                            nome = JOptionPane.showInputDialog(null,"NOME:","NOME IRMAO");
                            pessoas[i].setNome(nome);
                            limite--;
                            resp1 = JOptionPane.showConfirmDialog(null,"IRMÃOS DE MESMO PAI E MAE?","IRMAO(A)",JOptionPane.YES_NO_OPTION);
                            if(resp1 == 0)
                            {
                                pessoas[i].setMae(pessoas[contadorDePessoas].getMae());
                                pessoas[i].setPai(pessoas[contadorDePessoas].getPai());
                                i=10;
                            }
                            else
                            {
                                resp2 = JOptionPane.showConfirmDialog(null,"IRMAO(A) POR PARTE DE: PAI = YES, MAE = NO","IRMAO(A)",JOptionPane.YES_NO_OPTION);
                                
                                if(resp2 == 1)
                                {
                                    pessoas[i].setMae(pessoas[contadorDePessoas].getMae());
                                    i=10;
                                }
                                else
                                {
                                    pessoas[i].setPai(pessoas[contadorDePessoas].getPai());
                                    i=10;
                                }
                            }
                            
                        }
                    }
                }
            }
            
        }
        //VERIFICANDO SE É SEMANTICAMENTE IGUAL
        String nome2 = JOptionPane.showInputDialog(null,"NOME:","VERIFICANDO IGUALDADE SEMÂNTICA");
        String nome1 = JOptionPane.showInputDialog(null,"NOME PARA VERIFICAR A IGUALDADE SEMÂNTICA COM:" + nome2,"NOME");
        boolean resposta;        
        for(int i=0; i<10; i++)
        {
            if(pessoas[i].getNome().equals(nome1))
            {
                for(int j=0; j<10; j++)
                {
                    if(pessoas[j].getNome().equals(nome2) && i!=j)
                    {
                        resposta = pessoas[i].ehSemanticamenteIgual(pessoas[j]);
                        i=j=10;
                        if(resposta==true) 
                        {
                            JOptionPane.showMessageDialog(null, "EXISTE UMA PESSOA COM O MESMO NOME E A MESMA MÃE");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "NÃO É A MESMA PESSOA, OU NÃO TEMOS DADOS SUFICIENTES");
                        }
                    }
                }
            }
        }
        
        //VERIFICANDO SE É IRMÃOS
        String nome4 = JOptionPane.showInputDialog(null,"NOME:","VERIFICANDO SE SÃO IRMÃOS");
        String nome3 = JOptionPane.showInputDialog(null,"NOME PARA VERIFICAR SE É IRMÃO COM:"+nome4, "NOME");
        for(int i=0; i<10; i++)
        {
            if(pessoas[i].getNome().equals(nome3))
            {
                for(int j=0; j<10; j++)
                {
                    if(pessoas[j].getNome().equals(nome4) && i!=j)
                    {
                       resposta = pessoas[i].ehIrmaos(pessoas[j]);
                       i=j=10;
                       if(resposta==true) 
                       {
                           JOptionPane.showMessageDialog(null, "IRMAOS");
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null, "NÃO SÃO IRMÃOS");
                       }
                    }
                }
            }
        }
        
        //VERIFICANDO ANTECESSOR
        String nome6 = JOptionPane.showInputDialog(null,"NOME:","VERIFICANDO ANTECESSOR (NETO/FILHO)");
        String nome5 = JOptionPane.showInputDialog(null, "NOME PARA VERIFICAR SE É ANTECESSOR DE :"+nome6,"NOME" );
        for(int i=0; i<10; i++)
        {
            if(pessoas[i].getNome().equals(nome6))
            {
                for(int j=0; j<10; j++)
                {
                    if(pessoas[j].getNome().equals(nome5) && i!=j)
                    {
                       resposta = pessoas[i].ehAntecessor(pessoas[j]);
                       i=j=10;
                       if(resposta==true) 
                       {
                           JOptionPane.showMessageDialog(null, "ANTECESSOR PRÓXIMO");
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null, "NÃO É ANTECESSOR");
                       }
                       
                    }
                }
            }
        }
        
        //IMPRIMINDO A ARVORE
        pessoas[0].imprimirarvore(pessoas);
        
    } 
}
