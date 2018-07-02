package methodEmbedding.Speaking_in_Tongues.S.LYD1150;

import java.io.*;
public class Tongue
{
  public static void main(String[] args)
    throws IOException
  {
    BufferedReader input = new BufferedReader(new FileReader("tongues.in"));
    int next = Integer.parseInt(input.readLine());
    PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("alice.out")));
    
    char[] c = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
    for (int j = 1; j <= next; j++)
    {
      char[] temp = input.readLine().toCharArray();
      output.print("Case #" + j + ": ");
      
      for (char a: temp)
      {
        if (a == ' ')
          output.print(" ");
        else
        {
          int i = a - 97;
          output.print(c[i]);
        }
      }
      output.println();
    }
    output.close();
  }
}
