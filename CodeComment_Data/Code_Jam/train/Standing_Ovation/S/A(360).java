package methodEmbedding.Standing_Ovation.S.LYD1210;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException,
			FileNotFoundException {
		String input = "A-small-attempt0.in";
		String output = "A-small-attempt0.out";
		// String input = "A-large.in";
		// String output = "A-large.out";

		Scanner scan = new Scanner(new BufferedReader(new FileReader(input)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
				output)));

		int T = Integer.parseInt(scan.nextLine());
		for (int t = 1; t <= T; t++) {
			String[] info = scan.nextLine().split(" ");
			int extra = 0;
			int add = 0;
			for (int i = 0; i < info[1].length(); i++) {
				int num = info[1].charAt(i) - '0';
				if (num > 0)
					extra += num - 1;
				else {
					if (extra > 0)
						extra--;
					else
						add++;
				}
			}
			pw.println("Case #" + t + ": " + add);
		}

		scan.close();
		pw.close();
	}

}
