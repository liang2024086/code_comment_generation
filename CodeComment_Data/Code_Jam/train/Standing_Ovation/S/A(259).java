package methodEmbedding.Standing_Ovation.S.LYD891;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tests = scanner.nextInt();
		for(int test = 1; test <= tests; test++) {
			
			int sMax = scanner.nextInt();
			char[] shyArr = scanner.next().toCharArray();
			
			int standing = 0;
			int extras = 0;
			for(int curShy = 0; curShy <= sMax; curShy++) {
				int shyPeeps = Character.getNumericValue(shyArr[curShy]);
				if(shyPeeps > 0 && standing < curShy) {
					extras += curShy - standing;
					standing += extras;
				}
				standing += shyPeeps;
			}
			
			System.out.println(String.format("Case #%d: %d", test, extras));
		}
		
		scanner.close();
	}
}
