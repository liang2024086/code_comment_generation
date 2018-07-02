package methodEmbedding.Standing_Ovation.S.LYD1729;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class c {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String delims = " ";
	    int T = Integer.parseInt(br.readLine());
	    for(int af =1 ; af <= T; af++){
	    	String[] words = br.readLine().split(delims);
	    	int N = Integer.parseInt(words[0]);
		int ans = 0;
		int sum = 0;
		for(int i =0 ; i <= N; i++)
		{
			int temp = Character.getNumericValue(words[1].charAt(i));
			int diff = Math.max(0,i-sum); 
			ans += diff;
			sum += temp+diff;
		}
		System.out.println("Case #"+af+": "+ans);
	    }
    }
}

