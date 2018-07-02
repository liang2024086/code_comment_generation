package methodEmbedding.Standing_Ovation.S.LYD989;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		for (int t = 0; t < T; t++) {
			String[] s = in.nextLine().split(" ");
			char[] ch = s[1].toCharArray();
			long standUp = 0;
			long required = 0;
			for (int i = 0; i <= Integer.parseInt(s[0]); i++) {
				if (standUp >= i)
					standUp += Integer.parseInt(ch[i] + "");
				else {
					if (Integer.parseInt(ch[i] + "") != 0) {
						required += (i - standUp);
						standUp += Integer.parseInt(ch[i] + "") + (i - standUp);
					}
				}
			}
			System.out.println("Case #" + (t + 1) + ": " + required);
		}

	}

}
