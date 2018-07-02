package methodEmbedding.Standing_Ovation.S.LYD1282;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		int nT;
		T1 [] testCase;
		Scanner kbd = new Scanner(System.in);
		nT = kbd.nextInt();
		testCase = new T1[nT];
		for (int i = 0; i < nT; i++) {
			int Smax = kbd.nextInt();
			String s = kbd.next();
			testCase[i] = new T1(Smax, s);
		}
		
		for (int i = 1; i <= nT; i++) {
			System.out.print("Case #" + i + ": " + testCase[i - 1].getInviteCount() + "\n");
		}
	}

}
