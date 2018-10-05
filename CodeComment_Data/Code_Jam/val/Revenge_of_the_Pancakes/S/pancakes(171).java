package methodEmbedding.Revenge_of_the_Pancakes.S.LYD763;

import java.util.*;
public class pancakes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int tt = 1; tt <= t; tt++) {
			String s = in.next();
			int start = s.lastIndexOf('-');
			
			char prev = '-';
			int ans = 1;
			for(int i = start - 1; i >= 0; i--) {
				if(s.charAt(i) != prev){
					prev = s.charAt(i);
					ans++;
				}
			}
			
			System.out.println("Case #" + tt + ": " + (start == -1 ? 0 : ans));
			
		}
	}

}
