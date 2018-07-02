package methodEmbedding.Cookie_Clicker_Alpha.S.LYD916;

import java.io.*;
import java.util.*;
import java.text.*;

public class GCJ_2014_QR_B {
  public static void main(String[] args) throws Exception {
    
    String inputFileName = "B-small-attempt0.in";
    String outputFileName = "B-small-attempt0.out";
    Scanner sc = new Scanner(new File(inputFileName));
    Writer wr = new BufferedWriter(new FileWriter(outputFileName));
    
    final int N = sc.nextInt();
    
    for(int i = 1; i <= N; i++)
    {
      // input variable declarations
      double c = sc.nextDouble();
      double f = sc.nextDouble();
      double x = sc.nextDouble();
      
      // output variable
      DecimalFormat d = new DecimalFormat("0.0000000");
      double y = 0.00;
      
      // algorithm
      double cr = 2.0;
      while(true)
      {
        if((x / cr) <= ((c / cr) + x / (cr+f)))
        {
          y += x / cr;
          break;
        }
        
        y += c / cr;
        cr += f;
      }
      
      // output
      wr.write("Case #" + i + ": " + d.format(y) + System.lineSeparator());
    }
    
    wr.close();
    sc.close();
  }
}
