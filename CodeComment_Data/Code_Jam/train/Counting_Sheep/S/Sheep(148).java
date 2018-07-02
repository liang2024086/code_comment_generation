package methodEmbedding.Counting_Sheep.S.LYD1163;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class Sheep {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Jacob\\Desktop\\in"));
		PrintWriter out = new PrintWriter(new File("C:\\Users\\Jacob\\Desktop\\out"));

		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			BigInteger num = new BigInteger(in.next());
			BigInteger acc = new BigInteger(num.toString());
			if (num.equals(BigInteger.ZERO)) {
				out.println("Case #" + t + ": INSOMNIA");
				continue;
			}
			HashSet<Integer> seen = new HashSet<Integer>();
			while (true) {
				for (char digit : acc.toString().toCharArray()) {
					seen.add((int) digit);
				}
				if (seen.size() == 10) {
					break;
				}
				acc = acc.add(num);
			}
			out.println("Case #" + t + ": " + acc.toString());
		}
		
		out.close();
	}
}
