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
public class Circulo extends FormaBidimensional
{
    private float diametro;
    private float comprimento;

    public Circulo(float diametro) {
        super(0);
        this.diametro = diametro;
        this.comprimento = ((float) (2 * Math.PI * this.diametro/2));
    }

    @Override
    public float obterArea() 
    {
        this.setArea((float) (Math.PI * Math.pow(this.diametro/2, 2)));
        return this.area;
    }
    
}
