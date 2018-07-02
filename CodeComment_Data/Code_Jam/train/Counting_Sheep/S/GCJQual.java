package methodEmbedding.Counting_Sheep.S.LYD764;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class GCJQual {

	public static void main(String[] args) throws Exception {
		Scanner cin = new Scanner(new FileInputStream("A-small-attempt0 (1).in"));
		PrintWriter cout = new PrintWriter(new FileOutputStream("output.txt"));
		int T = cin.nextInt(), cnt, cur, N, tmp;
		boolean fnd[] = new boolean[10];
		for (int t = 0; t < T; ++t) {
			N = cin.nextInt();
			if (N == 0) {
				cout.println("Case #" + (t + 1) + ": INSOMNIA");
				continue;
			}
			cur = N;
			Arrays.fill(fnd, false);
			cnt = 0;
			while (true) {
				tmp = cur;
				while (tmp > 0) {
					if (!fnd[tmp % 10])
						cnt++;
					fnd[tmp % 10] = true;
					tmp /= 10;
				}
				if (cnt == 10)
					break;
				cur += N;
			}
			cout.println("Case #" + (t + 1) + ": " + cur);
			cout.flush();
		}
	}

}
