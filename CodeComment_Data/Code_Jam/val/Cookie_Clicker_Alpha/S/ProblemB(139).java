package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1491;

import java.io.*; 
import java.util.*; 
import java.text.DecimalFormat; 

public class ProblemB
{
    
    public static void main (String [] args) throws IOException
    {
      Scanner in = new Scanner (new FileReader ("B-small-attempt0.in")); 
      PrintWriter out = new PrintWriter (new FileWriter ("Bout.txt")); 
      int asdfg = in.nextInt (); 
      for (int cases = 0; cases < asdfg; cases++)
      {
        double c = in.nextDouble (); 
        double f = in.nextDouble (); 
        double x = in.nextDouble (); 
        double currentRate = 2.0; 
        double time = 0; 
        while (true)
        {
          if ((x - c) / currentRate < x / (currentRate + f))
          {
            time += x / currentRate;
            break;
          }
          time += c / currentRate; 
          currentRate += f; 
        }
        DecimalFormat df = new DecimalFormat ("#.#######"); 
        String test = df.format (time); 
        out.println ("Case #" + (cases + 1) + ": " + test); 
        
        
       
      }    
      in.close ();
      out.close ();
    }
}
