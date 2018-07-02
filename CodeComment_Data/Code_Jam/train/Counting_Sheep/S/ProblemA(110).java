package methodEmbedding.Counting_Sheep.S.LYD911;


import java.io.*;
import java.util.*;

public class ProblemA {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		
		for (int ecx = 1; ecx <= n; ++ecx) {
			int N = in.nextInt();

			int numSW = 0;
			int i = 1;
			int prevRes = 0;
			int tmp = 0;
			boolean[] map = new boolean[10];
			
			N = (N < 0) ? -1 * N : N;
			if (N == 0) {
				System.out.println("Case #" + ecx + ": INSOMNIA");
				continue;
			}
			
			while (numSW < 10) {
				prevRes = N * i;
				tmp = prevRes;
				while (tmp > 0) {
					if (map[tmp%10] == false) {
						map[tmp%10] = true;
						numSW++;
					}
					tmp = tmp / 10;
				}
				i++;
			}
			
			System.out.println("Case #" + ecx + ": " + prevRes);
		}
	}
}
