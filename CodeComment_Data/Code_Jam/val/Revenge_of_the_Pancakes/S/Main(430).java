package methodEmbedding.Revenge_of_the_Pancakes.S.LYD212;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("input.in");
		Scanner in = new Scanner(file);
		BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));

		int T = Integer.parseInt(in.next()), j = 0;

		while (j < T) {
			String N = in.next();
			int flips = 0;
			while (true) {
				if (N.length() == 1) {
					if (N.charAt(0) == '-') {
						String temp = "";
						N = temp.concat("+");
						flips++;
						output.write("Case #" + (j + 1) + ": " + flips);
						output.newLine();
						break;
					}
					output.write("Case #" + (j + 1) + ": " + flips);
					output.newLine();
					break;
				} else {

					for (int i = 0; i < N.length() - 1; i++) {
						if (N.charAt(i) != N.charAt(i + 1)) {
							String temp = "";
							for (int k = 0; k <= i; k++) {
								if (N.charAt(k) == '+') {
									temp = temp + "-";
								} else {
									temp = temp + "+";
								}
							}
							N = temp.concat(N.substring(i + 1));
							flips++;
						}
					}
					if (N.charAt(0) == '-') {
						String val = "";
						for (int i = 0; i < N.length(); i++) {
							val = val + "+";
						}
						N = val;
						flips++;
					}
					output.write("Case #" + (j + 1) + ": " + flips);
					output.newLine();
					break;
				}
			}
			j++;
		}
		output.close();
		in.close();
	}

}
