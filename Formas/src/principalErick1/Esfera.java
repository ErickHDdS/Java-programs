/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick1;

/**
 *
 * @author erick
 */
public class Esfera extends FormaTridimensional
{
    private float diametro;

    public Esfera(float diametro) {
        super(0, 0);
        this.diametro = diametro;
    }
   
    @Override
    public float obterArea(){
        this.setArea((float) (4* Math.PI * Math.pow(this.diametro/2, 2))); 
        return this.area;
    }

    @Override
    public float obterVolume() 
    {
        this.setVolume(((float) (4* Math.PI * Math.pow(this.diametro/2, 3)))/3); 
        return this.volume;
    }
    
}
