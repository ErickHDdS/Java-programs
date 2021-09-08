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
public class Hora {
    private int hora;
    private Compromisso compromisso;

    public Hora() {
        hora = 0;
        compromisso = new Compromisso();
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Compromisso getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }
    
    
}
