package methodEmbedding.Revenge_of_the_Pancakes.S.LYD288;

import java.io.*;
import java.util.*;

public class Revenge {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader("input" + (args.length == 0 ? "" : args[0]) + ".txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output" + (args.length == 0 ? "" : args[0]) + ".txt"));
		int numOfCase = sc.nextInt();

		for (int i = 1; i <= numOfCase; i++) {
			String token = sc.next();
			int count = 0;
			char lastChar = '.';
			for (char c : token.toCharArray()) {
				if (c == '-') {
					if (lastChar == '.') count++;
					else if (lastChar == '+') count += 2;
				}
				lastChar = c;
			}
			pw.println("Case #" + i + ": " + count);
		}
		
		pw.flush();
		pw.close();
		sc.close();
	}
}
