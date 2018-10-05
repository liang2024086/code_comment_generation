package methodEmbedding.Cookie_Clicker_Alpha.S.LYD659;

import java.io.*;  
import java.util.*;  

public class ProblemB
{ 
  
  public static void main (String [] args) throws IOException 
  { 
    Scanner in = new Scanner (new FileReader ("B-small-attempt0.in"));  
    
    PrintWriter out = new PrintWriter (new FileWriter ("BO.txt"));  
    
    int cases = in.nextInt (); 
    in.nextLine();
    for (int current =1; current <= cases; current++) 
    { 
      double rate = 2.0;  
      double money =0.0;
      
      double price = in.nextDouble ();  
      double plusRate = in.nextDouble ();  
      double win = in.nextDouble ();  
      
      double time = 0;  
      
      
      
      while (true)
      
      { // ttw new rate> ttw old - farm
          if (win / (rate + plusRate)  > (win - price) / rate) 
          { 
            // ttw
            time += win / rate; 
            break; 
          } 
          
          // add accumulation time
          time += price / rate;  
          // add rate
          rate += plusRate;  
        }  
        out.println ("Case #" + current + ": " + (time + 0.0000000000000000));  

        
        
      
      
    }
    in.close (); 
    out.close (); 
  } 
}
