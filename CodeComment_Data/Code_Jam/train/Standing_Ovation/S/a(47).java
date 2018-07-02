package methodEmbedding.Standing_Ovation.S.LYD481;

import java.util.*;

public class a {

	public static void main(String[] args) {
		new a();
	}
	
	public a() {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int tc = 1; tc <= t; tc++) {
			int k = sc.nextInt();
			String str = sc.next();
			
			int ans = 0;
			int standing = str.charAt(0) - '0';
			for(int i = 1; i < str.length(); i++) {
				int n = str.charAt(i) - '0';
				
				if(n == 0) {
					continue;
				}
				
				if(standing < i) {
					ans += i - standing;
					standing = i;
				}
				standing += str.charAt(i) - '0';
			}
			
			System.out.println("Case #" + tc + ": " + ans);
		}
		
		sc.close();
	}
}
