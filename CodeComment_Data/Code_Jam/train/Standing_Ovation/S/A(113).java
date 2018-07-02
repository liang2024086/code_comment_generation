package methodEmbedding.Standing_Ovation.S.LYD1588;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("C:\\Users\\Valentin\\workspace_luna\\CodeJam\\src\\A-small-attempt0(1).in"));
		System.setOut(new PrintStream(new File("C:\\Users\\Valentin\\workspace_luna\\CodeJam\\src\\test.out")));
		
		int t = sc.nextInt();
		sc.nextLine();
		for (int k = 0; k < t; k++) {
			String temp = sc.nextLine();
			int s_max = Integer.parseInt(temp.split(" ")[0]);
			char[] number = temp.split(" ")[1].toCharArray();
			int stand = 0;
			int friends = 0;
			for (int i = 0; i <= s_max; i++) {
				 if (i > stand && Character.getNumericValue(number[i]) > 0) {
					 friends += i - stand;
					 stand += i - stand;
				 }
				 stand += Character.getNumericValue(number[i]);
			}
			System.out.println("Case #" + (k+1) + ": " + friends);
		}

	}

}
