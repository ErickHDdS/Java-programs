/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textFileApps;

// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import principal.Contato;

public class ReadTextFile
{
   private static Scanner input;

  /* public static void main(String[] args)
   {
      openFile();
      readRecords();
      closeFile();
   }*/ 

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         input = new Scanner(Paths.get("agendaPessoal.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read dados from file
    public static Contato readDados(String nome, String telefone) 
    {
        int i,j;
        int tamanhoTelefone = telefone.length();
        Contato contato = new Contato();
        try 
        {
            while (input.hasNext()) // while there is more to read
            {
                String linha = input.nextLine();
                Contato contato_aux = new Contato();
                String[] campos = linha.split(";");
                contato_aux.setNome(campos[0]);
                contato_aux.setEndereco(campos[1]);
                contato_aux.setTelefone(campos[2]);
                contato_aux.setEmail(campos[3]);
                
                
                int tamanhoTelefoneGravado = campos[2].length();
                int contador = 0;
                /*
                for(j = 0; j < tamanhoTelefone; j++)
                {
                    for(i = 0; i < tamanhoTelefoneGravado; i++)
                    {
                        if(telefone.charAt(j) == campos[2].charAt(i))
                        {
                            contador++;
                            if(contador == tamanhoTelefone)
                            {
                                contato = contato_aux;
                                return contato;
                            }
                        }
                    }
                }
                */
                //VERIFICANDO AS PARTES DO TELEFONE
                if(campos[2].contains(telefone))
                {
                    contato = contato_aux;
                                return contato;
                }
                
                //NESTE CASO SE O TELEFONE COMEÇA COM O NÚMERO ESPECIFICADO OU O NOME
                if(contato_aux.getNome().equals(nome) || campos[2].startsWith(telefone))
                {
                    contato = contato_aux;
                    return contato;
                }
                
                
            }
            
        } catch (NoSuchElementException elementException) 
        {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) 
        {
            System.err.println("Error reading from file. Terminating.");
        }
        
        return contato;
    }


   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile

/*************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/