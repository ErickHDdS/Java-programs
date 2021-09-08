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
public class Pessoa 
{
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome) {
        this.nome = null;
        this.pai = null;
        this.mae = null;
    }
        
    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
   
    public boolean ehSemanticamenteIgual(Pessoa pessoa)
    {
        if(pessoa.getMae().getNome().equals(null) || pessoa.getNome().equals(null))
        {
            return false;
        }
        if(pessoa.getMae().getNome().equals(this.mae.nome) && pessoa.getNome().equals(this.nome)) 
        {
            return true;
        }
       
        return false;
    }
    
    public boolean ehIrmaos(Pessoa pessoa)
    {
        if(pessoa.getMae()==null || this.mae == null)
        {
            if(pessoa.getPai().getNome().equals(this.pai.nome))
            {
                return true;
            }
            return false;
        }
        
        if(pessoa.getPai() == null || this.pai == null)
        {
            if(pessoa.getMae().getNome().equals(this.mae.nome))
            {
                return true;
            }
            return false;
        }
        if(pessoa.getMae().getNome().equals(this.mae.nome) || pessoa.getPai().getNome().equals(this.pai.nome)) 
        {
            return true;
        }

        return false;
    }
    
    public boolean ehAntecessor(Pessoa pessoa)
    {
        if(this.pai== null)
        {
            if(pessoa.getNome().equals(this.mae.getNome()) || pessoa.getNome().equals(this.mae.mae.getNome()) )
                    return true;
            else
                return false;
        }

        else if(this.mae == null)
        {
            if(pessoa.getNome().equals(this.pai.getNome()) || pessoa.getNome().equals(this.pai.pai.getNome()))
            {
                return true;
            }
            else
                return false;
        }
       
        
        
        if(pessoa.getNome().equals(this.mae.nome) || pessoa.getNome().equals(this.pai.nome) || 
           pessoa.getNome().equals(this.mae.mae.nome) || pessoa.getNome().equals(this.pai.pai.nome))
        {
            return true;
        }
        return false;
    }
    
    public void imprimirarvore(Pessoa[] pessoas)
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("\nNOME: "+pessoas[i].getNome());
            if(pessoas[i].getMae() != null)
            {
               System.out.println("MÃE: "+pessoas[i].getMae().getNome());
            }
            if(pessoas[i].getPai() != null)
            {
                System.out.println("PAI: "+pessoas[i].getPai().getNome());
            }
            //if(pessoas[i].getMae() != null || pessoas[i].getPai() != null)
            //JOptionPane.showMessageDialog(null, "NOME: "+pessoas[i].getNome() + "\nPAI: "+pessoas[i].getPai().getNome()+"\nMAE: "+pessoas[i].getMae().getNome());
            //else
            //{
            //    JOptionPane.showMessageDialog(null, "NOME: "+pessoas[i].getNome() + "\nNÃO FOI CADASTRADO OS OUTROS DADOS NA MEMÓRIA");
            //}
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
}
