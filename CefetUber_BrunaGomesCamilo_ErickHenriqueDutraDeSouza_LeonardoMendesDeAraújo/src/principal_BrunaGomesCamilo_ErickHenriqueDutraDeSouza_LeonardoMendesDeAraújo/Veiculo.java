/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo;

import java.util.ArrayList;

/**
 *  NOMES:
 *  BRUNA GOMES CAMILO
 *  ERICK HENRIQUE DUTRA DE SOUZA
 *  LEONARDO MENDES DE ARAÚJO
 */
public class Veiculo 
{
    private ArrayList<Corrida> corrida;

    public Veiculo() {
        this.corrida = new ArrayList<>();
    }
    
    public ArrayList<Corrida> getCorrida() {
        return corrida;
    }

    public void setCorrida(ArrayList<Corrida> corrida) {
        this.corrida = corrida;
    }

    public void atualizaCorrida(Corrida corrida) {
        this.corrida.add(corrida);
    }
}
