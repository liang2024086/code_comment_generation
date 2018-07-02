package methodEmbedding.Revenge_of_the_Pancakes.S.LYD252;


import java.util.*;
import java.io.*;
public class gg {
	
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
    	
      String n = in.next();
      System.out.println(n);
      
      int num=0;
      for(int j=n.length()-1;j>=0;j--){
    	  if(n.charAt(j)=='+' && num%2==0){
    		  continue;
    	  }if(n.charAt(j)=='-' && num%2==1){
    		  continue; 		  
    	  }else{
    		  num++;
    	  }
      }
      System.out.println("Case #" + i + ": " +num);  

      
    }
  }
}
