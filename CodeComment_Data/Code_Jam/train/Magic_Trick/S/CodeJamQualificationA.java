package methodEmbedding.Magic_Trick.S.LYD1569;

import java.util.Scanner;

public class CodeJamQualificationA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), w, count, ans;
		int[] ans1, ans2;
		for (int i = 0; i < t; i++) {

			ans1 = new int[4];
			ans2 = new int[4];
			
			w = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (j == w - 1){
						ans1[j2] = sc.nextInt();
					} else {
						sc.nextInt();
					}
				}
			}
			
			w = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (j == w - 1){
						ans2[j2] = sc.nextInt();
					} else {
						sc.nextInt();
					}
				}
			}
			
			count = 0;
			ans = -1;
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (ans1[j] == ans2[j2]){
						count++;
						ans = ans1[j];
					}
				}
			}
			
			System.out.print("Case #" + (i + 1) + ": ");
			switch (count) {
				case 0:
					System.out.println("Volunteer cheated!");
					break;
				case 1:
					System.out.println(ans);
					break;

				default:
					System.out.println("Bad magician!");
					break;
			}
		}
		
		sc.close();

	}

}
