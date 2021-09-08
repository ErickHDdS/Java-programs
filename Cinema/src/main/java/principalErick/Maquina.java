/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author erick
 */
public class Maquina 
{
    public ArrayList<Sala> salas;
    private ArrayList<Filme> filmes;
    private Ingresso ingresso;
    private int quantIngresso;


    public Maquina(ArrayList<Sala> salas, ArrayList<Filme> filmes, Ingresso ingresso, int quantIngresso) {
        this.salas = salas;
        this.filmes = filmes;
        this.ingresso = ingresso;
        this.quantIngresso = quantIngresso;
    }

    public Maquina() 
    {
        salas = new ArrayList<Sala>();
        filmes = new ArrayList<Filme>();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public int getQuantIngresso() {
        return quantIngresso;
    }

    public void setQuantIngresso(int quantIngresso) {
        this.quantIngresso = quantIngresso;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void adicionarSalas(Sala sala)
    {
        this.salas.add(sala);
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
    
    public Sala salasDisponiveis()
    {
        Iterator<Sala> itSala = salas.iterator();
        Sala aux = new Sala();
        while(itSala.hasNext())
        {
            aux = itSala.next();
        }
        return aux;
    }   
    
    public Sala procurandoSala(int num)
    {
        Iterator<Sala> itSala = salas.iterator();
        while(itSala.hasNext())
        {
            Sala aux = itSala.next();
            if(aux.getNumero() == num)
            {
                return aux;
            }
        }
        return null;
    }    
    
    public void adicionarFilmes(Filme filme)
    {
        this.filmes.add(filme);
    }
    
    public Filme procurandoFilme(int num)
    {
        Iterator<Filme> itFilme = filmes.iterator();
        while(itFilme.hasNext())
        {
            Filme aux = itFilme.next();
            if(aux.getSala().getNumero() == num)
            {
                return aux;
            }
        }
        return null;
    }
    
    public void listar()
    {
        Iterator<Filme> itFilme = filmes.iterator();
        while(itFilme.hasNext())
        {
            Filme aux = itFilme.next();
            System.out.println("\nTITULO :"+aux.getTitulo());
            System.out.println("SALA :"+aux.getSala().getNumero());
            System.out.println("GENERO :"+aux.getGenero());
            System.out.println("ANO :"+aux.getAno());
            System.out.println("DIRETOR :"+aux.getDiretor());
        }
    }
    
    public void listarpreco()
    {
        Iterator<Filme> itFilme = filmes.iterator();
        while(itFilme.hasNext())
        {
            Filme aux = itFilme.next();
            System.out.println("FILME :"+aux.getTitulo());
            System.out.printf("PREÇO DO INGRESSO : R$ %.2f\n",aux.getPrecoIngresso());
        }
    }
    
     public int calcularPrecoTotal(Ingresso ingresso)
    {
        setIngresso(ingresso);
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE QUANTOS INGRESSOS: ");
        int quantidade = input.nextInt();
        int capacidadeFinal;
        
        if(quantidade <= ingresso.filme.getSala().getCapacidade())// this.filme.getSala().getCapacidade())
        {
            capacidadeFinal = (ingresso.filme.getSala().getCapacidade()-quantidade); //this.filme.getSala().getCapacidade()) - quantidade;
            ingresso.filme.getSala().setCapacidade(capacidadeFinal);//this.filme.getSala().setCapacidade(capacidadeFinal);
            setQuantIngresso(quantidade);
            
            this.setQuantIngresso(quantidade);
            ingresso.setValor(this.quantIngresso*ingresso.filme.getPrecoIngresso());
            
            System.out.println("FILME : "+ingresso.filme.getTitulo());
            System.out.printf("\nQUANT. %d\tVALOR UNIT. :R$ %.2f\tVALOR TOTAL: R$ %.2f",this.quantIngresso,ingresso.filme.getPrecoIngresso(),ingresso.getValor());
            return quantidade;
        } 
        else 
            System.out.println("SALA LOTADA");
        
        return 0;
    }
}
