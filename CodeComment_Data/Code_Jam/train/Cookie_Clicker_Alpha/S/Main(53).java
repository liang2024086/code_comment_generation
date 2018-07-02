package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1265;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;




public class Main {
	static int gridSize = 4;
	static String input = "/Users/zliu/Downloads/B-small-attempt0.in";
	static String output = "/Users/zliu/Downloads/B-small.out";
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(input));
		PrintWriter out = new PrintWriter(output);
		int T = scanner.nextInt();
		for (int t = 1; t <= T; ++t) {
			out.format("Case #%d: ", t);
			
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			
			double R = 2.0;
			
			double tm = 0.0;
			
			while (C / R + X / (R + F) < X / R) {
				tm += C / R;
				R += F;
			}
			
			tm += X / R;
			
			out.println(tm);
		}
		
		out.close();
	}
}
