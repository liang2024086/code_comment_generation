package methodEmbedding.Standing_Ovation.S.LYD1789;


import java.util.Scanner;

public class cj_2015_QR_A {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		read.nextLine();
		for (int i = 1; i <= n; i++) {
			int k = read.nextInt();
			String s = read.nextLine();
			int count = 0;
			int inv = 0;
			for (int j = 0; j <= k; j++) {
				if (j > count) {
					inv += j - count;
					count += j - count;
				}
				count += s.charAt(j + 1) - 48;
			}
			System.out.println("Case #" + i + ": " + inv);
		}
		read.close();
	}

}
