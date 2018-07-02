package methodEmbedding.Standing_Ovation.S.LYD2010;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new FileInputStream("A-small-attempt0.in"));
		PrintStream ps = new PrintStream(new FileOutputStream("A-small-attempt0.out"));
		int caseCount = scanner.nextInt();
		for (int caseNum = 1; caseNum <= caseCount; caseNum++) {
			int n = scanner.nextInt();
			String str = scanner.next();
			int count = 0;
			int max = 0;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				int num = Integer.valueOf(""+c);
				max = (i - count) > max? i - count : max;
				count += num;
			}
			ps.println("Case #" + caseNum +": " + max);
		}
	}

}
