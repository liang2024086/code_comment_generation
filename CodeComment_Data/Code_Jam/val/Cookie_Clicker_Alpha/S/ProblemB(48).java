package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1047;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new FileReader("A-large-practice.in"));
		Scanner sc = new Scanner(new FileReader("B-small.in"));
		//PrintWriter pw = new PrintWriter(new FileWriter("Alarge.out"));
		PrintWriter pw = new PrintWriter(new FileWriter("Bsmall.out"));
		DecimalFormat df = new DecimalFormat("00.0000000");
		
		
		long totalCases = Long.parseLong(sc.nextLine());
		
		
		for (int i = 0; i < totalCases; i++) {
			String[] values = sc.nextLine().split("\\s+");
			double c = Double.valueOf(values[0]);
			double f = Double.valueOf(values[1]);
			double x = Double.valueOf(values[2]);
			double nextFarm = c / 2;
			double carried = 0d;
			double currentTime = x / 2;
			int n = 0;
			while (currentTime >= nextFarm + (x / (2 + f * (n + 1)))) {
				carried += nextFarm;
				n++;
				currentTime = x / (2 + f * n);
				nextFarm = c / (2 + f * n);
			}
			Double result = carried + x / (2 + f * n);
			pw.println("case #" + (i + 1) + ": " + df.format(result));
		}
		pw.close();
	}
	
}
