package methodEmbedding.Magic_Trick.S.LYD747;

import java.util.*;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int a=0; a<cases; a++) {
			int first = Integer.parseInt(in.nextLine());
			int[][] arrange1 = new int[4][4];
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					arrange1[i][j] = in.nextInt();
				}
				in.nextLine();
			}
			int second = Integer.parseInt(in.nextLine());
			int[][] arrange2 = new int[4][4];
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					arrange2[i][j] = in.nextInt();
				}
				in.nextLine();
			}
			int matches = 0;
			int match = 0;
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					if(arrange1[first-1][i] == arrange2[second-1][j]) {
						matches++;
						match = arrange1[first-1][i];
					}
				}
			}
			String ans = "";
			if (matches==0) {
				ans = "Volunteer cheated!";
			}
			else if (matches==1) {
				ans = "" + match;
			}
			else {
				ans = "Bad magician!";
			}
			System.out.println("Case #"+(a+1)+": "+ans);
		}
	}

}
