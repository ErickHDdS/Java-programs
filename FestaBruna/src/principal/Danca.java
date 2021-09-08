/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author erick
 */
public class Danca {
    private Musica musica;
    private Convidado[] convidados;

    public Danca(Musica musica, Convidado[] convidados) {
        this.musica = musica;
        this.convidados = convidados;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Convidado[] getConvidados() {
        return convidados;
    }

    public void setConvidados(Convidado[] convidados) {
        this.convidados = convidados;
    }
    //COLOCANDO OS PARES NA DANÇA
        public void dancando(int[] v)
        {
            for(int i=0; i<10; i++)
            {
                convidados[i].setPar(null);
            }
            convidados[v[0]].empareando(convidados[v[1]]);
            convidados[v[2]].empareando(convidados[v[3]]);
            convidados[v[4]].empareando(convidados[v[5]]);
            convidados[v[6]].empareando(convidados[v[7]]);
            convidados[v[8]].empareando(convidados[v[9]]);
        }
        
    
}
