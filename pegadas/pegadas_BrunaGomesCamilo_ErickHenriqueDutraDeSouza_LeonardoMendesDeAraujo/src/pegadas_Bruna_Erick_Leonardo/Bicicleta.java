package pegadas_Bruna_Erick_Leonardo;

public class Bicicleta implements PegadaDeCarbono
{
    private double emissao;

    public Bicicleta() 
    {
        this.emissao = 0;
    }
    
    @Override
    public double getPegadaDeCarbono() 
    {
        return this.emissao;
    }
    
    @Override
    public String toString()
    {
        return ("A Bicicleta não possui nenhuma pegada de carbono :D");
    }
}
