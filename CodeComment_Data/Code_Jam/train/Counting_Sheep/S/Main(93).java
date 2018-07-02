package methodEmbedding.Counting_Sheep.S.LYD720;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int done = (1 << 10) - 1;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(reader.readLine());
			if (num == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}
			long cur = 0;
			long res = 0;
			while (true) {
				cur += num;
				long copy = cur;
				while (copy > 0) {
					res |= (1 << (copy % 10));
					copy /= 10;
				}
				if (res == done) {
					System.out.println("Case #" + (i + 1) + ": " + cur);
					break;
				}
			}
		}
		reader.close();
	}
}
