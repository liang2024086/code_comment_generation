package methodEmbedding.Revenge_of_the_Pancakes.S.LYD32;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class B {
  public static void main(String[] args) throws IOException {
    String        pb        = "B";
    Scanner       sc        = new Scanner(new FileReader(new File(pb+".in")));
    PrintWriter   out       = new PrintWriter(new File(pb+".out"));
    StringBuilder resultat  = new StringBuilder("");
    long time = System.currentTimeMillis();
    
    //TEST CASES----------------------------------------------------
    int TC = sc.nextInt();
    sc.nextLine();
    for (int tc = 1; tc <= TC; tc++) {
      if(tc!=1) resultat.append("\n");
      resultat.append("Case #"+tc+": ");
    
      //READ----------------------------------------------------
      char[] pil = sc.nextLine().toCharArray();
      
      
      //SOLVE----------------------------------------------------
      long res = 0;
      for (int i = 1; i < pil.length; i++)
      {
        if(pil[i]!=pil[i-1])
          res++;
      }
      if(pil[pil.length-1]!='+')
        res++;
      
      
      //PRINT--------------------------------------------------
      System.out.println(res);
      resultat.append(res);
//      System.out.println("Finished testcase " + tc + ", time = " + (System.currentTimeMillis() - time));
      
    }
    
    //CLOSE----------------------------------------------------
    out.print(resultat);
    out.close(); sc.close();
  }

}
