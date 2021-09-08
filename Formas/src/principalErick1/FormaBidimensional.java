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
public abstract class FormaBidimensional extends Forma
{
    
    public FormaBidimensional(float area) {
        super(area);
    }
    
    public abstract float obterArea();

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
