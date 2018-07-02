package methodEmbedding.Cookie_Clicker_Alpha.S.LYD221;

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

public class Cookie
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

      String currentLine;
      currentLine = input.readLine();

      int testcases = Integer.parseInt(currentLine);

      for (int i = 0; i < testcases; i ++)
      {
        currentLine = input.readLine();
        String[] parts = currentLine.split(" ");
        Double c = Double.parseDouble(parts[0]);
        Double f = Double.parseDouble(parts[1]);
        Double x = Double.parseDouble(parts[2]);
        Double cookiesPerSecond = 2.0;
        Double seconds;
        //We now have a decision tree to make.
        //Each time we have C cookies, we can either buy, or wait until we have X,
        //There is never any advantage to waiting to buy, (ie at 2c, or c + n)
        //There will be a point where buying farms first (possibly) improves t, then causes
        // it to decrease. (ie the never ending case of always buying farms).
        //Thus we will start with a base case, buy no farms.
        Double bestTime = x / cookiesPerSecond;
        int farmCount = 0;
        do
        {
          seconds = 0.0;
          cookiesPerSecond = 2.0;
          farmCount ++;

          for (int j = 0; j < farmCount; j ++)
          {
            seconds += c / cookiesPerSecond;
            cookiesPerSecond += f;
          }

          seconds += x / cookiesPerSecond;
          if (seconds < bestTime)
            bestTime = seconds;
        } while (seconds == bestTime);

        output.println("Case #" + (i+1) + ": " + bestTime);

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

