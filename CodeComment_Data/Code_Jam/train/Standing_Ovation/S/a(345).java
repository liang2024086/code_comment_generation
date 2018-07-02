package methodEmbedding.Standing_Ovation.S.LYD420;

import java.io.*;
import java.util.*;

public class a {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int runs = Integer.parseInt(read.readLine());
		for(int z = 1; z <= runs; z++) {
			String line = read.readLine();
			String[] arr = line.split(" ");
			int n = Integer.parseInt(arr[0]);
			String s = arr[1];
			int p = 0, ans = 0;
			for(int i = 0; i <= n; i++) {
				if(p >= i) {
					p += Integer.parseInt(s.substring(i, i + 1));
				} else {
					ans += i - p;
					p = i + Integer.parseInt(s.substring(i, i + 1));
				}
			}
			System.out.printf("Case #%d: %d%n", z, ans);
		}
	}
}
