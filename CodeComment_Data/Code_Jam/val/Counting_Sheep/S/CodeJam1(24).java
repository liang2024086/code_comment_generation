package methodEmbedding.Counting_Sheep.S.LYD314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CodeJam1 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long x = 0, var;
		int m = 0;
		int arr[] = new int[10];
		for (int i = 1; i <= t; i++) {
			int j = 1;
			long n = Long.parseLong(br.readLine());
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			Arrays.fill(arr, 0);
			while (true) {
				x = n * (j++);
				var = x;
				while (x > 0) {
					m = (int) x % 10;
					x = x / 10;
					arr[m]++;
				}				
				if (arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 && arr[3] >= 1
						&& arr[4] >= 1 && arr[5] >= 1 && arr[6] >= 1
						&& arr[7] >= 1 && arr[8] >= 1 && arr[9] >= 1) {
					break;
				}
			}
			System.out.println("Case #" + i + ": " + var);
		}
	}
}
