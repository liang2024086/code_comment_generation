package methodEmbedding.Revenge_of_the_Pancakes.S.LYD809;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] rr = new String[T];
		for (int testCase = 0; testCase < T; testCase++) {
			String s = br.readLine();
			if (!s.contains("-")) {
				rr[testCase] = "Case #" + (testCase+1) + ": 0";
				continue;
			}
			String subs = s.substring(0, s.lastIndexOf('-') + 1);
			System.out.println(subs);
			int r = 1;
			char last = subs.charAt(subs.length() - 1);
			for (int i = subs.length() - 2; i >= 0; i--) {
				if (subs.charAt(i) != last) {
					r++;
					last = subs.charAt(i);
				}
			}
			rr[testCase] = "Case #" + (testCase+1) + ": " + r;
		}
		for (String string : rr) {
			System.out.println(string);
		}
	}
}
