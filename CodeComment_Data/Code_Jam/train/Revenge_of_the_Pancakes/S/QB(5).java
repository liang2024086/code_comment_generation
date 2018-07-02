package methodEmbedding.Revenge_of_the_Pancakes.S.LYD159;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class QB {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(new File("./src/B-small-attempt0.in"));
		int t = sc.nextInt();

		PrintWriter writer = new PrintWriter("./src/B-small-attempt0.out", "UTF-8");
//		PrintStream writer = System.out;
		
		for (int k = 1; k <= t; k++) {
			writer.print("Case #" + k + ": ");
			String s = sc.next();
			char[] p = { '+', '-' };
			int flip=0;
			if(s.charAt(0)=='+')flip = 0;
			else flip = 1;
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != p[flip]) {
					flip = 1 - flip;
					count++;
				}
			}
			if(flip == 1) count++;
			writer.println(count);
		}
		writer.close();
	}
}
