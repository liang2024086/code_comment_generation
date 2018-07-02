package methodEmbedding.Counting_Sheep.S.LYD716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	    	Set<Character> set = new HashSet<Character>();
		    boolean isSolved = false;
		    int n = in.nextInt();
		    if(n == 0)
		    System.out.println("Case #" + i + ": " + "INSOMNIA");
		    else{
		    	int k = 1;
		   	  	while(!isSolved){
		   	  		String numberString = n*k+"";
		   	  		for(int j = 0;j<numberString.length();j++){
		   	  			set.add(numberString.charAt(j));
		   	  		}
		   	  		if(set.size() == 10){
		   	  			isSolved = true;
		   	  			System.out.println("Case #" + i + ": " + n*k );
		   	  		}
		   	  		k++;
		   	  } 	  
		     }
		}
	}

}
