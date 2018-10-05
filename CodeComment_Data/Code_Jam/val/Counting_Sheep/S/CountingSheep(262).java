package methodEmbedding.Counting_Sheep.S.LYD1501;

import java.util.Scanner;


public class CountingSheep {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			int N = sc.nextInt();
			System.out.print("Case #" + caseNum + ": ");
			if (N == 0) {
				System.out.println("INSOMNIA");
			}
			else {
				boolean[] seen = new boolean[10];
				int left = 10;
				int cur = N;
				while (left != 0) {
					int test = cur;
					while (test != 0) {
						int dig = test % 10;
						if (!seen[dig]) {
							seen[dig] = true;
							left--;
						}
						test /= 10;
					}
					cur += N;
				}
				System.out.println(cur - N);
			}
		}
	}
}
