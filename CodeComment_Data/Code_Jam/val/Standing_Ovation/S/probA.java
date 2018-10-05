package methodEmbedding.Standing_Ovation.S.LYD1140;

import java.util.*;
import java.io.*;

public class probA {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		int ds = Integer.parseInt(sc.nextLine());
		for (int _ = 0; _ < ds; _++) {
			String[] tok = sc.nextLine().split("\\s+");
			int smax = Integer.parseInt(tok[0]);
			int[] aud = new int[smax + 1];
			for (int i = 0; i < smax + 1; i++) {
				aud[i] = Integer.parseInt("" + tok[1].charAt(i));
			}
			int clapping = 0;
			int need = 0;
			for (int i = 0; i < smax + 1; i++) {
				if (clapping >= i) {
					clapping += aud[i];
				} else {
					if (aud[i] != 0) {
						need += i - clapping;
						clapping += i - clapping;
						clapping += aud[i];
					}
				}
			}
			System.out.println("Case #" + (_ + 1) + ": " + need);
		}
	}
}
