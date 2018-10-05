package methodEmbedding.Counting_Sheep.S.LYD1105;


import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean arr[] = new boolean[10];

		for (int tc = 1; tc <= T; tc++) {

			for (int i = 0; i < 10; i++) {
				arr[i] = false;
			}

			int N = sc.nextInt();
			if (N == 0) {
				System.out.println("INSOMNIA");
			} else {
				int temp = N;
				while (true) {
					int n = N;

					while (n > 0) {
						int rem = n % 10;
						arr[rem] = true;
						n = n / 10;
					}

					int j = 0;
					while (j < 10 && arr[j]) {
						j++;
					}
					if (j == 10) {
						System.out.println("Case #"+tc+": "+N);
						break;
					}

					N = N + temp;

				}

			}

		}
	}

}
