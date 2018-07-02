package methodEmbedding.Revenge_of_the_Pancakes.S.LYD38;

import java.util.*;
import java.math.*;
public class A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int Z = 1; Z <= cases; Z++) {
			int ans = 0;
			String cakes = sc.next();
			boolean[] flip = new boolean[cakes.length()];
			for (int i = 0; i < cakes.length(); i++) {
				flip[i] = cakes.charAt(i) == '+';
			}

			for (int i = 1; i < flip.length; i++) {
				if (flip[i-1] != flip[i]) {
					//flip [0, i-1]
					//flip everything from [0, i]
					boolean[] next = new boolean[cakes.length()];
					for (int k = 0; k <= (i-1); k++) {
						next[i-k] = !flip[k];
					}
					for (int k = i; k < next.length; k++) {
						next[k] = flip[k];
					}
					flip = next;
					ans++;
				} else {
					continue;
				}




				/*if (!flip[i]) {
					if (!flip[0]) {
						ans++;
					} else {
						for (int k = 0; k <= i; k++) {
							if (flip[k]) flip[k] = !flip[k];
						}
						ans+=2;
					}
				} else {
					continue;
				}*/
			}
			if (!flip[flip.length-1]) {
				ans++;
			}

			System.out.println("Case #" + Z + ": " + ans);
		}
	}
}
