package methodEmbedding.Counting_Sheep.S.LYD999;

import java.io.*;
import java.util.*;

public class countingSheep{
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  
    for (int i = 1; i <= t; ++i) {
      long n = in.nextInt();
	  String output="";
	  HashSet<Character> hs=new HashSet<Character>();
	  if(n==0)output="INSOMNIA";
	  else{
		  int r=0;
		  while(hs.size()<10){
			  r++;
			  output=""+r*n;
			  for(int j=0;j<output.length();j++){
				  hs.add(output.charAt(j));
			  }
		  }
	  }
      System.out.println("Case #" + i + ": " + output);
    }
  }
	
}
