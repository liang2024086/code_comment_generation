package methodEmbedding.Revenge_of_the_Pancakes.S.LYD655;

import java.io.*;
import java.util.*;

public class B {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("src/B-small.in"))));

		String output = "";
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= t; i++) {
			String s = sc.nextLine();
			int count = 0;
			char track = s.charAt(0);
			for (char c : s.toCharArray()) {
				if (track != c) {
					track = c;
					count++;
				}
			}
			if (track=='-')
				count++;
			
			output += "Case #" + i + ": " + count + "\n";
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/B-small.out"), "utf-8"));
		bw.write(output);
		bw.close();
	}
}
