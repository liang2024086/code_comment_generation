package methodEmbedding.Standing_Ovation.S.LYD534;

import java.io.*;

class StandingOvation
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());

    for (int i = 1; i <= t; i++)
    {
      String input[] = in.readLine().split(" ");
      //int s_max = Integer.parseInt(input[0]);
      String s = input[1];
      int current = 0, required = 0;
      for (int j = 0; j < s.length(); j++)
      {
        int n = s.charAt(j) - '0';

        if (n == 0)
          continue;

        if (j <= current)
          current += n;
        else
        {
          required += (j - current);
          current = n + j;
        }
      }
      System.out.println("Case #" + i + ": " + required);
    }
  }
}
