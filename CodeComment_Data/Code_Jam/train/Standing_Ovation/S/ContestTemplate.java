package methodEmbedding.Standing_Ovation.S.LYD2201;

import java.io.*;
import java.util.*;

public class ContestTemplate
{
  
  public static BufferedReader in;
  public static PrintWriter out;
  public static int numInputs;
  public static ArrayList <String> inputs;
  
  public static void main (String[] args)
  {
    try
    {
      //Initialize our IO classes and storage.
      out = new PrintWriter (new FileWriter ("out.txt"));
      in = new BufferedReader (new FileReader("in.txt"));
      inputs = new ArrayList <String> ();
      
      //This gets the number of inputs as an integer. If the first line does NOT give the number of inputs, erase this.
      numInputs = Integer.parseInt (in.readLine());
      
      //Read in data values as strings.
      //YOU WILL NEED TO PARSE THIS LATER TO HAVE IT DO SHIT!
      for(int i = 0; i < numInputs; i++)
      {
        inputs.add (in.readLine());
      }
      
      int caseNum = 0;
      for(String s : inputs)
      {
        caseNum++;
        int currentApplause = 0;
        int needed = 0;
        String[] ins = s.split(" ");
        for(int i = 0; i < ins[1].length(); i++)
        {
          if(currentApplause >= i)
          {
            currentApplause += Integer.parseInt(ins[1].substring(i,i+1));
          }
          else
          {
            needed += i - currentApplause;
            currentApplause = i;
            currentApplause += Integer.parseInt(ins[1].substring(i,i+1)); 
          }
        }
        out.println("Case #" + caseNum + ": " + needed);
      }
      
      
      
      out.close();
      
    }
    catch(Exception e){
      e.printStackTrace();
    }
    
    
  }
}
