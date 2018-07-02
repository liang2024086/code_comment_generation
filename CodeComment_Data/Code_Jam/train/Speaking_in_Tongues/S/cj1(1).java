package methodEmbedding.Speaking_in_Tongues.S.LYD965;

import java.io.*;
class cj1
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    char mapping[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' }; 
    int T = Integer.parseInt(obj.readLine());
    for(int i = 1; i<=T; i++)
    {
      String G = obj.readLine();
      System.out.print("Case #" + i+": ");
      for(int j = 0; j<G.length(); j++)
      {
	if(G.charAt(j) == ' ') System.out.print(" ");
	else System.out.print(mapping[G.charAt(j) - 97]);
      }
      System.out.println();
    }
  }
}   
