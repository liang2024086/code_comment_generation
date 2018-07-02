package methodEmbedding.Revenge_of_the_Pancakes.S.LYD654;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new FileInputStream("/Users/amarziali/in.txt"));
		PrintStream out = new PrintStream(new FileOutputStream("/Users/amarziali/out.txt"));
		int cases = scanner.nextInt();
		scanner.nextLine();
		for (int caseno = 1; caseno <= cases; caseno++) {
			String cakes = scanner.nextLine();
			int moves = 0;
			System.out.println(cakes);
			while (cakes.contains("-")) {
				moves++;
				int end = 0;
				if (cakes.startsWith("+")) {
					end = cakes.lastIndexOf("+-");
					if (end < 0) {
						end = 0;
					}
				} else {
					end = cakes.lastIndexOf("-");
				}
				
				StringBuilder tmp = new StringBuilder();
				tmp.append(cakes.substring(0, end + 1).replace("-","*").replace("+", "-").replace("*", "+"));
				tmp.reverse();
				if (end != cakes.length() -1) {
					tmp.append(cakes.substring(end+1));
				}
				cakes = tmp.toString();
				System.out.println(cakes);
			}
			System.out.println();
			out.println("Case #" + caseno + ": " + moves);
		
		}

		out.close();
		scanner.close();
	}
	
}
