package methodEmbedding.Standing_Ovation.S.LYD525;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class A {
	public static void main(String[] args) throws IOException {
    String        pb        = "A";
    Scanner       sc        = new Scanner(new FileReader(new File(pb+".in")));
    PrintWriter   out       = new PrintWriter(new File(pb+".out"));
		StringBuilder resultat  = new StringBuilder("");
		long time = System.currentTimeMillis();
		
		//TEST CASES----------------------------------------------------
		int TC = sc.nextInt();sc.nextLine();
    for (int tc = 1; tc <= TC; tc++) {
      if(tc!=1) resultat.append("\n");
      resultat.append("Case #"+tc+": ");
    
      //READ----------------------------------------------------
      String[] PQ = sc.nextLine().split(" ");
      //System.err.println(PQ[0]+" "+PQ[1]);
      int SMax = Integer.parseInt(PQ[0]);
      int[] S = new int[SMax+1];
      for (int i = 0; i < S.length; i++)
      {
        S[i] = Integer.parseInt(PQ[1].charAt(i)+"");
      }
      
			//SOLVE----------------------------------------------------
			int res = 0;
			int standingUp = 0;
			for (int i = 0; i < S.length; i++)
      {
        if(i>standingUp){
          res += i-standingUp;
          standingUp = i;
        }
        standingUp+=S[i];
      }
						
      //PRINT--------------------------------------------------
			System.out.println(res);
			resultat.append(res);
			System.out.println("Finished testcase " + tc + ", time = " + (System.currentTimeMillis() - time));
		}
		
    //CLOSE----------------------------------------------------
		out.print(resultat);
		out.close(); sc.close();
	}
}
