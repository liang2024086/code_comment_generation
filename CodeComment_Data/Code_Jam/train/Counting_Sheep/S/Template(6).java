package methodEmbedding.Counting_Sheep.S.LYD1488;

import java.io.*;
import java.util.*;

public class Template
{
  public Template ()
  {
    try
    {
      BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
      PrintWriter out = new PrintWriter (new FileWriter ("out.txt"));
      StringTokenizer st;
      
      int numCases = Integer.parseInt (in.readLine ());
      
      for (int x = 0; x < numCases; x++)
      {
        String a = in.readLine();
        int b = Integer.parseInt (a);
        String temp = "";
        boolean ok = false;
        int counter=1;
        if (b == 0)
        {
          out.println ("Case #" + (x+1) + ": INSOMNIA");
        }
        else
        {
          while (true){
            for (int s = 0; s <= a.length()-1; s++){  
              if (s==0 && ok==false)
                temp += a.charAt (s);
              for (int y = 0; y <= temp.length()-1; y++)
              {
                if (temp.charAt (y) ==  a.charAt(s) ){
                  break; 
                }
                if (y==temp.length()-1)
                  temp += a.charAt (s);
              }
            }
            if (temp.length()==10)
            {
              out.println ("Case #" + (x+1) + ": " + a);
              break;
            }
            else
            {
              ok= true;
              counter++;
              a = (b*counter) + "";
            }                       
          }         
        }
      }
      
      in.close ();
      out.close (); 
    }
    catch (IOException e)
    {
    }
  }
  
  public static void main (String [] args)
  {
    new Template ();
  }
}
