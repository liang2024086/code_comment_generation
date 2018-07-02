package methodEmbedding.Revenge_of_the_Pancakes.S.LYD523;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class B {


	public static void main(String[] args) {
		try {			
		
			BufferedReader buf = new BufferedReader(new FileReader(new File("/Users/Shefali/workspace2016/Codejam/src/B.in")));
			
			int T = Integer.parseInt(buf.readLine());	
			
			
			for (int i=0; i<T; i++) {				
				String S = buf.readLine();
				StringBuffer sbuf = new StringBuffer(S);
			
				int flips = 0;
				while (sbuf.indexOf("-") >=0) {
					
					char ch = sbuf.charAt(0);
					if (ch == '+') {
						int j = 1;
						String flipStr = "-";
						while (ch =='+' && j < sbuf.length()) {
							ch = sbuf.charAt(j);
							flipStr = flipStr+"-";
							j++;
						}
						sbuf.replace(0, j, flipStr);
						flips++;
					}
					else if (ch == '-') {
						int j = 1;
						String flipStr = "+";
						while (ch =='-' && j < sbuf.length()) {
							ch = sbuf.charAt(j);
							flipStr = flipStr+"+";
							j++;
						}
						sbuf.replace(0, j, flipStr);
						flips++;
					}
				}	

				System.out.println("Case #" + (i+1) + ": " + flips);
			}
			
		}
		catch (IOException e) {	
			e.printStackTrace();
		} 
	}


}
