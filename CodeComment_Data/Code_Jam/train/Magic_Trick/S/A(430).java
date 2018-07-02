package methodEmbedding.Magic_Trick.S.LYD1334;

import java.util.*;
import java.math.*;
public class A {
	static long MOD = 1000002013;
	public static void main (String [] arg) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		
		
		for (int ii = 1; ii<=T; ++ii) {
			int R = sc.nextInt();
			int N1 = 0;
			for (int i = 0; i<4; ++i) {
				for (int j = 0; j<4; ++j) {
					int tmp = sc.nextInt();
					if (i == R-1) {
						N1 |= 1 << tmp;
					}
				}
			}
			
					
					
					
			int R2 = sc.nextInt();
			int N2 = 0;
			for (int i = 0; i<4; ++i) {
				for (int j = 0; j<4; ++j) {
					int tmp = sc.nextInt();
					if (i == R2-1) {
						N2 |= 1 << tmp;
					}
				}
			}
			int i = Integer.bitCount( N1 & N2);
			int n = N1 & N2;
			int count = -1;
			while (n != 0) {
				count++;
				n = n>>1;
			}
			
			String ans = (i == 0) ? "Volunteer cheated!" : (i > 1) ? "Bad magician!" : ""+count;
			System.out.printf("Case #%d: %s\n",ii,""+ans);
		}
	}

	
	

	
}
