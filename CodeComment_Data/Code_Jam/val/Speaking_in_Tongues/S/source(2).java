package methodEmbedding.Speaking_in_Tongues.S.LYD1614;

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
					if (s[i].charAt(j) == 'b')
						System.out.print("h");
					if (s[i].charAt(j) == 'c')
						System.out.print("e");
					if (s[i].charAt(j) == 'd')
						System.out.print("s");
					if (s[i].charAt(j) == 'e')
						System.out.print("o");
					if (s[i].charAt(j) == 'f')
						System.out.print("c");
					if (s[i].charAt(j) == 'g')
						System.out.print("v");
					if (s[i].charAt(j) == 'h')
						System.out.print("x");
					if (s[i].charAt(j) == 'i')
						System.out.print("d");
					if (s[i].charAt(j) == 'j')
						System.out.print("u");
					if (s[i].charAt(j) == 'k')
						System.out.print("i");
					if (s[i].charAt(j) == 'l')
						System.out.print("g");
					if (s[i].charAt(j) == 'm')
						System.out.print("l");
					if (s[i].charAt(j) == 'n')
						System.out.print("b");
					if (s[i].charAt(j) == 'o')
						System.out.print("k");
					if (s[i].charAt(j) == 'p')
						System.out.print("r");
					if (s[i].charAt(j) == 'q')
						System.out.print("z");
					if (s[i].charAt(j) == 'r')
						System.out.print("t");
					if (s[i].charAt(j) == 's')
						System.out.print("n");
					if (s[i].charAt(j) == 't')
						System.out.print("w");
					if (s[i].charAt(j) == 'u')
						System.out.print("j");
					if (s[i].charAt(j) == 'v')
						System.out.print("p");
					if (s[i].charAt(j) == 'w')
						System.out.print("f");
					if (s[i].charAt(j) == 'x')
						System.out.print("m");
					if (s[i].charAt(j) == 'y')
						System.out.print("a");
					if (s[i].charAt(j) == 'z')
						System.out.print("q");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}
