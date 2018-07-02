package methodEmbedding.Revenge_of_the_Pancakes.S.LYD287;

import java.io.*;

public class JamB {
	public static void main (String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new FileReader ("C:\\Users\\Nadav\\workspace\\Random\\src\\B-small-attempt1.in"));
		PrintWriter out = new PrintWriter (new FileWriter ("C:\\Users\\Nadav\\workspace\\Random\\src\\output.txt"));
		int T = Integer.parseInt(in.readLine());
		for (int i = 1; i <= T; i++) {
			String temp = in.readLine();
			boolean[] pile = new boolean[temp.length()];
			for (int j = 0; j < temp.length(); j++)
				pile[j] = (temp.charAt(j) == '+');
			
			int answer = 0;
			for (int j = temp.length()-1; j >= 0; j--) {
				if (pile[j] == false) {
					answer++;
					for (int k = j; k >= 0; k--) {
						pile[k] = !pile[k];
					}
				}
			}
			
			out.println("Case #" + i + ": " + answer);
		}
		in.close();
		out.close();
	}
}
