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
public class Passageiro 
{
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public Passageiro() {
        nome = "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
