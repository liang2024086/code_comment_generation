package methodEmbedding.Standing_Ovation.S.LYD368;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			in.nextInt();
			int si = 0, sum = 0, friends = 0;
			for (char s : in.next().toCharArray()) {
				si++;
		        sum += Character.getNumericValue(s);
		        int diff = si - sum;
				if (diff > 0) {
					friends += diff;
					sum += diff;
				}
			}
			System.out.printf("Case #%d: ", t);
			System.out.println(friends);
		}
		in.close();
	}

}
