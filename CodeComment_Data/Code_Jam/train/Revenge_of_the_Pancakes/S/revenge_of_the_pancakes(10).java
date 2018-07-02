package methodEmbedding.Revenge_of_the_Pancakes.S.LYD576;

//revenge_of_the_pancakes
import java.util.*;
import java.io.*;
public class revenge_of_the_pancakes {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int num = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		
		for (int i = 1 ; i<= num; i++){
			String cur = in.next();
		  	int steps = 0;
		  	char c = cur.charAt(0);
		  	for (int j=1; j<cur.length(); j++){
		  		if (cur.charAt(j) != c){
		  			steps ++;
		  			c = cur.charAt(j);
		  		}
		  	}
		  	if (c == '-'){
		  		steps ++;
		  	}
			System.out.println("Case #" + i + ": " + steps);		
		}
	}
}
