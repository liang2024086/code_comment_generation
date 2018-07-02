package method_all.Osmos.S.LYD37;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Moto {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = parseInt(br.readLine());
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			String[] s = br.readLine().split(" ");
			int a = parseInt(s[0]), n = parseInt(s[1]);
			int num[] = new int[n];
			s = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				num[i] = parseInt(s[i]);
			}
			Arrays.sort(num);
			if (a == 1) {
				System.out.println("Case #" + caseNum + ": " + n);
				continue;
			}
			int res = 10000;
			for (int i = 0; i <= n; i++) {
				int cur = a;
				int curOp = 0;
				for (int j = 0; j < i; j++) {
					if (cur > num[j]) {
						cur += num[j];
						continue;
					}
					cur = cur * 2 - 1;
					curOp++;
					j--;
				}
				res = Math.min(res, curOp + n - i);
			}
			System.out.println("Case #" + caseNum + ": " + res);
		}
	}
}
