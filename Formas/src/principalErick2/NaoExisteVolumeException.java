/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick2;

/**
 *
 * @author erick
 */
public class NaoExisteVolumeException extends Exception 
{
    public  NaoExisteVolumeException()
    {
        super("Não Existe Volume para objetos Bidimensionais");
    }
}
