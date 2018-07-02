package methodEmbedding.Speaking_in_Tongues.S.LYD1621;

import java.util.*;
import java.io.*;

public class Tongues
{
  public static void main(String[] args)
  {
    String code = "yhesocvxduiglbkrztnwjpfmaq";
    int ascii_offset = (int)'a';
    Scanner in = new Scanner(new BufferedInputStream(System.in));
    int T = in.nextInt();
    in.nextLine();
    for(int i = 0; i < T; i++) 
    {
      String G = in.nextLine();
      char[] gt = new char[G.length()];
      for(int j = 0; j< G.length(); j++) 
      {
        char c = G.charAt(j);
        if(c == ' ')
          gt[j] = ' ';
        else 
        {
          int index = (int)c - ascii_offset;
          gt[j] = code.charAt(index);
        }
      }
      System.out.printf("Case #%d: %s\n",i+1,new String(gt));
    }
 
  }
  
  
}
