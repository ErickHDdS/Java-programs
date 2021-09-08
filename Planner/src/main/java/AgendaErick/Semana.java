/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaErick;

import java.util.HashMap;
/**
 *
 * @author erick
 */

public final class Semana {
    private HashMap<String, Dia> diasSemana;
    static int QUANT_DIAS_SEMANA = 5;
    static String[] nomes = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira"};
    private HashMap<Integer,Compromisso> compromissos = new HashMap<>();

    public Semana() {
        diasSemana = new HashMap<>();
        this.nomeando();
    }

    public HashMap<String, Dia> getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(HashMap<String, Dia> diasSemana) {
        this.diasSemana = diasSemana;
    }
    
    protected void nomeando()
    {
        for(int contador = 0; contador < QUANT_DIAS_SEMANA; contador++)
        {
            diasSemana.put(nomes[contador], new Dia());
            diasSemana.get(nomes[contador]).setNome(nomes[contador]);
        }
    }
    
    public void adicionarCompromisso(Compromisso compromisso, String dia, Integer hora)
    {
        int numeroDia = numeroDoDia(dia);
        compromissos.put(hora, compromisso);
        HashMap<Integer, Compromisso> compromisso_aux = new HashMap<>();
        compromisso_aux.put(hora, compromisso);
        diasSemana.get(nomes[numeroDia]).marcandoCompromisso(compromisso_aux);
        
    }
    
    public int numeroDoDia(String dia)
    {
        int numeroDia=0;
        for(int i=0; i< QUANT_DIAS_SEMANA; i++)
        {
            if(nomes[i].equals(dia))
            {
                numeroDia = i;
                i=QUANT_DIAS_SEMANA;
            }
        }
        return numeroDia;
    }
    
    public boolean verificandoDisponibilidade(String dia, int hora, int duracao)
    {
        int numeroDia = numeroDoDia(dia);
        boolean resposta = false;

                resposta = diasSemana.get(nomes[numeroDia]).verificandoDisponibilidade(hora, duracao);
                return resposta;

    }
}