package pegadas_Bruna_Erick_Leonardo;

import java.util.ArrayList;
import java.util.Iterator;

public class PegadaDeCarbonoTeste 
{
    public static void main(String[] args) 
    {
        
        ArrayList<PegadaDeCarbono> pegadasDeCarbono = new ArrayList<>();
        
        pegadasDeCarbono.add(new Predio(15, 37.4, 57.8, 85.3, 12.2));
        pegadasDeCarbono.add(new Carro(257.7, 25.8, 14.1));
        pegadasDeCarbono.add(new Bicicleta());

        //ITERANDO
        Iterator<PegadaDeCarbono> iterando = pegadasDeCarbono.iterator();
        while(iterando.hasNext())
        {
            PegadaDeCarbono pegadasDeCarbono_aux = iterando.next();
            System.out.println(pegadasDeCarbono_aux);
            System.out.println("");
        }
    }
}
