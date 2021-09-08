/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

/**
 *
 * @author erick
 */
public class Assalariado extends Empregado {

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }
    
    @Override
    public double getValorAPagar() {
        
        if(this.horasTrabalhadas < 40)
        {
            this.salario = Empregado.c.SALARIO;
            return this.salario;
        }
        else
        {
            this.salario = Empregado.c.SALARIO + ((this.horasTrabalhadas-40.0)*Empregado.c.HORA);
            return this.salario;            
        }
    }
}
