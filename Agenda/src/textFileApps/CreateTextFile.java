/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textFileApps;

// Fig. 15.3: CreateTextFile.java
// Writing data to a sequential text file with class Formatter.
import java.io.FileNotFoundException;        
import java.util.ArrayList;
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;  
import java.util.Scanner;      

import principal.Contato;

public class CreateTextFile
{
   private static Formatter output; // outputs text to a file       

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
         output = new Formatter("agendaPessoal.txt"); // open the file
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add dados to file
   public static void addDados(HashMap<String, Contato> agenda)
   {      
        try
        {
            Iterator<String> chave = agenda.keySet().iterator();  
            while(chave.hasNext())
            {
                String chave_aux = chave.next();
                output.format("%s;%s;%s;%s", agenda.get(chave_aux).getNome(),agenda.get(chave_aux).getEndereco(),agenda.get(chave_aux).getTelefone(),
                        agenda.get(chave_aux).getEmail());
                output.format("\n");
            }                           
        } 
        catch (FormatterClosedException formatterClosedException)
        {
           System.err.println("Error writing to file. Terminating.");
        }    
        
   }

   // close file
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 
} // end class CreateTextFile


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