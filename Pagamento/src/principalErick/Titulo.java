/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author erick
 */
public class Titulo extends Conta {
    
    public Titulo(int dia, int mes) {
    super(dia, mes);
    }
    
    @Override
    public double getValorAPagar() 
    {
        Random gerador = new Random();
        this.valor = gerador.nextDouble() + gerador.nextInt(100);
        
        int diasAtrasados = 0 ;
        //Date data = new Date();
    	Calendar cal = Calendar.getInstance();
    	//cal.setTime(data);
    	int day = cal.get(Calendar.DAY_OF_MONTH);
    	int month = cal.get(Calendar.MONTH) +1;
        
        if(month > this.mes)
        {
            if(day < this.dia)
            {
                day+=30.0;
                diasAtrasados = day-this.dia;
            }
            else
            {
                diasAtrasados = day - this.dia + 30;
            }
        }
        else
        {
                if(month == this.mes)
                {
                    if(day > this.dia)
                    {
                        diasAtrasados = day - this.dia;
                    }
                    else
                        diasAtrasados = 0;
                }
        
        if(diasAtrasados !=0)
        {
            this.valor = this.valor + this.valor*(0.10);
        } 
            }
            
       return this.valor;
    }
    
}
