package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1152;

import java.util.ArrayList;
import java.util.Scanner;

public class RevengeOfThePancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		for (int a = 0; a < t; a++) {
			String in = input.nextLine();
			boolean[] good = new boolean[in.length()];
			for (int b = in.length()-1; b >= 0; b--) {
				good[in.length()-b-1] = (in.charAt(b) == '+') ? true : false;
			}
			ArrayList<Boolean> str = new ArrayList<Boolean>();
			for (int b = 0; b < in.length(); b++) {
				if (b == 0) {
					str.add(good[b]);
				} else {
					if (good[b - 1] != good[b]) {
						str.add(good[b]);
					}
				}
			}
//			System.out.println(str);
			int output = 0;
			if (str.get(0) == false) {
				output += str.size();
			} else {
				output += str.size() - 1;
			}

			System.out.println("Case #" + (a + 1) + ":" + " " + output);
		}
	}

}
