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
public class Quadrado extends FormaBidimensional
{
    private float comprimento;
    private float largura;

    public Quadrado(float comprimento, float largura) {
        super(0);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public float obterArea() 
    {
        this.setArea(this.comprimento * this.largura);
        return this.area;
    }
    
}
