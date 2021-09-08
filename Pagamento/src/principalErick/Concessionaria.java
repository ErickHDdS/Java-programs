/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.Random;

/**
 *
 * @author erick
 */
public class Concessionaria extends Conta {

    public Concessionaria(int dia, int mes) {
    super(dia, mes);
    }
    
    @Override
    public double getValorAPagar() 
    {
        Random gerador = new Random();

        this.valor = gerador.nextDouble() + gerador.nextInt(100);
       return this.valor;
    }
}
