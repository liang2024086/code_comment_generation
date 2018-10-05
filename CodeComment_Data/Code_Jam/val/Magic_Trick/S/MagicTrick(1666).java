package methodEmbedding.Magic_Trick.S.LYD939;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.HashSet;

public class MagicTrick
{  
  public static void main(String[] args)
  {
    //We will hold the input and output in these variables
    BufferedReader input = null;
    PrintWriter output = null;
    
    //We need to first check if we have exactly 2 arguments.
    try
    {
      if (args.length != 2)
        throw new IllegalArgumentException("There must be exactly 2 arguments"
                                   + ", the names of the input & the output");

      //Set up the input & output                          
      input = new BufferedReader(new FileReader(args[0]));
      //If output file already exists throw exception
        if (new File(args[1]).exists())
          throw new IllegalArgumentException("The designated output file"
                                         + " already exists");
        output = new PrintWriter(new FileWriter(args[1]));

      //Read all the lines into an ArrayList
      String currentLine;
      currentLine = input.readLine();

      int testcases = Integer.parseInt(currentLine);

      for (int i = 0; i < testcases; i ++)
      {
        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();
        int chosenRow = Integer.parseInt(input.readLine());
        String[] rows = new String[4];
        for(int j = 0; j < 4; j ++)
          rows[j] = input.readLine();
        String[] parts = rows[chosenRow - 1].split(" ");
        for (String s : parts)
          firstSet.add(Integer.parseInt(s));

        chosenRow = Integer.parseInt(input.readLine());
        for(int j = 0; j < 4; j ++)
          rows[j] = input.readLine();
        parts = rows[chosenRow - 1].split(" ");
        for (String s : parts)
          secondSet.add(Integer.parseInt(s));

        firstSet.retainAll(secondSet);

        output.print("Case #" + (i + 1) + ": ");
        if(firstSet.isEmpty())
          output.println("Volunteer cheated!");
        else if(firstSet.size() > 1)
          output.println("Bad magician!");
        else
        {
          Integer[] r = new Integer[1];
          r = firstSet.toArray(r);
          output.println(r[0]);
        }


      }
    }
    //We will now try to catch Exceptions! (Deal with as JTL)
    catch (IllegalArgumentException e)
    {
      System.out.println(e);
    }
    catch (IOException e)
    {
      System.err.println(e);
    }
    catch (Exception e)
    {
      System.out.println("WARNING! Something highly unexpected happened. "
                         + "Check Standard Error for details.");
      System.err.println(e);
    }
    
    //Now we must try to close input and output
    finally
    {
      try
      {
        if (input != null)
          input.close();
      }
      catch (IOException e)
      {
        System.err.println(e);
      }
      if (output != null)
      {
        output.close();
        if (output.checkError())
          System.err.println("The output has not written successfully");
      }
    }//finally
  }//main
}//class 

