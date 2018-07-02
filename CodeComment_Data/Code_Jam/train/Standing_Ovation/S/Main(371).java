package methodEmbedding.Standing_Ovation.S.LYD148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int t, j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		int cases = 1;
		while (t-- != 0) {
			String[] arr = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			String str = arr[1];
			int total = str.charAt(0)-'0';
			int ans = 0;
			for (int shynessLevel = 1; shynessLevel <= n; shynessLevel++) {
				int numOfPeople = str.charAt(shynessLevel) -'0';
				if (numOfPeople == 0) {
					continue;
				} else if (shynessLevel > total) {
					ans += (shynessLevel - total);
					total += (shynessLevel - total);
				}
				total += numOfPeople;
			}
			System.out.println("Case #" + cases + ": " + ans);
			cases++;
		}
	}
}
