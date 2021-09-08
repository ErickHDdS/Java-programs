package dominio_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo;

import exception_BrunaGomesCamilo_ErickHenriqueDutraDeSouza_LeonardoMendesDeAraújo.NaoAcertouException;

public class Jogo 
{
    private int Resultado;
    private Sorteador sorteador;
    
    public Jogo() 
    {
        this.Resultado = 0;
        this.sorteador = new Sorteador();
    }
    
    public void calculando(int resposta, String operador, int PrimeiroNumero, int SegundoNumero) throws NaoAcertouException
    {
        switch(operador)
        {
            case "+":
                this.Resultado = PrimeiroNumero+SegundoNumero;
                break;
            case "-":    
                this.Resultado = PrimeiroNumero-SegundoNumero;
                break;
            case "*":    
                this.Resultado = PrimeiroNumero*SegundoNumero;
                break;
            case "/":    
                this.Resultado = PrimeiroNumero/SegundoNumero;
                break;
            case "^":    
                this.Resultado = (int) Math.pow(PrimeiroNumero, SegundoNumero);
                break;
        }
        if(this.Resultado != resposta)
           throw new NaoAcertouException();
    }
    
    public int[] sortearNumeros(String operador)
    {
        int[] vetor = new int[2];
        
        vetor[0] = sorteador.sortearNumero();
        vetor[1] = sorteador.sortearNumero();
        
        if(operador.equals("-"))
        {
            while(vetor[0] < vetor[1])
            {
                vetor[0] = sorteador.sortearNumero();
            }
        }
        
        return vetor;    
    }
    
    public String sortearOperacao()
    {
        return sorteador.sortearOperacao();
    }
}
