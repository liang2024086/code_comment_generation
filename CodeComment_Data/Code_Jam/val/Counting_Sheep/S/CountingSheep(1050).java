package methodEmbedding.Counting_Sheep.S.LYD1365;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		for (int i = 1; i <=T; i++) {
			int N = sc.nextInt();
			if (N == 0) {
				System.out.printf("Case #%d: %s\n", i, "INSOMNIA");
			}
			else{
				HashSet<Character> hs = new HashSet<>();
				int ans = 0;
				while (hs.size() < 10) {
					ans += N;
					String s = "" + ans;
					for (int j = 0; j < s.length(); j++){
						hs.add(s.charAt(j));
					}
				}
				System.out.printf("Case #%d: %d\n", i, ans);
			}
		}
		sc.close();
	}
}
