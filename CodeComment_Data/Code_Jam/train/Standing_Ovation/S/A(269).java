package methodEmbedding.Standing_Ovation.S.LYD2135;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {
	

	public static void main(String[] args) throws FileNotFoundException {
		File vstup = new File("A-small-attempt0 (3).in");
		Scanner s = new Scanner(vstup);
		int T = s.nextInt();
		int vysledok,sum;
		int max;
		String shy;
		for (int i = 0; i < T; i++) {
			max = s.nextInt();
			shy = s.next();
			sum = 0;
			vysledok = 0;
			for (int j = 0; j < max+1; j++) {
				if(sum < j) {
					vysledok += j-sum;
					sum = j;
				}
				sum = sum + shy.charAt(j)- '0';
			}
			System.out.printf("Case #%d: %d\n", i+1, vysledok);
		}
		
	}
}
