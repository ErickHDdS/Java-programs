/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ingresso 
{
    private double valor;
    public Filme filme;

    public Ingresso(double valor, Filme filme) {
        this.valor = valor;
        this.filme = filme;
    }
    
    public Ingresso(Filme filme) 
    {
        valor = 0.0;
        this.filme = filme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    /*
    public int calcularPrecoTotal()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE QUANTOS INGRESSOS: ");
        int quantidade = input.nextInt();
        int capacidadeFinal;
        
        if(quantidade <= this.filme.getSala().getCapacidade())
        {
            capacidadeFinal = (this.filme.getSala().getCapacidade()) - quantidade;
            this.filme.getSala().setCapacidade(capacidadeFinal);
            this.setQuantIngresso(quantidade);
            this.setValor(this.quantIngresso * this.filme.getPrecoIngresso());
            
            System.out.println("FILME : "+this.filme.getTitulo());
            System.out.printf("\nQUANT. %d\tVALOR UNIT. :R$ %.2f\tVALOR TOTAL: R$ %.2f",this.quantIngresso,this.filme.getPrecoIngresso(),this.valor);
            return quantidade;
        } 
        else 
            System.out.println("SALA LOTADA");
        
        return 0;
    }*/
   
}
