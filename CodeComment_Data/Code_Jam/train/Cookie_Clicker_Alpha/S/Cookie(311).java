package methodEmbedding.Cookie_Clicker_Alpha.S.LYD278;

import java.io.*;
public class Cookie
{
  public static void main(String [] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int N = 1; N <= T; N++)
    {
      String [] line = br.readLine().split(" ");
      double C = Double.parseDouble(line[0]);
      double F = Double.parseDouble(line[1]);
      double X = Double.parseDouble(line[2]);

      double rate = 2;

      double te = 0;

      double upgradeCost = X/(rate+F);
      double stayCost    = (X-C)/rate;
      while(upgradeCost < stayCost)
      {
        te += C/rate;
        rate += F;
        upgradeCost = X/(rate+F);
        stayCost    = (X-C)/rate;
      }
      te += X/(rate);
      te = (double)Math.round(te * 10000000) / 10000000;
      System.out.println("Case #"+N+": " +te);
    }
  }
}
