package methodEmbedding.Revenge_of_the_Pancakes.S.LYD847;

import java.util.*;

public class b {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int numCases = stdin.nextInt();

		for (int loop=1; loop<=numCases; loop++) {

			String pancakes = stdin.next();

			int res = 0;
			for (int i=0; i<pancakes.length()-1; i++)
				if (pancakes.charAt(i) != pancakes.charAt(i+1))
					res++;

			if (pancakes.charAt(pancakes.length()-1) == '-') res++;
			System.out.println("Case #"+loop+": "+res);
		}
	}
}
