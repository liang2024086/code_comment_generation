package methodEmbedding.Counting_Sheep.S.LYD1616;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

    for (int i = 1; i <= t; ++i) {
      int a = in.nextInt();
      if(a > 0){
      	boolean[] numbers = new boolean[10];
		int aux = a;
		int k = 2;
		int result = 0;
      	while(!(numbers[0] && numbers[1] && numbers[2] && numbers[3] && numbers[4] &&
      		  numbers[5] && numbers[6] && numbers[7] && numbers[8] && numbers[9])){
      		
      		String aString = Integer.toString(aux);
      		result = aux;
      		for (int j = 0; j < aString.length(); j++){
      			Character c = aString.charAt(j);
      			int n = Integer.parseInt(c.toString());
      			numbers[n] = true;
      		}

      		aux = k++ * a;
      	}
      	System.out.println("Case #" + i + ": " + 
	    	result
	    );

  	  }else{
  	  	System.out.println("Case #" + i + ": " + 
  	  		"INSOMNIA"
      	);
  	  }
    }
  }
}
