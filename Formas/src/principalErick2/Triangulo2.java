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
public class Triangulo2 extends FormaBidimensional2
{
    private float base;
    private float altura;

    public Triangulo2(float base, float altura) {
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
