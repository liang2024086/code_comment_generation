package methodEmbedding.Counting_Sheep.S.LYD420;

import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();
		in.nextLine();
		for (int a = 0; a < trials; a++) {
			long number = in.nextLong();
			in.nextLine();
			long number3 = number;
			long number2 = 1;
			int trials2 = 0;
			boolean correct[] = new boolean[10];
			for (int b = 0; b < correct.length; b++)
				correct[b] = false;
			boolean all = true;
			String s = Long.toString(number);
			for (int g = 0; g < s.length(); g++) {
				if (correct[s.charAt(g)-48] != true)
					correct[s.charAt(g)-48] = true;
			}
			for (int g = 0; g < correct.length; g++) {
				if (!correct[g])
					all = false;
			}
			while (!all && trials2 < 500) {
				all = true;
				number2++;
				number3 = number2*number;
				s = Long.toString(number3);
				for (int g = 0; g < s.length(); g++) {
					if (correct[s.charAt(g)-48] != true)
						correct[s.charAt(g)-48] = true;
				}
				for (int g = 0; g < correct.length; g++) {
					if (!correct[g]) {
						all = false;
						trials2++;
						break;
					}
				}
			}
			System.out.println("Case #" + (a+1) + ": " + ((trials2 < 200) ? number3 : "INSOMNIA"));
		}
	}
}
