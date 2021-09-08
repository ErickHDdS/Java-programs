/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick2;

import principalErick1.Forma;
import principalErick1.FormaTridimensional;

import principalErick1.Esfera;
import principalErick1.Cubo;
import principalErick1.TetraedroRegular;
import principalErick1.TrataFormas;

/**
 *
 * @author erick
 */
public class Teste2 
{
    public static void main(String[] args) 
    {
        Forma[] formas = new Forma[6];
        
        formas[0] = new Quadrado2(4, 4); // COMPRIMENTO E LARGURA
        formas[1] = new Circulo2(8); // DIAMETRO DO CIRCULO
        formas[2] = new Triangulo2(9, 4); //BASE E ALTURA
        formas[3] = new Cubo(3,3,3); // COMPRIMENTO , LARGURA E PROFUNDIDADE
        formas[4] = new Esfera(8); // DIAMETRO DA ESFERA
        formas[5] = new TetraedroRegular(9); //ARESTA

        TrataFormas trataFormas = new TrataFormas();
        
        trataFormas.calculandoAreaEVolume(formas);
        
        
        //IMPRIMINDO 
        for (int i = 0; i < 6; i++) 
        {
            System.out.println("A Forma " + formas[i].getClass().getSimpleName() + " É DA CLASSE: " + formas[i].getClass().getSuperclass().getSimpleName());
                        
            if(formas[i] instanceof FormaBidimensional2)
            {
                System.out.println("AREA: "+(((FormaBidimensional2) formas[i]).obterArea()));
                try 
                {
                    
                    ((FormaBidimensional2) formas[i]).obterVolume();
                } 
                catch (NaoExisteVolumeException ex) 
                {
                    System.out.println(ex.getMessage());
                }
            }
            
            else
            {
                System.out.println("AREA: "+(((FormaTridimensional) formas[i]).obterArea()));
                System.out.println("VOLUME: "+(((FormaTridimensional) formas[i]).obterVolume()));
            }
                
                System.out.println("");

        }
        
    }
}
