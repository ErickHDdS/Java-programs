package pegadas_Bruna_Erick_Leonardo;

public class Carro implements PegadaDeCarbono
{
    private double distanciaViajada;
    private double quantidadeDeCombustivel;
    private double fatorDeEmissaoDoCarro;

    public Carro(double distanciaViajada, double quantidadeDeCombustivel, double fatorDeEmissaoDoCarro) 
    {
        this.distanciaViajada = distanciaViajada;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.fatorDeEmissaoDoCarro = fatorDeEmissaoDoCarro;
    }

    @Override
    public double getPegadaDeCarbono() 
    {
        return ((this.distanciaViajada + this.quantidadeDeCombustivel) * this.fatorDeEmissaoDoCarro);
    }
    
    @Override
    public String toString()
    {
        String retorno = String.format("cálculo: distanciaViajada + quantidadeDeCombustivel) * fatorDeEmissaoDoCarro -- (CO2)\nO Carro viajou %.2f km, gastando %.2f litros de combusível, e tem emissão total de: %.2f pegadas de carbono"
                ,this.distanciaViajada,this.quantidadeDeCombustivel,+getPegadaDeCarbono());
        return retorno;
    }
}
