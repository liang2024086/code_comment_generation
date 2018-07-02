package methodEmbedding.Counting_Sheep.S.LYD358;

import java.util.*;
import java.io.*;

public class countingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
		    int m = 0;
		    String s = "";
	    	int n = in.nextInt();
			//int re = 0;
			if (n != 0){
				for (int k=1;; k++){
					m = k * n;
					String ss = Integer.toString(m);
					s = s+ss;
					//remove duplicate
					String ans="";
					char ch;
					for (int r=0; r<s.length(); r++){
						ch = s.charAt(r);
						if(ch!=' ')
							ans = ans + ch;
						s = s.replace(ch,' ');
					}
					s = ans;
					if (s.length() == 10)
						break;
				}
				System.out.println("Case #" + i + ": " + (m));
			}
			else{
				System.out.println("Case #" + i + ": " + "INSOMNIA");			
			}
	    }
	}

}
