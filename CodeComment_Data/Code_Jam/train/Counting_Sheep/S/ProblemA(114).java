package methodEmbedding.Counting_Sheep.S.LYD24;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ans = s.nextLine();
		int testNo = Integer.parseInt(ans);
		for (int i = 0; i < testNo; i++) {
			ans = s.next();
			if (ans.equals("0")) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			} else {

				// bit index for digits
				int digits = 0;
				// checking already existing digits
				char[] nChar = ans.toCharArray();
				int[] nOrig = new int[nChar.length];
				for (int j = 0; j < nOrig.length; j++) {
					nOrig[j] = (int) (nChar[nChar.length - 1 - j] - '0');
					digits |= (1 << nOrig[j]);
				}
				int[] n = nOrig.clone();
				while (digits != 1023) {
					boolean carry = false;
					int sum;
					for (int j = 0; j < nOrig.length; j++) {
						sum = nOrig[j] + n[j];
						if (carry) {
							sum += 1;
						}

						if (sum > 9) {
							carry = true;
							sum -= 10;
						} else {
							carry = false;
						}
						n[j] = sum;
						digits |= 1 << n[j];
					}
					if (carry) {
						if (nOrig.length == n.length) {
							int[] nTemp = new int[n.length + 1];
							int j;
							for (j = 0; j < n.length; j++) {
								nTemp[j] = n[j];
							}
							n = nTemp;
						}
						n[n.length - 1]++;
						digits |= 1 << n[n.length - 1];
					}
				}
				System.out.print("Case #" + (i + 1) + ": ");
				for (int j = n.length - 1; j > -1; j--) {
					System.out.print(n[j]);
				}
				System.out.println();
			}
		}
		s.close();
	}

}
