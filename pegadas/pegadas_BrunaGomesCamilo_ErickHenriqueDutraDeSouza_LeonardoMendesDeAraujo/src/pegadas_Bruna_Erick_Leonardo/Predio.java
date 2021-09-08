package pegadas_Bruna_Erick_Leonardo;

public class Predio implements PegadaDeCarbono
{
    private int quantidadeApartamento;
    private double quantiaTotal;
    private double fatorDeEmissaoDoPredio;
    private double valorDeAquecimento;
    private double densidade;

    public Predio(int quantidadeApartamento, double quantiaTotal, double fatorDeEmissaoDoPredio, double valorDeAquecimento, double densidade) 
    {
        this.quantidadeApartamento = quantidadeApartamento;
        this.quantiaTotal = quantiaTotal;
        this.fatorDeEmissaoDoPredio = fatorDeEmissaoDoPredio;
        this.valorDeAquecimento = valorDeAquecimento;
        this.densidade = densidade;
    }

    @Override
    public double getPegadaDeCarbono() 
    {
        return (this.quantiaTotal*(this.fatorDeEmissaoDoPredio * this.valorDeAquecimento) * this.densidade);
    }
    
    @Override
    public String toString()
    {
        String retorno = String.format("cálculo: quantiaTotal*(fatorDeEmissaoDoPredio * valorDeAquecimento) * densidade -- (CO2)\nO Prédio tem %d apartamentos, e possui uma emissão total de: %.2f pegadas de carbono",
                this.quantidadeApartamento,getPegadaDeCarbono());

        return retorno;
    }
}
