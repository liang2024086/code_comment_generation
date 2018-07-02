package methodEmbedding.Standing_Ovation.S.LYD1484;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


class StandingOvation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		int t = Integer.parseInt(br.readLine());
		int max;
		char arr[];
		
		long ans, standing;
		
		while (T <= t) {
			String str[] = br.readLine().split(" ");
			max = Integer.parseInt(str[0]);
			arr = new char[max + 1];
			arr = str[1].toCharArray();
			ans = 0; standing = 0;
			
			if (arr[0] == '0') {
				ans += 1;
				standing += 1;
			} else {
				standing += arr[0] - '0';
			}
			
			for (int i = 1; i < max + 1; i++) {
				if (arr[i] != '0') 
					if (standing < i) {
						ans += i - standing;
						standing += i - standing;						
					}
				standing += arr[i] - '0';
			}
			out.println("Case #" + T + ": " + ans);
			T++;			
		}
		out.flush();
	}
}
