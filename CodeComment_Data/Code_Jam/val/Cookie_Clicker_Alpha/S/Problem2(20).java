package methodEmbedding.Cookie_Clicker_Alpha.S.LYD953;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Problem2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		BufferedWriter output = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
		int T = Integer.parseInt(input.nextLine());
		for (int i = 0; i < T; i++) {
			String caseLine = input.nextLine();
			String[] caseLineArr = caseLine.split(" ");
			double C = Double.parseDouble(caseLineArr[0]);
			double F = Double.parseDouble(caseLineArr[1]);
			double X = Double.parseDouble(caseLineArr[2]);
			double prevRoundSec;
			double curRoundSec = Double.MAX_VALUE;
			
			double forNext = 0;
			int j = 0;
			do {
				prevRoundSec = curRoundSec;
				curRoundSec = forNext + X / (2 + (j * F));
				forNext += C / (2 + (j * F));
				j++;
			} while (curRoundSec < prevRoundSec);
			output.write("Case #" + (i + 1) + ": " + prevRoundSec + (i != T-1 ? "\n" : ""));
		}
		output.close();
	}

}
