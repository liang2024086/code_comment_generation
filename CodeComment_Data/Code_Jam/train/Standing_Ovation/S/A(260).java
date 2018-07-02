package methodEmbedding.Standing_Ovation.S.LYD961;

import java.io.*;
import java.util.*;

public class A {

     public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());
        for (int t = 1; t <= numTests; ++t) {
          String[] tok = br.readLine().split(" ");
	  int n = Integer.parseInt(tok[0]);
	  int sum = 0;
          int level = 0;
          int invite = 0;
	  for (char c : tok[1].toCharArray()) {
            invite += Math.max(0, level - (sum + invite));   
	    sum += Integer.parseInt(String.valueOf(c));
            ++level;
	  }
	  System.out.format("Case #%d: %d\n", t, invite);
        }
     }
}

