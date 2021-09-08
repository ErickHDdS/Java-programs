package dominio_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo;

import java.security.SecureRandom;

public class Sorteador 
{
    SecureRandom gerador;

    public Sorteador() 
    {
        this.gerador = new SecureRandom();
    }
        
    public int sortearNumero()
    {                    
        return gerador.nextInt(101);
    }

    public String sortearOperacao()
    {
        int key;
        key = gerador.nextInt(5)+1;
        
        String operador = "";
        switch(key)
        {
            case 1:
                operador = "+";
                break;
            case 2:    
                operador = "-";
                break;
            case 3:    
                operador = "*";
                break;
            case 4:    
                operador = "/";
                break;
            case 5:    
                operador = "^";    
                break;
        }
        return operador;
    }
}
