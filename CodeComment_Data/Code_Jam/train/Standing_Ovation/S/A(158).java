package methodEmbedding.Standing_Ovation.S.LYD1631;

import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int keis = sc.nextInt();
		for(int kei = 1; kei <= keis; kei++) {
			int sMax = sc.nextInt();
			char[] car = sc.next().toCharArray();
			int[] ar = new int[car.length];
			for(int i = 0 ; i < car.length; i++) {
				ar[i] = car[i] - '0';
			}
			// System.out.println(Arrays.toString(ar));

			int standing = 0;
			int needed = 0;
			for(int i = 0; i < ar.length; i++) {
				int kulang = 0;
				if(standing < i) {
					kulang = i - standing;
				}
				needed += kulang;
				standing += ar[i] + kulang;
				// System.out.println(i);
				// System.out.println("needed: " + needed);
				// System.out.println("standing: " + standing);
			}

			System.out.printf("Case #%d: %d\n", kei, needed);
		}
	}
}
