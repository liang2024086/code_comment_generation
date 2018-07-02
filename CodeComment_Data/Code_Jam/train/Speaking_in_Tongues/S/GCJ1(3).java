package methodEmbedding.Speaking_in_Tongues.S.LYD590;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class GCJ1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] hold = new String[n];
		for (int i = 0; i < n; i++) {
			String temp = sc.nextLine();
			hold[i] = "";
			for (int j = 0; j < temp.length(); j++) {
				switch (temp.charAt(j)) {
				case 'a':
					hold[i] += 'y';
					break;
				case 'b':
					hold[i] += 'h';
					break;
				case 'c':
					hold[i] += 'e';
					break;
				case 'd':
					hold[i] += 's';
					break;
				case 'e':
					hold[i] += 'o';
					break;
				case 'f':
					hold[i] += 'c';
					break;
				case 'g':
					hold[i] += 'v';
					break;
				case 'h':
					hold[i] += 'x';
					break;
				case 'i':
					hold[i] += 'd';
					break;
				case 'j':
					hold[i] += 'u';
					break;
				case 'k':
					hold[i] += 'i';
					break;
				case 'l':
					hold[i] += 'g';
					break;
				case 'm':
					hold[i] += 'l';
					break;
				case 'n':
					hold[i] += 'b';
					break;
				case 'o':
					hold[i] += 'k';
					break;
				case 'p':
					hold[i] += 'r';
					break;
				case 'q':
					hold[i] += 'z';
					break;
				case 'r':
					hold[i] += 't';
					break;
				case 's':
					hold[i] += 'n';
					break;
				case 't':
					hold[i] += 'w';
					break;
				case 'u':
					hold[i] += 'j';
					break;
				case 'v':
					hold[i] += 'p';
					break;
				case 'w':
					hold[i] += 'f';
					break;
				case 'x':
					hold[i] += 'm';
					break;
				case 'y':
					hold[i] += 'a';
					break;
				case 'z':
					hold[i] += 'q';
					break;
				case ' ':
					hold[i] += ' ';
					break;
				}
			}
		}
		try {
			// Create file
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			for (int i = 0; i < n; i++) {
				out.write("Case #" + (1 + i) + ": " + hold[i]);
				if (i < n - 1)
					out.write("\n");
			}
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
