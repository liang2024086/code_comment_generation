package methodEmbedding.Standing_Ovation.S.LYD1129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int testcase = 1;testcase<=t;testcase++) {
			int ans = 0;
			String str[] = br.readLine().split(" ");
			int sMax = Integer.valueOf(str[0]);
			char[] nPeople = str[1].toCharArray();

			// Calc extra people
			int standing = 0;
			for(int Si=0;Si<=sMax;Si++) {
				int x = nPeople[Si] - '0';
				int extra = 0;
				if(Si>standing) {
					extra = Si - standing;
					ans = ans + extra;
				}
				standing = standing + x + extra;
			}
			
			System.out.println("Case #"+testcase+": "+ans);
		}
	}
}
