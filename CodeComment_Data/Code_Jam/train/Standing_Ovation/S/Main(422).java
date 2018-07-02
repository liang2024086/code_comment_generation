package methodEmbedding.Standing_Ovation.S.LYD112;

import java.io.CharArrayReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int T=0, Smax=0;
		String S;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int convidados=0,
				empe=0;
			Smax = sc.nextInt();
			S = sc.next();		
			for (int k = 0; k <= Smax; k++) {
				if(empe >= k || Character.getNumericValue(S.charAt(k)) == 0)
					empe += Character.getNumericValue(S.charAt(k));
				else
					empe += Character.getNumericValue(S.charAt(k)) + (convidados += k - empe);				
			}
			
			System.out.println("Case #"+ i + ": "+ convidados);			
		}
		sc.close();
	}
}
