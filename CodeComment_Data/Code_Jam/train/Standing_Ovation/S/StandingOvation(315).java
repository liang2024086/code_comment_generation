package methodEmbedding.Standing_Ovation.S.LYD994;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int r, S, p, i;
		String aud;
		
		for (int t = 1; t <= T; t++){
			p = 0;
			r = 0; 
			S = 0;
			i = 0;
			S = sc.nextInt();
			aud = sc.nextLine();
			
			for (int s = 0; s <= S; s++) {
				i = Character.getNumericValue(aud.charAt(s + 1));
				
				if (p < s) {
					r += s - p;
					p = s;
				}	
								
				p += i;
			}
			
			System.out.println("Case #" + t + ": " + r);
		}		
	}
}
