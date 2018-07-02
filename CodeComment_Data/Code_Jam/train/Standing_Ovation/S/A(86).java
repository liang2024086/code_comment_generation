package methodEmbedding.Standing_Ovation.S.LYD461;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new FileReader("a.txt"));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(bf.readLine());
		int n;
		int value, sum, needed, diff;
		for (int i = 1; i <= tc; i++) {
			sum = needed = 0;
			StringTokenizer st = new StringTokenizer(bf.readLine());
			n = Integer.parseInt(st.nextToken());
			String vals=st.nextToken();
			for (int j = 0; j < n+1; j++) {
				value = vals.charAt(j)-'0';

				if (sum < j) {
					diff = j - sum;
					needed += diff;
					sum += diff;

				}
				sum += value;

			}
			sb.append(String.format("Case #%d: %d%n", i, needed));

		}
		FileWriter writer = new FileWriter(new File("result.txt"));

		writer.append(sb);

		writer.close();

	}

}
