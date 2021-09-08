/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

/**
 *
 * @author erick
 */
public class Filme 
{
    private String titulo;
    private String genero;
    private int ano;
    private String diretor;
    private double precoIngresso;    
    private Sala sala;

    public Filme(String titulo, String genero, int ano, String diretor, double precoIngresso, Sala sala) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.diretor = diretor;
        this.precoIngresso = precoIngresso;
        this.sala = sala;

    }

    public Filme() 
    {
        titulo = "";
        genero = "";
        ano = 0;
        diretor = "";
        precoIngresso = 0;        
        sala = new Sala();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
   
}
