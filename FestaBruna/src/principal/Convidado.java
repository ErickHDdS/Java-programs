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
public class Convidado 
{
    private String nome;
    private Convidado par;
    private String sexo;
    
    public Convidado(String nome, Convidado par, String sexo)
    {
        this.nome = nome;
        this.par = par;
        this.sexo = sexo;
    }
    
    public Convidado(String nome, String sexo)
    {
        this.nome = nome;
        this.par = null;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Convidado getPar() {
        return par;
    }

    public void setPar(Convidado par) {
        this.par = par;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void empareando(Convidado par)
    {
        if(this.getSexo()!= par.getSexo())
        {
            this.setPar(par);
            par.setPar(this);
        }
    }
}
