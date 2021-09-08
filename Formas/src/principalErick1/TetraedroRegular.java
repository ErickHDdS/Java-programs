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
public class TetraedroRegular extends FormaTridimensional
{
    float aresta;
    float altura;

    public TetraedroRegular(float aresta) {
        super(0, 0);
        this.aresta = aresta;
        this.altura = ((float)((this.aresta * Math.sqrt(6))/3));
    }

    @Override
    public float obterArea() {
        this.area = ((float)((Math.pow(this.aresta, 2) * Math.sqrt(3))));
        return this.area;
    }

    @Override
    public float obterVolume() 
    {
        float areaBase = ((float)((Math.pow(this.aresta, 2) * Math.sqrt(3)))/4);
        this.volume  = ((float)(areaBase * this.altura)/3);
        return this.volume;
    }
    
}
