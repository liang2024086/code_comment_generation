package methodEmbedding.Magic_Trick.S.LYD1125;

import java.io.*;
public class Cards
{
  public static void main(String [] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int N = 1; N <= T; N++)
    {
      int choiceA = Integer.parseInt(br.readLine())-1;
      String [][] arrA = new String[4][4];
      arrA[0] = br.readLine().split(" ");
      arrA[1] = br.readLine().split(" ");
      arrA[2] = br.readLine().split(" ");
      arrA[3] = br.readLine().split(" ");

      int choiceB = Integer.parseInt(br.readLine())-1;
      String [][] arrB = new String[4][4];
      arrB[0] = br.readLine().split(" ");
      arrB[1] = br.readLine().split(" ");
      arrB[2] = br.readLine().split(" ");
      arrB[3] = br.readLine().split(" ");

      String [] rowA = arrA[choiceA];
      String [] rowB = arrB[choiceB];

      int common = 0;
      String num = "";
      for(int i = 0; i < 4; i++)
      {
        for(int j = 0; j < 4; j++)
        {
          if(rowA[i].equals(rowB[j]))
          {
            num = rowA[i];
            common++;
          }
        }
      }
      if(common == 1)
      {
        System.out.println("Case #"+N+": " + num);
      }
      else if(common > 1)
      {
        System.out.println("Case #"+N+": Bad magician!");
      }
      else
      {
        System.out.println("Case #"+N+": Volunteer cheated!");
      }
    }
  }
}
