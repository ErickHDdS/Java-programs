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
public class Triangulo extends FormaBidimensional 
{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        super(0);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float obterArea() {
        
        this.setArea((this.base * this.altura)/2); 
        return this.area;
    }
    
}
