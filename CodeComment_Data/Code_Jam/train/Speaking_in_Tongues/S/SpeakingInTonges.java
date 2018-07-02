package methodEmbedding.Speaking_in_Tongues.S.LYD364;

import java.util.*;
import java.io.*;

public class SpeakingInTonges
{
  public static void main (String []args) throws IOException
  {
    final String INPUT_FILE = "A-small-attempt3.in";
    final String OUTPUT_FILE = "A-small-attempt0.out";
    
    BufferedReader input = new BufferedReader(new FileReader(INPUT_FILE));
    PrintWriter out = new PrintWriter(new FileWriter(OUTPUT_FILE));
    
    int repeats = Integer.parseInt(input.readLine());
    
    for (int j = 0; j < repeats; j++)
    {
      String output = "Case #" + (j + 1) + ": ";
      String g = input.readLine();
      
      for (int i = 0; i < g.length(); i++)
      {
        if (g.charAt(i) == 'y') output += "a" ;
        else if (g.charAt(i) == 'n') output += "b" ;
        else if (g.charAt(i) == 'f') output += "c" ;
        else if (g.charAt(i) == 'i') output += "d" ;
        else if (g.charAt(i) == 'c') output += "e" ;
        else if (g.charAt(i) == 'w') output += "f" ;
        else if (g.charAt(i) == 'l') output += "g" ;
        else if (g.charAt(i) == 'b') output += "h" ;
        else if (g.charAt(i) == 'k') output += "i" ;
        else if (g.charAt(i) == 'u') output += "j" ;
        else if (g.charAt(i) == 'o') output += "k" ;
        else if (g.charAt(i) == 'm') output += "l" ;
        else if (g.charAt(i) == 'x') output += "m" ;
        else if (g.charAt(i) == 's') output += "n" ;
        else if (g.charAt(i) == 'e') output += "o" ;
        else if (g.charAt(i) == 'v') output += "p" ;
        else if (g.charAt(i) == 'z') output += "q" ;
        else if (g.charAt(i) == 'p') output += "r" ;
        else if (g.charAt(i) == 'd') output += "s" ;
        else if (g.charAt(i) == 'r') output += "t" ;
        else if (g.charAt(i) == 'j') output += "u" ;
        else if (g.charAt(i) == 'g') output += "v" ;
        else if (g.charAt(i) == 't') output += "w" ;
        else if (g.charAt(i) == 'h') output += "x" ;
        else if (g.charAt(i) == 'a') output += "y" ;
        else if (g.charAt(i) == 'q') output += "z" ;
        else if (g.charAt(i) == ' ') output += " " ;
      }
      
      out.println(output);

//      System.out.println(output);
    }
          out.close();
          input.close();
  }
}
