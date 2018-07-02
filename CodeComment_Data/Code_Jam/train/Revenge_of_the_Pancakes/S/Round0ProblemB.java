package methodEmbedding.Revenge_of_the_Pancakes.S.LYD979;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Round0ProblemB {
	
	public static void main(String[] args) {
	    try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(bf.readLine());
			for (int i=0; i<T; i++) {
				StringBuffer S = new StringBuffer(bf.readLine());
				int flips = 0;
				
				while (S.length()>0 && S.charAt(S.length()-1) == '+') S = S.deleteCharAt(S.length()-1);
				while (S.length() > 0) {
					int flipCakes = S.length();
					if (S.charAt(0) == '+') flipCakes = S.lastIndexOf("+")+1;
					
					int x=0;
					while (x<flipCakes) {
						
						char c1 = S.charAt(x/2);
						char c2 = S.charAt(flipCakes - (x/2) - 1);
						
						if (c1 == '+') 
							S.setCharAt(flipCakes - (x/2) - 1, '-'); 
						else 
							S.setCharAt(flipCakes - (x/2) - 1, '+');
						
						
						if (c2 == '+') 
							S.setCharAt(x/2, '-'); 
						else 
							S.setCharAt(x/2, '+');
						
						x=x+2;
					}
					
					while (S.length()>0 && S.charAt(S.length()-1) == '+') S.deleteCharAt(S.length()-1);
					flips++;
				}
				System.out.println("Case #" + (i+1) + ": " + flips);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
