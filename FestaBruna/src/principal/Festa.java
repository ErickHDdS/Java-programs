/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Festa {
    
    public static void main(String args[])
    {
        Convidado[] convidados = new Convidado[10];
        convidados[0] = new Convidado("Julio","MAS");//
        convidados[1] = new Convidado("Marcos","MAS");//
        convidados[2] = new Convidado("Yuri","MAS");//
        convidados[3] = new Convidado("Erick","MAS");//
        convidados[4] = new Convidado("Leo","MAS");
        convidados[5] = new Convidado("Ana","FEM");//
        convidados[6] = new Convidado("Bia","FEM");//
        convidados[7] = new Convidado("Sophia","FEM");//
        convidados[8] = new Convidado("Julia","FEM");
        convidados[9] = new Convidado("Diana","FEM");//
        
        Musica[] m = new Musica[3];
        m[0] = new Musica("M1",3.0);
        m[1] = new Musica("M2",4.0);
        m[2] = new Musica("M3",5.0);
        
        Danca[] d = new Danca[3];
        d[0] = new Danca(m[0],convidados);
        d[1] = new Danca(m[1],convidados);
        d[2] = new Danca(m[2],convidados);
               
        int[] v1 = {0,5,1,2,3,6,7,9,0,0};
        int[] v2 = {0,5,1,6,2,7,3,8,4,9};
        int[] v3 = {1,2,3,4,5,6,7,8,9,0};
        int[][] v = new int[3][1];
        v[0]=v1; 
        v[1]=v2;
        v[2]=v3;
        
        for(int j=0; j<3; j++)
        {
            JOptionPane.showMessageDialog(null, "MUSICA: "+m[j].getNome()+ " TOCANDO");
            JOptionPane.showMessageDialog(null, "VAMOS DANÇAR");
            m[j].chamandoDanca(d[j],v[j]);
            for(int i=0; i<5; i++)
            {
               if((convidados[i].getPar()!=null) && (convidados[i].getPar().getSexo() != convidados[i].getSexo()))
               {
                   JOptionPane.showMessageDialog(null, ""+convidados[i].getNome()+ " & "+convidados[i].getPar().getNome());
               }
            }       
        }
    }
}
