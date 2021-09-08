/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo;

import java.util.ArrayList;
import java.util.Random;

/**
 *  NOMES:
 *  BRUNA GOMES CAMILO
 *  ERICK HENRIQUE DUTRA DE SOUZA
 *  LEONARDO MENDES DE ARAÚJO
 */
public class Corrida 
{
    private String enderecoInicial;
    private String enderecoFinal;
    private double valorCorrida;
    private ArrayList<Passageiro> passageiros;

    public Corrida(String enderecoInicial, String enderecoFinal, double valorCorrida) {
        this.enderecoInicial = enderecoInicial;
        this.enderecoFinal = enderecoFinal;
        this.valorCorrida = valorCorrida;
        this.passageiros = new ArrayList<>();
    }
    
    public String getEnderecoInicial() {
        return enderecoInicial;
    }

    public void setEnderecoInicial(String enderecoInicial) {
        this.enderecoInicial = enderecoInicial;
    }

    public String getEnderecoFinal() {
        return enderecoFinal;
    }

    public void setEnderecoFinal(String enderecoFinal) {
        this.enderecoFinal = enderecoFinal;
    }

    public double getValorCorrida() {
        return valorCorrida;
    }

    public void setValorCorrida(double valorCorrida) {
        this.valorCorrida = valorCorrida;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    
    public double defineValorCorrida() {
        double valor = 0.0;
        Random gerador = new Random();
        valor = 100 * gerador.nextDouble();
        return valor;
    }
        
    public double calcularRepasseMotorista(double faturamento) {
        return (70 * faturamento) / 100;
    }
}
