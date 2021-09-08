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
public class Comissionado extends Empregado{
       
    public Comissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }
    
   @Override
    public double getValorAPagar() {
        this.salario = (0.06 * this.valorVendas);
        return this.salario;
    }
}
