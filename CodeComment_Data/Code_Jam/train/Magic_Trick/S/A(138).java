package methodEmbedding.Magic_Trick.S.LYD908;

import java.util.Scanner;


public class A {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		for (int j=1; j<=T; j++) {
			int ans = scn.nextInt();
			for (int i = 1; i<ans; i++) {
				int t1 = scn.nextInt(); int t2 = scn.nextInt(); int t3 = scn.nextInt();int t4 = scn.nextInt();
				//System.out.println(t1 + ":" + t2 + ":" + t3 + ":" + t4);
			}
			int[] poss = new int[4];
			for (int i=0; i<4; i++) {
				poss[i] = scn.nextInt();
			}
			for (int i = ans+1; i<=4; i++) {
				int t1 = scn.nextInt(); int t2 = scn.nextInt(); int t3 = scn.nextInt();int t4 = scn.nextInt();
				//System.out.println(t1 + ":" + t2 + ":" + t3 + ":" + t4);
			}
			ans = scn.nextInt();
			int count = 0;
			int answer = 0;

			for (int i = 1; i<ans; i++) {
				int t1 = scn.nextInt(); int t2 = scn.nextInt(); int t3 = scn.nextInt();int t4 = scn.nextInt();
				//System.out.println(t1 + ":" + t2 + ":" + t3 + ":" + t4);
			}

			for (int i=0; i<4; i++) {
				int card = scn.nextInt();
				for (int k = 0; k<4; k++) {
					if (poss[k] == card) {
						count++;
						answer = card;
					}
				}
			}
			for (int i = ans+1; i<=4; i++) {
				int t1 = scn.nextInt(); int t2 = scn.nextInt(); int t3 = scn.nextInt();int t4 = scn.nextInt();
				//System.out.println(t1 + ":" + t2 + ":" + t3 + ":" + t4);
			}
			

			
			
			
			//System.out.println("----------------------------------------");
			System.out.print("Case #" + j + ": ");
			if (count ==0) {
				System.out.println("Volunteer cheated!");
			}
			if (count ==1) {
				System.out.println(answer);
			}
			if (count >1) {
				System.out.println("Bad magician!");
			}
		}
	}
}
