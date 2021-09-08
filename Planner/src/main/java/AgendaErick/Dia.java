/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaErick;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author erick
 */
public class Dia {
    private String nome;
    private HashMap<Integer,Compromisso> compromissoDia;//HORARIO,COMPROMISSO
    private Hora[] horas;

    public Dia() {
        nome = "";
        compromissoDia = new HashMap<>();
        horas = new Hora[10];
        for(int i=0; i<10; i++)
        {
            horas[i] = new Hora();
            horas[i].setHora(i+9);
        }
    }

    public HashMap<Integer, Compromisso> getCompromissoDia() {
        return compromissoDia;
    }

    public void setCompromissoDia(HashMap<Integer, Compromisso> compromissoDia) {
        this.compromissoDia = compromissoDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hora[] getHoras() {
        return horas;
    }

    public void setHoras(Hora[] horas) {
        this.horas = horas;
    }
    
    public void marcandoCompromisso(HashMap<Integer,Compromisso> compromisso)
    {
        Set <Integer> chaves = compromisso.keySet();
        int loop = chaves.size(), aux = 0, duracao;
        Iterator<Integer> it = chaves.iterator();
            while(it.hasNext())
            {
                for(int i=0; i<loop;i++)
                {
                    aux = it.next();
                }
                Compromisso c = new Compromisso(compromisso.get(aux).getDuracao(),compromisso.get(aux).getDescricao());
                compromissoDia.put(aux,c);
                for(int i = 0; i< 10; i++)
                {
                    if(horas[i].getHora() == aux)
                    {
                        duracao = c.getDuracao();
                        for(int j = 0; j<duracao; j++, i++)
                        {
                            Compromisso c_aux = new Compromisso(1,compromisso.get(aux).getDescricao());
                            horas[i].setCompromisso(c_aux);
                        }
                        i=10; 
                    }
                    
                }
                
            }
    }
    
    public boolean verificandoDisponibilidade(int hora, int duracao)
    {        
        for(int i=0; i<10; i++)
        {
            if(horas[i].getHora() == hora)
            {
                for(int j=0; j<duracao;j++)
                {
                    if(horas[i].getCompromisso().getDuracao() == 0)
                    {
                        i++;
                    }
                    else
                        return false;
                }
            }
        }
        return true;
    }  
}
