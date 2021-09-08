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
public class Musica {
    private String nome;
    private double tempo;
    private Danca danca;
    
    public Musica(String nome, double tempo)
    {
        this.nome = nome;
        this.tempo = tempo;
        this.danca = null;
    }

    public Musica() 
    {
        nome = "";
        tempo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public Danca getDanca() {
        return danca;
    }

    public void setDanca(Danca danca) {
        this.danca = danca;
    }
    
    public void chamandoDanca(Danca danca, int[] vetor)
    {
        this.setDanca(danca);
        JOptionPane.showMessageDialog(null, "PARES: ");
        danca.dancando(vetor);
    }
}
