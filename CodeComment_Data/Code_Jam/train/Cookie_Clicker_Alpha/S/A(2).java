package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1502;

import java.util.Scanner;


public class A {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String s = "";
		for(int i = 1 ; i<=cases; i++) {
			double C, F, X, P, T;
			
			P = 2.0;
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			
			T = 0;
			while((P+F) < F*X/C) {
				T += C/P;
				P += F;
			}
			T += X/P;	
			
			s += "Case #" + i + ": " + T +"\n";
		}
		System.out.println(s);
		
	}

}
