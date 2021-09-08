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
public class Cubo extends FormaTridimensional 
{
    private float comprimento;
    private float largura;
    private float profundidade;

    public Cubo(float comprimento, float largura, float profundidade) {
        super(0, 0);
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public float obterArea(){
        float areaBase = this.comprimento * this.largura;
        this.setArea(6 * areaBase); 
        return this.area;
    }

    @Override
    public float obterVolume() 
    {
        this.volume = this.comprimento * this.largura * this.profundidade;
        return volume;
    }
    
}
