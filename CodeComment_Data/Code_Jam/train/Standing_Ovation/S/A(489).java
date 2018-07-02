package methodEmbedding.Standing_Ovation.S.LYD2112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class A {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			int TC = Integer.parseInt(br.readLine());
			for (int tc = 1; tc <= TC; tc++) {
				String[] line = br.readLine().split(" ");
				char[] s = line[1].toCharArray();
				int count = 0;
				int pivot = 0;
				for (int i = 0; i < s.length; i++) {
					if(s[i]=='0')
						continue;
					if (count + pivot < i) {
						pivot = i - count;
					}
					count += s[i] - '0';
				}
				System.out.println("Case #" + tc + ": " + pivot);
			}
		}
	}
}
