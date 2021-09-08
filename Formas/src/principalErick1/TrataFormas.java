/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author erick
 */
public class TrataFormas 
{

    public TrataFormas() {
    }

    public void calculandoAreaEVolume(Forma[] forma)
    {
        for(int i=0; i<6; i++)
        {
            if(forma[i] instanceof FormaBidimensional)
            {
                ((FormaBidimensional) forma[i]).obterArea();
            }
            else if(forma[i] instanceof FormaTridimensional)
            {
                ((FormaTridimensional) forma[i]).obterArea();
                ((FormaTridimensional) forma[i]).obterVolume();
                
            }
        }
    }
}
