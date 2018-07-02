package methodEmbedding.Magic_Trick.S.LYD1611;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class A2014 {
	public static void main(String[] args) throws IOException {
		Scanner       s         = new Scanner(new FileReader(new File("A.in")));
		PrintWriter   out       = new PrintWriter(new File("A.out"));
		StringBuilder resultat  = new StringBuilder("");
		long time = System.currentTimeMillis();
		
		//TEST CASES----------------------------------------------------
		int TC = s.nextInt();
    for (int tc = 1; tc <= TC; tc++) {
      if(tc!=1) resultat.append("\n");
      resultat.append("Case #"+tc+": ");
    
      //READ----------------------------------------------------
      int N = s.nextInt();
      long[][] v = new long[4][4];
      for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
          v[i][j] = s.nextLong();
      //long E = s.nextLong(), R = s.nextLong();
			
      int M = s.nextInt();
      long[][] w = new long[4][4];
      for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
          w[i][j] = s.nextLong();
      
      
			//SOLVE----------------------------------------------------
			ArrayList<Long> r = new ArrayList<Long>();
			
			for (int i = 0; i < 4; i++)
			  for (int j = 0; j < 4; j++)
          {
            if(v[N-1][i]==w[M-1][j])
              r.add(v[N-1][i]);
          }
			
			String res = "Volunteer cheated!";
			if(r.size()==1)
			  res = ""+r.get(0);
			else if(r.size()>1)
			  res = "Bad magician!";
			
      //PRINT--------------------------------------------------
			System.out.println(res);
			resultat.append(res);
			System.out.println("Finished testcase " + tc + ", time = " + (System.currentTimeMillis() - time));
		}
		
    //CLOSE----------------------------------------------------
		out.print(resultat);
		out.close(); s.close();
	}
}
