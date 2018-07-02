package methodEmbedding.Standing_Ovation.S.LYD1828;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for( int i = 0; i < cases; i++ ) {
			int sMax = sc.nextInt();	
			int people = sc.nextInt();
			int standing = 0;
			int needed = 0;
			int ref = (int) Math.pow(10, sMax);
			for( int j = 0; j < sMax + 1; j++ ) {
				int Sk = (people / ref) % 10;
				if( j > standing ) {
					needed += (j - standing);
					standing += (j - standing);					
				}
				standing += Sk;
				ref = ref/10;
			}
			System.out.println("Case #"+(i+1)+": "+needed);
		}
		sc.close();
	}
}
