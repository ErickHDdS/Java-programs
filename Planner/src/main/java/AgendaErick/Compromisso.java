/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaErick;

/**
 *
 * @author erick
 */
public class Compromisso {
    
    private int duracao;
    private String descricao;
    
    public Compromisso()
    {
        duracao = 0;
        descricao = "";
    }
    
    public Compromisso(int duracao, String descricao)
    {
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
