/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick2;

import principalErick1.Forma;

/**
 *
 * @author erick
 */
public abstract class FormaBidimensional2 extends Forma
{
    
    public FormaBidimensional2(float area) {
        super(area);
    }
    
    public abstract float obterArea();
    
    public float obterVolume() throws NaoExisteVolumeException
    {
        throw new NaoExisteVolumeException();
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}