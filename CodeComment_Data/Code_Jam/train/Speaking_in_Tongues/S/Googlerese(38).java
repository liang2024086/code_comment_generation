package methodEmbedding.Speaking_in_Tongues.S.LYD465;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Googlerese
{
  // the main method
  public static void main(String[] args)
  {
    BufferedReader input = null;
    PrintWriter output = null;
    try
    {
      input = new BufferedReader(new FileReader(args[0]));
      output = new PrintWriter(new FileWriter(args[1]));
    
      String currentLine;
      int caseNumber = -1;   
      String[] array = new String[150];

      while((currentLine = input.readLine()) != null)
      {
        caseNumber++;
        if(caseNumber>0)
        {
          array = currentLine.split("");
          output.print("Case #" + caseNumber + ": " );
          for(int index=0; index<array.length; index++)
          {
            if(array[index].equals("a"))
              array[index] = "y";
            else if(array[index].equals("b"))
              array[index] = "h";
            else if(array[index].equals("c"))
              array[index] = "e";
              else if(array[index].equals("d"))
              array[index] = "s";
              else if(array[index].equals("e"))
              array[index] = "o";
              else if(array[index].equals("f"))
              array[index] = "c";
              else if(array[index].equals("g"))
              array[index] = "v";
              else if(array[index].equals("h"))
              array[index] = "x";
              else if(array[index].equals("i"))
              array[index] = "d";
              else if(array[index].equals("j"))
              array[index] = "u";
              else if(array[index].equals("k"))
              array[index] = "i";
              else if(array[index].equals("l"))
              array[index] = "g";
              else if(array[index].equals("m"))
              array[index] = "l";
              else if(array[index].equals("n"))
              array[index] = "b";
              else if(array[index].equals("o"))
              array[index] = "k";
              else if(array[index].equals("p"))
              array[index] = "r";
              else if(array[index].equals("q"))
              array[index] = "z";
              else if(array[index].equals("r"))
              array[index] = "t";
              else if(array[index].equals("s"))
              array[index] = "n";
              else if(array[index].equals("t"))
              array[index] = "w";
              else if(array[index].equals("u"))
              array[index] = "j";
              else if(array[index].equals("v"))
              array[index] = "p";
              else if(array[index].equals("w"))
              array[index] = "f";
              else if(array[index].equals("x"))
              array[index] = "m";
              else if(array[index].equals("y"))
              array[index] = "a";
              else if(array[index].equals("z"))
              array[index] = "q";
              output.print(array[index]);
           } // for
           output.println();
         } // if
      } // while
      
    } // try
    
    catch (Exception exception)
    {
      System.err.println(exception);
    } // catch
    
    finally
    {
      try{ if(input != null) input.close(); }
      catch (IOException exception)
      { System.err.println("Could not close input: " + exception); }
      
      if(output != null)
      {
        output.close();
        if(output.checkError())
          System.err.println("Soemthing went wrong with the output");
      } // if
    } // finally
  } // main
} // class 
      
      
    
    
