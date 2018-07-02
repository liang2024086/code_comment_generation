package methodEmbedding.Standing_Ovation.S.LYD1221;



import java.util.Scanner;

// 2015/04/12
// A. Standing Ovation
public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		int T, smax, d, stood, friends;
		String digits;

		in = new Scanner(System.in);
		T = in.nextInt();

		for (int t = 1; t <= T; t++) {
			stood = 0;
			friends = 0;
			smax = in.nextInt();
			digits = in.next();

			for (int level = 0; level <= smax; level++) {
				if (stood < level) {
					friends += (level - stood);
					stood += (level - stood);
				}
				d = digits.charAt(level) - '0';
				stood += d;
			}
			
			System.out.printf("Case #%d: %d\n", t, friends);
		}
	}
}
