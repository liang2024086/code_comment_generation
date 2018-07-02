package methodEmbedding.Revenge_of_the_Pancakes.S.LYD771;

import java.io.*;
import java.util.*;

public class qb {
    static String str;
    static String[] arr;

    public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("qb.txt"));
		
		int t = Integer.parseInt(in.readLine().trim());
		for(int i = 0; i < t; i++) {
		    String str = in.readLine();
		    int count = 0;
		    boolean curr = false;
		    for(int j = str.length() - 1; j > -1; j--) {
		    	if(str.charAt(j) == '-' ^ curr) {
		    		curr = !curr;
		    		count++;
		    	}
		    }
		    System.out.println("Case #" + (i + 1) + ": " + count);
		}
	}
}
