package methodEmbedding.Standing_Ovation.S.LYD1330;

import java.util.Scanner;

public class Asmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int caseNbr = 1;
		while(n-- > 0) {
			int m = scan.nextInt();
			String ppl = scan.next();
			int add = 0;
			int total = 0;
			for (int i = 0; i <=m; i++) {
				if (i > total) {
					add += i - total;
					total += i - total;
				}
				total += (int) (ppl.charAt(i) - '0');
			}
			System.out.println("Case #" + caseNbr + ": " + add);
			caseNbr++;
		}
		scan.close();
	}
}
