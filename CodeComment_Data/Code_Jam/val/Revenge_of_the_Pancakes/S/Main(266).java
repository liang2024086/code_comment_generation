package methodEmbedding.Revenge_of_the_Pancakes.S.LYD671;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();
	    in.nextLine();
	    for (int i = 1; i <= t; i++) {
	    	String str = in.nextLine();
	    	int len = str.length();
	    	int count = 0;
	    	for (int j = len - 1; j >= 0; j--) {
	    		
	    		if (str.charAt(j) == '+') {
	    			if (count % 2 != 0) {
	    				count++;
	    			}
	    		} else {
	    			if (count % 2 == 0) {
	    				count++;
	    			}
	    		}
	    	}
	    	System.out.println("Case #" + i + ": " + count);
	    }
	}
}
