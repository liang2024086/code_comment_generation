package methodEmbedding.Counting_Sheep.S.LYD1476;


import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("input/a-small.in"));
		PrintWriter output = new PrintWriter(new File("output/a-small.out"));
		//Scanner input = new Scanner(System.in);
		//PrintWriter output = new PrintWriter(System.out);

		int t = input.nextInt();
		primary: for (int casen = 1; casen <= t; casen++) {
			output.print("Case #" + casen + ": ");
			int n = input.nextInt();
			if (n == 0) {
				output.println("INSOMNIA");
				output.flush();
				continue primary;
			}
			Set<Character> s = new HashSet<Character>();
			for (int i = 1; true; i++) {
				for (char c : ("" + (i * n)).toCharArray()) { 
					s.add(c);
				}
				if (s.size() == 10) {
					output.println(i * n);
					output.flush();
					continue primary;
				}
			}
		}
	}
}
