/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaErick;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class TesteAgenda {
    
    public static void main(String[] args)
    {
        Semana semana = new Semana();
        
        Compromisso c1 = new Compromisso(2,"Médico");     //09:00 SEGUNDA FEIRA
        Compromisso c2 = new Compromisso(1, "Dentista"); //14:00 SEGUNDA FEIRA
        Compromisso c3 = new Compromisso(4, "Reunião");   //13:00 SEXTA FEIRA
        Compromisso c4 = new Compromisso(2, "Almoço");    //12:00 QUARTA FEIRA
        
        //INSERIR OS COMPROMISSOS
        semana.adicionarCompromisso(c1,"Segunda-feira",9);
        semana.adicionarCompromisso(c2,"Segunda-feira",14);
        semana.adicionarCompromisso(c3,"Sexta-feira",13);
        semana.adicionarCompromisso(c4,"Quarta-feira",12);
              
        System.out.println("BEM VINDO AO SISTEMA DE AGENDA");
        Scanner leitor = new Scanner(System.in);
        
        boolean loop = true;
        while(loop = true)
        {
            System.out.println("\n\nDIGITE A OPÇÃO DESEJADA:\n1-INSERIR COMPROMISSO\n2-LISTAR SEMANA\n3.SAIR ");
            int opcao = leitor.nextInt();
            
            if(opcao == 1)//INSERINDO COMPROMISSOS USUARIO
            {
                String descricao,diaDaSemana;
                int horario, duracao;
                boolean resposta;

                System.out.println("DESCRIÇÃO: "); descricao = leitor.next();
                System.out.println("DURAÇÃO: "); duracao = leitor.nextInt();
                System.out.println("HORARIO: "); horario = leitor.nextInt();
                while(horario <9 || horario>=19-duracao)
                {
                    System.out.println("DIGITE UM HORÁRIO VALIDO DENTRO DO NOSSO HORÁRIO DE ATENDIMENTO\n09:00 às 18:00");
                    horario = leitor.nextInt();
                }
                System.out.println("DIGITE O DIA DA SEMANA: \nSegunda-feira\nTerça-feira\nQuarta-feira\nQuinta-feira\nSexta-feira"); 
                diaDaSemana = (leitor.next());
                Compromisso c5 = new Compromisso(duracao, descricao);

                //VERIFICANDO SE PODE SER NO HORARIO ESCOLHIDO
                resposta = semana.verificandoDisponibilidade(diaDaSemana, horario, duracao);

                if(resposta == true) //HORARIO LIVRE
                {
                    semana.adicionarCompromisso(c5, diaDaSemana, horario);
                    System.out.println("AGENDADO!");
                }
                else
                {
                    System.out.println("PARECE QUE ESSE HORÁRIO VOCÊ JÁ POSSUI OUTRO COMPROMISSO, LOGO ESSE COMPROMISSO NÃO PODE SER AGENDADO");
                }    
            }

            if(opcao == 2)
            {
               // System.out.println("DIA DA SEMANA\tDESCRIÇÃO\tHORÁRIO\t\tDURAÇÃO");
                Set<String> dias = semana.getDiasSemana().keySet();
                Iterator<String> it_dias = dias.iterator();
                
                while(it_dias.hasNext())
                {
                    String aux = it_dias.next();
                    System.out.println("\n"+semana.getDiasSemana().get(aux).getNome());
                    Set<Integer> compromissos = semana.getDiasSemana().get(aux).getCompromissoDia().keySet();
                    Iterator<Integer> it_compromissos = compromissos.iterator();
                    
                    while(it_compromissos.hasNext())
                    {
                        Integer aux2 = it_compromissos.next();
                        /*System.out.print("\r\t\t"+semana.getDiasSemana().get(aux).getCompromissoDia().get(aux2).getDescricao()+
                                         "\t\t"+aux2+":00 hr"+
                                         "\t"+semana.getDiasSemana().get(aux).getCompromissoDia().get(aux2).getDuracao()+":00 hr");
                        */
                        System.out.print(semana.getDiasSemana().get(aux).getCompromissoDia().get(aux2).getDescricao()+
                                         " às "+aux2+":00 hr"+
                                         " até "+(semana.getDiasSemana().get(aux).getCompromissoDia().get(aux2).getDuracao()+aux2)+":00 hr");
                        if(it_compromissos.hasNext() != true)
                            System.out.println("\n");
                        else
                            System.out.println("");
                    }
                }
            }
            
            if(opcao == 3)
            {
               loop = false;
               break;
            }
                
        }
        
        
    }
    
}
