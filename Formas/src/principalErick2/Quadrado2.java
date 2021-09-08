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
public class Quadrado2 extends FormaBidimensional2 
{
    private float comprimento;
    private float largura;

    public Quadrado2(float comprimento, float largura) {
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
    
    @Override
    public float obterVolume() throws NaoExisteVolumeException
    {
        throw new NaoExisteVolumeException();
    }

    
    
}



    