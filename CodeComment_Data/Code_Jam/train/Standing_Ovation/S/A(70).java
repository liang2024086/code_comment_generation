package methodEmbedding.Standing_Ovation.S.LYD1106;

import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; ++t) {
			String[] inputs = br.readLine().split(" ");
			int smax = Integer.parseInt(inputs[0]);
			String str = inputs[1];
			int count = 0;
			int sum = str.charAt(0)-'0';
			int length = str.length();
			for (int i = 1; i < length; ++i) {
				int temp = str.charAt(i)-'0';
				if (sum < i && temp > 0) {
					count += i-sum;
					sum += i-sum;
				}
				sum += temp;
			}
			out.print("Case #"+t+": ");
			out.println(count);
		}

		out.flush();
		out.close();

		System.exit(0);
	}
}
