/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo;

/**
 *  NOMES:
 *  BRUNA GOMES CAMILO
 *  ERICK HENRIQUE DUTRA DE SOUZA
 *  LEONARDO MENDES DE ARAÚJO
 */
public class Motorista 
{
    private String nome;
    private double faturamento;
    private Veiculo veiculo;

    public Motorista(String nome, double faturamento, Veiculo veiculo) {
        this.nome = nome;
        this.faturamento = faturamento;
        this.veiculo = veiculo;
    }

    public Motorista(String nome, Veiculo veiculo) {
        this.nome = nome;
        faturamento = 0.0;
        this.veiculo = veiculo;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void atualizaFaturamento(double valor)
    {
        this.faturamento += valor; 
    }
    
}
