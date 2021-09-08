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
public class Aplicativo 
{
    public static void main(String[] args) {
        
        Passageiro[] passageiros = new Passageiro[4];
        passageiros[0] = new Passageiro("Bruna");
        passageiros[1] = new Passageiro("Erick");
        passageiros[2] = new Passageiro("Leonardo");
        passageiros[3] = new Passageiro("André");
        
        String[] destinos = {"BERÇARIO","CAMA","MATERNAL","ENSINO BÁSICO","ENSINO MÉDIO","CEFET","UBER"};
        Corrida[] corrida = new Corrida[6];
        Random gerador = new Random();     
   
        for (int i = 0; i < 6; i ++)//PERCORRENDO AS CORRIDAS
        {
            int quantPassageiros = gerador.nextInt(4)+1;//QUANTIDADE DE PASSAGEIROS
            ArrayList<Passageiro> passageirosEmbarcados = new ArrayList<>();
            corrida[i] = new Corrida(destinos[i],destinos[i+1],0.0);
            while(passageirosEmbarcados.size() < quantPassageiros)
            {
                int passageiro = gerador.nextInt(4);
                if(!passageirosEmbarcados.contains(passageiros[passageiro]))
                {
                    passageirosEmbarcados.add(passageiros[passageiro]);
                }
            }
            corrida[i].setPassageiros(passageirosEmbarcados);
            corrida[i].setValorCorrida(corrida[i].defineValorCorrida());
        }
        
        Veiculo hb20 = new Veiculo();
        Veiculo ka = new Veiculo();
        
        Motorista Luciana = new Motorista("Luciana",hb20);
        Motorista Sandra = new Motorista("Sandra",ka);
        Motorista motorista;

        
        double valorTotalCorrida;
        double faturamentoMotorista = 0.0;
        double faturamentoCefet = 0.0;
        System.out.println("SEJA BEM VINDO AO BANCO-UBER");
        for (Corrida c : corrida) 
        {
            
            if ((gerador.nextInt(2) + 1) % 2 == 0) 
            {
                hb20.atualizaCorrida(c);
                motorista = Luciana;
            } else 
            {
                ka.atualizaCorrida(c);
                motorista = Sandra;
            }
            valorTotalCorrida = c.getValorCorrida();
            faturamentoMotorista = c.calcularRepasseMotorista(valorTotalCorrida);
            motorista.atualizaFaturamento(faturamentoMotorista);
            faturamentoCefet = valorTotalCorrida - faturamentoMotorista;
            
            System.out.printf("\n\nVALOR TOTAL DA CORRIDA: %.2f",valorTotalCorrida);
            System.out.printf("\nMOTORISTA: "+motorista.getNome());
            System.out.printf("\nGANHOS MOTORISTA: %.2f",faturamentoMotorista);
            System.out.printf("\nGANHOS CEFET: %.2f",faturamentoCefet);
        }       
    }
}
