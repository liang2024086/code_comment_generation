package methodEmbedding.Standing_Ovation.S.LYD1258;

import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 1; k <= t; k++){
			int m = sc.nextInt();
			String s = sc.next();
			int p = 0;
			int sum = 0;
			for (int i = 0; i < s.length(); i++){
				int temp = 0;
				if (sum < i)
					temp = i - sum;
				sum += temp + Integer.parseInt(s.substring(i, i+1));
				p += temp;
			}
			System.out.println("Case #" + k + ": " + p);
		}
	}
}


/*
4
4 11111
1 09
5 110011
0 1

*/
