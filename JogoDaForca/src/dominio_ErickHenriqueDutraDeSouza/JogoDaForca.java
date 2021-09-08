/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio_ErickHenriqueDutraDeSouza;

import java.security.SecureRandom;
import java.util.ArrayList;
import servicosErickHenriqueDutraDeSouza.ReadTextFile;

/**
 *
 * @author erick
 */
public class JogoDaForca 
{
    private String[] palavras;
    private String palavra;
    private int numTentativas;
    private boolean venceu;
    private SecureRandom gerador = new SecureRandom();
    
    public JogoDaForca(int numTentativas)
    {
        this.numTentativas = numTentativas;
        lerPalavras();
        sorteiaPalavraJogo();
    }
    
    private void lerPalavras()
    {
        ReadTextFile.openFile("palavras7letras.txt");
        palavras = ReadTextFile.readRecords();
    }
    
    public void sorteiaPalavraJogo()
    {
        palavra = palavras[gerador.nextInt(palavras.length)].toUpperCase();
        
        System.out.println("PALAVRA SORTEADA: "+palavra);
    }
    
    public void jogadaRealizada()
    {
        numTentativas --;
    }
    
    public ArrayList<Integer> verificaLetra(String letra)
    {
        jogadaRealizada();
        ArrayList<Integer> posicoes = new ArrayList<>();
        
        if(palavra.contains(letra))
        {
            for(int i = 0; i < palavra.length(); i++)
            {
                if(letra.charAt(0) == palavra.charAt(i))
                {
                    posicoes.add(i);
                }
            }    
        }
        return posicoes;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public void setNumTentativas(int numTentativas) {
        this.numTentativas = numTentativas;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public SecureRandom getGerador() {
        return gerador;
    }

    public void setGerador(SecureRandom gerador) {
        this.gerador = gerador;
    }
}
