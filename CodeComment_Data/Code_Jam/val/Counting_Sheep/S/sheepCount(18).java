package methodEmbedding.Counting_Sheep.S.LYD276;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class sheepCount {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> countedNumbers = new HashMap<Integer,Integer>();
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();
	    for (int i = 1; i <= t; ++i) {
	      int n = in.nextInt();
	      if(n == 0){
	    	  System.out.println("Case #" + i + ": " + "INSOMNIA");
	    	  continue;
	      }
	      boolean found = false;
	      int mul = 1;
	      int count = 0;
	      while(!found){
	    	  int mulResult = n * mul;
	    	  while(mulResult > 0){
	    		  int eachDigit = mulResult % 10;
	    		  if(!countedNumbers.containsKey(eachDigit)){
	    			  countedNumbers.put(eachDigit, 0);
	    			  count++;
	    		  }
	    		  if(count == 10){
	    			  found = true;
	    			  break;
	    		  }
	    		  mulResult = mulResult / 10;
	    	  }
	    	  mul++;
	      }
	      if(mul > 1000){
	    	  System.out.println("Case #" + i + ": " + "INSOMNIA");
	      }
	      if(found){
	    	  System.out.println("Case #" + i + ": " + (n * (mul - 1)));
	    	  countedNumbers.clear();
	      }
	    }
	}
}
