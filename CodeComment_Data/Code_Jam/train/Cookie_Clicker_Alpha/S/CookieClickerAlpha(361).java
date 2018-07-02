package methodEmbedding.Cookie_Clicker_Alpha.S.LYD733;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int caseCount = Integer.parseInt(br.readLine());
			for (int caseNum = 1; caseNum < caseCount + 1; caseNum++) {
				String[] nums = br.readLine().split(" ");
				double c = Double.parseDouble(nums[0]);
				double f = Double.parseDouble(nums[1]);
				double x = Double.parseDouble(nums[2]);
				double pr = 2.0;
				double time = 0.0;
				while (x / pr + time > x / (pr + f) + (c / pr) + time) {
					time += c / pr;
					pr += f;
				}
				System.out.println("Case #" + caseNum + ": "
						+ String.format("%.7f", x / pr + time));
			}
		} catch (IOException e) {
		}
	}
}
