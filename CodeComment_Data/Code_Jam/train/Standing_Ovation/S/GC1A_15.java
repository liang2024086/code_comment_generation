package methodEmbedding.Standing_Ovation.S.LYD2019;

import java.util.*;

public class GC1A_15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int ca = 1 ; ca <= T; ca++){
			int Smax = sc.nextInt();

			String count = sc.next();

			int curr = 0;
			int toAdd = 0;

			for(int j = 0; j <= Smax; j++){
				if(j > curr){
					toAdd += j - curr;
					curr = j;
				}

				curr += count.charAt(j) - '0';
			}

			System.out.println("Case #" + ca + ": " + toAdd);
		}
	}
}
