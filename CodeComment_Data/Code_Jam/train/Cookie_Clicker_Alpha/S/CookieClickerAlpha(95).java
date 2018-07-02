package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1272;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 @Author : CHIMA VICTOR
 @Date   : 12 avr. 2014
 *
 */

public class CookieClickerAlpha {

	public final static String PROBLEM_NAME = "CookieClickerAlpha";
	public final static String WORK_DIR = "D:\\COMPETITIONS\\CodeJam\\" + PROBLEM_NAME + "\\";
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileReader(WORK_DIR + "input.in"));
		PrintWriter pw = new PrintWriter(new FileWriter(WORK_DIR + "output.out"));
		
		int nbTestCases = sc.nextInt();
		for (int i = 1; i <= nbTestCases; i++) {
			sc.nextLine();
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			int n = (int) Math.floor(((x * f - 2 * c) / (f * c)) - 1) + 1;
			if(n < 1){
				pw.println("Case #" + i + ": " + String.format("%.7f", x / 2));	
				continue;
			}
			double earnings = 2;
			double time = c / 2;
			for(int j = 1; j < n; j++){
				earnings += f;
				time += c / earnings;
			}
			time += x / (earnings + f);
			pw.println("Case #" + i + ": " + String.format("%.7f", time));
		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
