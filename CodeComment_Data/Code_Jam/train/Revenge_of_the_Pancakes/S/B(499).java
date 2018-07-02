package methodEmbedding.Revenge_of_the_Pancakes.S.LYD446;

import java.util.*;
public class B {
	public static void main (String [] arg) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 1; ii<=T; ++ii) {
			
			String s = sc.next();
			char buffer = s.charAt(0);
			int groups = 1;
			for (int i = 1; i<s.length(); ++i) {
				char tmp = s.charAt(i);
				if (tmp != buffer) groups++;
				buffer = tmp;
			}
			int ans = (s.charAt(s.length()-1) == '-') ? groups : groups-1;
			
			System.out.printf("Case #%d: %s\n",ii,ans);
		}
	}
}
