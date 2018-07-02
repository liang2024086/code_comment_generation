package methodEmbedding.Speaking_in_Tongues.S.LYD589;

import java.util.Scanner;
import java.io.File;

public class Tongues {
	public static void main (String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("input"));
		} catch (Exception e) {}
		String in, out;
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= T; i++) {
			in = sc.nextLine();
			out = "Case #" + i + ": ";
			for (int j = 0; j < in.length(); j++) {
				switch (in.charAt(j)) {
					case ' ':
						out = out.concat(" ");
						break;
					case 'a':
						out = out.concat("y");
						break;
					case 'b':
						out = out.concat("h");
						break;
					case 'c':
						out = out.concat("e");
						break;
					case 'd':
						out = out.concat("s");
						break;
					case 'e':
						out = out.concat("o");
						break;
					case 'f':
						out = out.concat("c");
						break;
					case 'g':
						out = out.concat("v");
						break;
					case 'h':
						out = out.concat("x");
						break;
					case 'i':
						out = out.concat("d");
						break;
					case 'j':
						out = out.concat("u");
						break;
					case 'k':
						out = out.concat("i");
						break;
					case 'l':
						out = out.concat("g");
						break;
					case 'm':
						out = out.concat("l");
						break;
					case 'n':
						out = out.concat("b");
						break;
					case 'o':
						out = out.concat("k");
						break;
					case 'p':
						out = out.concat("r");
						break;
					case 'q':
						out = out.concat("z");
						break;
					case 'r':
						out = out.concat("t");
						break;
					case 's':
						out = out.concat("n");
						break;
					case 't':
						out = out.concat("w");
						break;
					case 'u':
						out = out.concat("j");
						break;
					case 'v':
						out = out.concat("p");
						break;
					case 'w':
						out = out.concat("f");
						break;
					case 'x':
						out = out.concat("m");
						break;
					case 'y':
						out = out.concat("a");
						break;
					case 'z':
						out = out.concat("q");
						break;
				}
			}
			if (i != T)
				out = out.concat("\n");
			System.out.print(out);
		}
	}
}
