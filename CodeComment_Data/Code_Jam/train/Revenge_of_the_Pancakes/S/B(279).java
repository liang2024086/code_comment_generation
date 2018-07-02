package methodEmbedding.Revenge_of_the_Pancakes.S.LYD554;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter("b-small.out");

		int T = Integer.parseInt(in.nextLine().trim());

		for (int cn = 1; cn <= T; cn++) {
			char[] arr = in.nextLine().trim().toCharArray();
			int c = 0;

			while (true) {
				int i = 0;
				for (i = 1; i < arr.length; i++)
					if (arr[i] != arr[i - 1])
						break;
				if (i == arr.length)
					break;
				for (int j = 0; j < i; j++) {
					if (arr[j] == '+')
						arr[j] = '-';
					else
						arr[j] = '+';
				}
				c++;
			}

			out.printf("Case #%d: %d\n", cn, (arr[0] == '+' ? c : c + 1));
		}

		out.close();
		in.close();
	}

}
