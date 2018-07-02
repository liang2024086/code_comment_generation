package methodEmbedding.Standing_Ovation.S.LYD758;


import java.math.BigInteger;
import java.util.Scanner;

public class StandingOvation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int cases = in.nextInt();
		int result[];
		result = new int[cases];
		
		for (int k = 0; k < cases; k++) {
			int no = in.nextInt();
			int n = no + 1;
			
			String m = in.next();

			int r[];
			r = new int[n];
			int people = 0;
			int count = 0;

			if (n == 1) {
				count = 0;
			}

			for (int i = 0; i < n; i++) {
				r[i] = (int) (m.charAt(i) - '0');

			}

			for (int i = 0; i < n - 1; i++) {

				people = (people + r[i]);
				int temp = 0;

				if (r[i + 1] == 0) {

				} else {
					temp = (i + 1) - people;
				}

				if (temp > 0) {
					count = count + temp;

					people = people + temp;
				}

			}

			result[k] = count;
		}
		for(int i = 0; i<cases; i++){
			System.out.println("Case #"+(i+1)+": "+result[i]); 
		}

	}
}
