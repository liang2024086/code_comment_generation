package methodEmbedding.Standing_Ovation.S.LYD1078;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new FileReader("A-small-attempt1.in"));
	        String strT = scanner.nextLine();
	        int T = Integer.parseInt(strT);
	        int[] len_array = new int[T];
	        String[] array = new String[T];
	        for(int i=0; i<T; i++) {
	        	String str = scanner.nextLine();
	        	String[] strArray = str.split(" ");   	
	        	len_array[i] = Integer.parseInt(strArray[0]);
	        	array[i] = strArray[1];
	        }
	        PrintWriter out = new PrintWriter(new FileWriter("output1.txt"));        
	        for(int i=0; i<T; i++) {
	        	int add = 0;
	        	int current = 0;
	        	for(int j=0; j<array[i].length(); j++) {
	        		int num = array[i].charAt(j)-'0';
	        		if(j > current) {
	        			add += j - current;
	        			current += j - current;
	        		}
	        		current += num;
	        	}
	        	out.println("Case #" + (i+1) + ": " + add);
	        }
	        out.close();
	       
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
