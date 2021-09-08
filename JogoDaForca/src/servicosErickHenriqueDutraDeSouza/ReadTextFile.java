/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicosErickHenriqueDutraDeSouza;

/**
 *
 * @author erick
 */
// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;

   // open file clients.txt
   public static void openFile(String nameArquivo)
   {
      try
      {
         input = new Scanner(Paths.get(nameArquivo)); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static String[] readRecords()
   {
       String linha;
       String[] retorno = null;

      try 
      {
         while (input.hasNext()) // while there is more to read
         {
            linha = input.nextLine();
            retorno = linha.split(" ");
         }
      } 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      }
      
      return retorno;
   } // end method readRecords

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
