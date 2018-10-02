package methodEmbedding.Standing_Ovation.S.LYD1100;

import java.util.*;
import java.io.*;

public class Prob1 {
	Scanner input;
	PrintWriter output;

	public Prob1() throws Exception {
		input = new Scanner(new File("Prob1.in"));
		output = new PrintWriter(System.out);

		long T = input.nextInt();
		long C = 1;

		while (input.hasNext()) {
			long max = input.nextInt();
			long ret = 0;
			long standing = 0;
			String val = input.next();

			//System.out.println(max + " " + val);
			for (int i = 0; i <= max; i++) {
				int n = Integer.parseInt(val.substring(i,i+1));
				//System.out.printf("testing n = %d\n",n);

				if (n == 0 || i == 0 || standing >= i) {
					standing += n;
				} else {
					long temp = 0;
					temp = i - standing;
					ret += temp;
					standing += temp + n;
				}
			}

			System.out.printf("Case #%d: %d\n",C++, ret);

		}
	}

	public static void main(String args[]) throws Exception {
	new Prob1();
	}

}
