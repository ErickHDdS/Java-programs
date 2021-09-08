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
public abstract class FormaTridimensional extends Forma
{
    
    public float volume;

    public FormaTridimensional(float volume, float area) {
        super(area);
        this.volume = volume;
    }

    public abstract float obterArea();
    public abstract float obterVolume();
    
    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
