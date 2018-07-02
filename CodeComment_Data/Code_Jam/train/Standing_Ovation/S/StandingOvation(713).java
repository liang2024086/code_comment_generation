package methodEmbedding.Standing_Ovation.S.LYD1487;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(sc.readLine());
    
    for (int z = 0; z < t; z++)
    {
      String[] lineItems = sc.readLine().split(" ");
      int shyLevel = Integer.parseInt(lineItems[0]);
      char[] arr = lineItems[1].toCharArray();
      int standing = 0;
      int friendsToInvite = 0;
      
      for (int i = 0; i < arr.length; i++)
      {
        if (standing + friendsToInvite < i)
        {
          friendsToInvite++;
        }
        
        standing += Character.getNumericValue(arr[i]);
      }
      
      System.out.println("Case #" + (z+1) + ": " + friendsToInvite);
    }
  }
}
