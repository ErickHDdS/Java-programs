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
public abstract class Empregado implements Pagavel {
    protected String nome;
    protected String sobrenome;
    protected int numIdent;
    protected double salario;
    protected double horasTrabalhadas;
    protected double valorVendas; 

    public Empregado(String nome, String sobrenome, int numIdent) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
        this.salario = 0.0;
        this.horasTrabalhadas = 0;
        this.valorVendas = 0;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(int numIdent) {
        this.numIdent = numIdent;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
}
