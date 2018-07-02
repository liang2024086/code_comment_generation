package methodEmbedding.Revenge_of_the_Pancakes.S.LYD663;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("./inputB.txt")));
		PrintWriter pw = new PrintWriter(new FileWriter(new File("./outputB.txt")));
		int n = Integer.parseInt(br.readLine());
		String line;
		int start = 0, rez;
		for (int tc = 1; tc <= n; tc++) {
			line = br.readLine();
			rez = 0;
			start = 0;
			if (line.charAt(0) == '-') {
				rez = 1;
				while (start < line.length() && line.charAt(start) == '-') {
					start++;
				}
			}
			for (int i = start; i < line.length(); i++) {
				if (i != 0 && line.charAt(i) == '-' && line.charAt(i - 1) == '+')
					rez += 2;
			}
			pw.println("Case #" + tc + ": " + rez);
			pw.flush();
		}
		pw.close();
	}
}
