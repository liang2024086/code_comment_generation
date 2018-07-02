package methodEmbedding.Standing_Ovation.S.LYD497;

import java.util.Scanner;


public class a {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int cn = 0;
	
	while (cn++ < cases) {
		int maxShy = in.nextInt();
		
		char[] derp = in.next().toCharArray();
		
		int have = 0;
		int ans = 0;
		
		for (int i = 0; i < derp.length; i++) {
			int people = derp[i]-'0';
			if (people != 0) {
				if (have < i) {
					ans += (i - have);
					have = i;
				}
				have += people;
			}
		}
		
		System.out.printf("Case #%d: %d\n", cn, ans);
	}
}
}
