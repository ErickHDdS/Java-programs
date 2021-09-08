/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;
import textFileApps.CreateTextFile;
import textFileApps.ReadTextFile;
/**
 *
 * @author erick
 */
public class Agenda 
{
    private HashMap<String, Contato> agenda;

    public Agenda() 
    {
        this.agenda = new HashMap<>();
    }

    public boolean inserirContato(Contato contato) 
    {
        agenda.put(contato.getNome(), contato);

        return true;
    }

    public void gravar() 
    {
        CreateTextFile.openFile();
        CreateTextFile.addDados(agenda);
        CreateTextFile.closeFile();
    }

    public Contato pesquisar(String nome, String telefone) 
    {
        Contato contato = new Contato();

        ReadTextFile.openFile();
        contato = ReadTextFile.readDados(nome, telefone);
        ReadTextFile.closeFile();

        return contato;
    }
}
