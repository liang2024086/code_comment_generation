package methodEmbedding.Counting_Sheep.S.LYD544;

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  
		for (int i = 1; i <= t; ++i) {
	     long val = in.nextLong();
	     long num = val, j = 2;
	      HashSet<Integer> hset = new HashSet<Integer>();
	      boolean flag = true;
	      while(hset.size() < 10){
	    	  while(num != 0){
	    		  int temp = Math.abs((int )(num % 10));
	    		  num /= 10;
	    		  if(!hset.contains(temp)){
	    			  hset.add(temp);
	    		  }
	    	  }
	    	  if(hset.size() == 10){
	    		 // System.out.println(val * j);
	    		  
	    		  break;
	    	  }
	    	  num = val * (j++);
	    	  if(num == val){
	    		  flag = false;
	    		  break;
	    	  }
	      }
	      if(flag){
	    	  System.out.println("Case #" +i+": "+ val * (--j));
	      }else{
	    	  System.out.println("Case #" +i+": "+ "INSOMNIA");
	      }
	      
	    }

	}

}
