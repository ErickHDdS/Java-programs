/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.HashMap;

/**
 *
 * @author erick
 */
public class Sala 
{
    private int numero;
    private int capacidade;
    private HashMap<Integer,Ingresso> assentos;

    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.assentos = new HashMap<>();
    }

    public Sala() 
    {
        this.assentos = new HashMap<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public HashMap<Integer, Ingresso> getAssentos() {
        return assentos;
    }
    
    public void addAssento(Integer numero, Ingresso ingresso)
    {
        this.assentos.put(numero, ingresso);
    }
    

    
}
