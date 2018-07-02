package methodEmbedding.Revenge_of_the_Pancakes.S.LYD754;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RevengePancakes {

	public static void main(String[] args) {
		

		Scanner testin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = testin.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    
		for (int i = 1; i <= t; ++i) {
		   	int result = 0;
		   	String n = testin.next();
		   	char[] parts = n.toCharArray();
		   	int l = parts.length-1;

		   	while (l > 0) {
		   		
		   		if (parts[l] == '+') {
		   			l--;
		   		}
		   		else {
		   			l--;
		   			if(parts[l] == '+') {
		   				result+=2;
		   			}
		   		}		
		   	}
		   
		   	if( parts[l] == '-') {
		   		result += 1;
		   	}
		   	
		System.out.println("Case #" + i + ": " + result );
		
		}
	}
}

