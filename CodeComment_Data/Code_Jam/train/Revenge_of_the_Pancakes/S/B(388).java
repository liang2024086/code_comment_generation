package methodEmbedding.Revenge_of_the_Pancakes.S.LYD912;

import java.util.*;
import java.io.*;

public class B {
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner qwe = new Scanner(new File("B.in"));
		PrintWriter out = new PrintWriter("B.out");
				
		int T = qwe.nextInt();
		
		for(int cse = 1; cse <= T; cse++){
						
			char[] pan = qwe.next().toCharArray();
			int ans = 0;
			if(pan[pan.length-1] == '-') ans++;
			if(pan.length != 1){
				
				char p = pan[0];
				for (int i = 1; i < pan.length; i++) {
					if(p != pan[i]) ans++;
					p= pan[i];
				}
				
				
			}
			
			
			
			
			out.println("Case #"+cse+": "+ans);
			
		}
		
		
		out.close();
		qwe.close();
	}

}
