package methodEmbedding.Revenge_of_the_Pancakes.S.LYD597;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class pancake {

	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new BufferedReader(new FileReader("A-small-practice.in")));
			int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    in.nextLine();
			for (int i = 1; i <= t; ++i) {
		    	String line = in.nextLine();
		    	char toFind = '-';
		    	int count = 0;
		    	for(int j=line.length()-1; j>=0; j--){
		    		if(line.charAt(j) == toFind){
		    			count++;
		    			if(toFind == '+')
		    				toFind = '-';
		    			else
		    				toFind = '+';
		    		}
		    	}
		    	System.out.println("Case #" + i + ": " + (count) );
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
