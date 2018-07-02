package methodEmbedding.Revenge_of_the_Pancakes.S.LYD402;

import java.util.*;

public class B {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	int nCase = scanner.nextInt();
	
	for (int nc = 1; nc <= nCase; nc++) {
		String S = scanner.next();
		int len = S.length();
		boolean[] up = new boolean[len];
		for (int i = 0; i < len; i++)
			if (S.charAt(i) == '+')
				up[i] = true;
		
		int ans = 0;
		boolean lastUp = !up[0];
		for (int i = 0; i < len; i++) {
			if (up[i] != lastUp) {
				ans++;
				lastUp = up[i];
			}
		}
		if (up[len-1])
			ans--;
		
		System.out.println("Case #" + nc + ": " + ans);
	}
}
}
