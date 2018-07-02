package methodEmbedding.Cookie_Clicker_Alpha.S.LYD416;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("B-small-attempt0.in"));
		PrintWriter outFile = new PrintWriter("output.txt");
		
		int T;	//Number of Test Cases
		
		T = inFile.nextInt();
		
		for (int i = 0; i < T; i++) {	//Test Cases Loop
			double C, F, X;
			double CookieCount, IncrementCookie;
			double nextbuytime, nobuytime;
			double timeelapsed = 0;
			double answer;
			
			IncrementCookie = 2;
			CookieCount = 0;
			C = inFile.nextDouble();
			F = inFile.nextDouble();
			X = inFile.nextDouble();
			
			do {
				timeelapsed += C/IncrementCookie;
				CookieCount = C;
				nobuytime = (X - CookieCount)/IncrementCookie;
				nextbuytime = X/(IncrementCookie+F);
				IncrementCookie += F;
			} while (nextbuytime < nobuytime);
			
			answer = timeelapsed + nobuytime;
			System.out.println("ANSWER: " + answer);
			outFile.println("Case #" + (i+1) + ": " + answer);
		}
		
		outFile.close();
		inFile.close();
	}

}
