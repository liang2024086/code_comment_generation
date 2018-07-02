package methodEmbedding.Speaking_in_Tongues.S.LYD676;

import java.util.*;

public class A {
	public static void main (String [] args) {
				
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();        
		char[] map = new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l',
                                'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
        s.nextLine();
		for (int t = 1; t <= T; t++) {
			StringBuilder ans = new StringBuilder(s.nextLine());
            for (int i = 0; i < ans.length(); i++) {
                char ch = ans.charAt(i);
                if (ch != ' ') {
                    ans.setCharAt(i, map[ch - 'a']);
                }
            }
			
			System.out.println("Case #" + t + ": " + ans.toString());
		}
	}
}
