package methodEmbedding.Counting_Sheep.S.LYD1721;


import java.util.*;
import java.io.*;
public class g {
	
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
    	
      int n = in.nextInt();
      int m = n, temp=n;
      Set<Integer> set=new HashSet<>();
      Set<Integer> numSet=new HashSet<>();
      int j=1;
      boolean sheep=false;
      while(!numSet.contains(m)&& !sheep){
    	  m=n*j++;
    	  temp=m;
    	  while(m>0){
    		  int num=m%10;
    		  set.add(num);
    		  if(set.size()==10){
    			  sheep=true;
    		  }
    		  m/=10;
    	  }
    	  //System.out.println(temp);  
    	  numSet.add(temp);
      }
      if(set.size()!=10){
    	  System.out.println("Case #" + i + ": " + "INSOMNIA");  
      }else{
    	  System.out.println("Case #" + i + ": " + temp);  
      }
      
    }
  }
}
