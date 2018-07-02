package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1014;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class RevengeOfThePancakes {
	public static void main(String arg[]) throws IOException {
		int t = 1, T, answer = 0, index;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		File output = new File("Output.txt");
		FileWriter fw = new FileWriter(output);
		while (T-- != 0) {
			String s = br.readLine();
			char ch = s.charAt(0);
			answer = 1;
			index = 1;
			if (s.length() > 1) {
				while (index <= s.length() - 1) {
					if (s.charAt(index) != ch) {														
						answer++;
						ch = s.charAt(index);						
					}
					index++;
				}
			}

			if (s.charAt(s.length() - 1) == '+') {
				answer--;
			}

			fw.write("Case #" + t + ": " + answer + "\n");
			System.out.println("Case #" + t + ": " + answer);
			t++;
		}
		fw.close();
	}
}
