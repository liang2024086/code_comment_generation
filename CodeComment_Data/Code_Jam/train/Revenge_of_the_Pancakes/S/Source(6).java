package methodEmbedding.Revenge_of_the_Pancakes.S.LYD723;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class RevengeOfThePancakes {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);

		int testCases = Integer.parseInt(rd.readLine());
		
		int testCase = 1;
		while (testCases-- > 0) {
			String str = rd.readLine();
			
			int count = 1;
			char lastChar = str.charAt(0);
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) != lastChar) {
					count++;
					lastChar = str.charAt(i);
				}
			}
			
			if (lastChar == '+') {
				wr.println("Case #" + testCase + ": " + (count - 1));
			}
			else wr.println("Case #" + testCase + ": " + count);
			testCase++;
		}

		wr.close();
	}
}
