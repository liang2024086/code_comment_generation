package methodEmbedding.Standing_Ovation.S.LYD1346;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int cases = 1; cases <= T; cases++) {
			int Smax = sc.nextInt();
			String s = sc.next();
			int additional = 0;
			int total = 0;
			for (int i = 0; i <= Smax; i++) {
				if (total < i) {
					additional += (i - total);
					total = i;
				}
				total += s.charAt(i) - '0';
			}
			System.out.println("Case #" + cases + ": " + additional);
		}
		sc.close();
	}

}
