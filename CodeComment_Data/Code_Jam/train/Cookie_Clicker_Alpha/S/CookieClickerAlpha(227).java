package methodEmbedding.Cookie_Clicker_Alpha.S.LYD980;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Marco\\Desktop\\B-small-attempt0.in");
		Scanner sc = null;
		int numCases = 0;
		
		try {
			sc = new Scanner(file);
			numCases = sc.nextInt();
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Einlesen!");
			e.printStackTrace();
		}
		
		
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			
			double C = Double.parseDouble(sc.next());
			double F = Double.parseDouble(sc.next());
			double X = Double.parseDouble(sc.next());
			
			double rate = 2.0;
			double bestResult = X / rate;
			double stack = 0.0;
			double tmp;
			
			while (true) {
				
//				System.err.println(bestResult);
				
				stack = stack + (C / rate);
				rate = rate + F;
				tmp = (X / rate) + stack;
				
				if (tmp < bestResult) {
					bestResult = tmp;
				} else {
					break;
				}
			}
			
			System.out.println("Case #" + caseNum + ": " + bestResult);
			
//			System.out.print("Case #" + caseNum + ": ");
//			System.out.printf(Locale.ENGLISH,"%8f", bestResult);
//			System.out.println();
		}
	}
}
