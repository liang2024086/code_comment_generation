package methodEmbedding.Standing_Ovation.S.LYD1130;

import java.util.*;

public class a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
			int n = in.nextInt()-1;
			String s = in.nextLine().trim();
			int acc = 0, ans = 0;
			for (int i = 0; i < s.length(); i++){
				if (acc >= i && ((int) s.charAt(i)) != '0'){
					acc += Integer.parseInt(s.substring(i, i+1));
				} else if (((int) s.charAt(i)) == '0'){
					continue;
				} else if (acc < i && ((int) s.charAt(i)) != '0'){
					ans += (i-acc);
					acc += (i-acc);
					acc += Integer.parseInt(s.substring(i, i+1));
 				}
			}
			System.out.printf("Case #%d: ", t);
			System.out.println(ans);
		}
	}
}
