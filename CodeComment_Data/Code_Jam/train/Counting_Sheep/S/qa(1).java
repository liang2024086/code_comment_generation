package methodEmbedding.Counting_Sheep.S.LYD449;

import java.io.*;
import java.util.*;

public class qa {
    static String str;
    static String[] arr;

    public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("qa.txt"));
		
		int t = Integer.parseInt(in.readLine().trim());
		for(int i = 0; i < t; i++) {
		    long n = Integer.parseInt(in.readLine().trim());
		    boolean[] has = new boolean[10];
		    if(n == 0) {
		    	System.out.println("Case #" + (i + 1) + ": INSOMNIA");
		    } else {
		    	boolean works = true;
		    	int mult = 1;
		    	while(works) {
		    		long temp = n * mult;
		    		while(temp != 0) {
		    			has[(int) (temp % 10)] = true;
		    			temp /= 10;
		    		}
		    		mult++;
		    		boolean works2 = true;
		    		for(int j = 0; j < 10; j++) {
		    		    works2 &= has[j];
		    		}
		    		works &= !works2;
		    	}
		    	System.out.println("Case #" + (i + 1) + ": " + (n * (mult - 1)));
		    }
		}
	}
}
