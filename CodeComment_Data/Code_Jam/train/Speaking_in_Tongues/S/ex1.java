package methodEmbedding.Speaking_in_Tongues.S.LYD1605;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Case #" + (i + 1) + ": ");
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) != ' ') {
					if (s[i].charAt(j) == 'a')
						System.out.print("y");
					else if (s[i].charAt(j) == 'b')
						System.out.print("h");
					else if (s[i].charAt(j) == 'c')
						System.out.print("e");
					else if (s[i].charAt(j) == 'd')
						System.out.print("s");
					else if (s[i].charAt(j) == 'e')
						System.out.print("o");
					else if (s[i].charAt(j) == 'f')
						System.out.print("c");
					else if (s[i].charAt(j) == 'g')
						System.out.print("v");
					else if (s[i].charAt(j) == 'h')
						System.out.print("x");
					else if (s[i].charAt(j) == 'i')
						System.out.print("d");
					else if (s[i].charAt(j) == 'j')
						System.out.print("u");
					else if (s[i].charAt(j) == 'k')
						System.out.print("i");
					else if (s[i].charAt(j) == 'l')
						System.out.print("g");
					else if (s[i].charAt(j) == 'm')
						System.out.print("l");
					else if (s[i].charAt(j) == 'n')
						System.out.print("b");
					else if (s[i].charAt(j) == 'o')
						System.out.print("k");
					else if (s[i].charAt(j) == 'p')
						System.out.print("r");
					else if (s[i].charAt(j) == 'q')
						System.out.print("z");
					else if (s[i].charAt(j) == 'r')
						System.out.print("t");
					else if (s[i].charAt(j) == 's')
						System.out.print("n");
					else if (s[i].charAt(j) == 't')
						System.out.print("w");
					else if (s[i].charAt(j) == 'u')
						System.out.print("j");
					else if (s[i].charAt(j) == 'v')
						System.out.print("p");
					else if (s[i].charAt(j) == 'w')
						System.out.print("f");
					else if (s[i].charAt(j) == 'x')
						System.out.print("m");
					else if (s[i].charAt(j) == 'y')
						System.out.print("a");
					else if (s[i].charAt(j) == 'z')
						System.out.print("q");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}
