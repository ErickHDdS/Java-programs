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
public class AssalariadoComissionado extends Empregado
{
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }
    
    @Override
    public double getValorAPagar() {
        this.salario = ((Empregado.c.SALARIO*0.1) + (Empregado.c.SALARIO) + (this.valorVendas * 0.06));
        return this.salario;
    }   
}
