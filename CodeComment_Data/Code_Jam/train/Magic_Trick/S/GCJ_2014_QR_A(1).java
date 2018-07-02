package methodEmbedding.Magic_Trick.S.LYD162;

import java.io.*;
import java.util.*;

public class GCJ_2014_QR_A {
  public static void main(String[] args) throws Exception {
    
    String inputFileName = "A-small-attempt0.in";
    String outputFileName = "A-small-attempt0.out";
    Scanner sc = new Scanner(new File(inputFileName));
    Writer wr = new BufferedWriter(new FileWriter(outputFileName));
    
    final int N = sc.nextInt();
    
    for(int i = 1; i <= N; i++)
    {
      // input variable declarations
      int row1 = sc.nextInt() - 1;
      int[][] a1 = new int[4][4];
      for(int j = 0; j < 4; j++)
      {
        for(int k = 0; k < 4; k++)
        {
          a1[j][k] = sc.nextInt();
        }
      }
      int row2 = sc.nextInt() - 1;
      int[][] a2 = new int[4][4];
      for(int j = 0; j < 4; j++)
      {
        for(int k = 0; k < 4; k++)
        {
          a2[j][k] = sc.nextInt();
        }
      }
      
      // output variable
      int y = 0;
      
      // algorithm
      int m = 0;
      for(int j = 0; j < 4; j++)
      {
        for(int k = 0; k < 4; k++)
        {
          if(a1[row1][j] == a2[row2][k])
          {
            m++;
            y = a1[row1][j];
          }
        }
      }
      
      if(m >= 2)
        y = -1;
      else if(m == 0)
        y = -2;
        
      // output
      if(y == -1)
        wr.write("Case #" + i + ": Bad magician!" + System.lineSeparator());
      else if(y == -2)
        wr.write("Case #" + i + ": Volunteer cheated!" + System.lineSeparator());
      else
        wr.write("Case #" + i + ": " + y + System.lineSeparator());
    }
    
    wr.close();
    sc.close();
  }
}
