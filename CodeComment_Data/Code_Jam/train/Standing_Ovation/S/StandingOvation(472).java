package methodEmbedding.Standing_Ovation.S.LYD1051;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader(new File("A-small-attempt0.in")), 256 << 10));
			BufferedWriter out = new BufferedWriter(new FileWriter(new File("output.txt")), 256 << 10);

			int testsNumber = in.nextInt();
			for (int testId = 1; testId <= testsNumber; testId++) {
				int k = in.nextInt();
				char[] shyness = in.next().toCharArray();
				int ovations = 0;
				int friends = 0;
				for (int i = 0; i <= k; i++) {
					if (shyness[i] != '0') {
						friends += Math.max(0, i - ovations - friends);
						ovations += shyness[i] - '0';
					}
				}
				out.append("Case #" + testId + ": " + friends);
				out.append("\n");
			}
			in.close();
			out.close();
		}
		catch (RuntimeException rte) {
			throw rte;
		}
		catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}
