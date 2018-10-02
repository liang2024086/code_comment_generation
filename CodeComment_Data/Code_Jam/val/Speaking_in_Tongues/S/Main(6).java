package methodEmbedding.Speaking_in_Tongues.S.LYD1503;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		final String tmp = "Case #";
		BufferedReader in = new BufferedReader(new FileReader(new File(
				"A-small-attempt2.in")));
		int tc = Integer.parseInt(in.readLine());
		for (int i = 0; i < tc; i++) {
			char[] g = in.readLine().toCharArray();
			for (int j = 0; j < g.length; j++) {

				switch (g[j]) {
				case 'a':
					g[j] = 'y';
					break;
				case 'b':
					g[j] = 'h';
					break;
				case 'c':
					g[j] = 'e';
					break;
				case 'd':
					g[j] = 's';
					break;
				case 'e':
					g[j] = 'o';
					break;
				case 'f':
					g[j] = 'c';
					break;
				case 'g':
					g[j] = 'v';
					break;
				case 'h':
					g[j] = 'x';
					break;
				case 'i':
					g[j] = 'd';
					break;
				case 'j':
					g[j] = 'u';
					break;
				case 'k':
					g[j] = 'i';
					break;
				case 'l':
					g[j] = 'g';
					break;
				case 'm':
					g[j] = 'l';
					break;
				case 'n':
					g[j] = 'b';
					break;
				case 'o':
					g[j] = 'k';
					break;
				case 'p':
					g[j] = 'r';
					break;
				case 'q':
					g[j] = 'z';
					break;
				case 'r':
					g[j] = 't';
					break;
				case 's':
					g[j] = 'n';
					break;
				case 't':
					g[j] = 'w';
					break;
				case 'u':
					g[j] = 'j';
					break;
				case 'v':
					g[j] = 'p';
					break;
				case 'w':
					g[j] = 'f';
					break;
				case 'x':
					g[j] = 'm';
					break;
				case 'y':
					g[j] = 'a';
					break;
				case 'z':
					g[j] = 'q';
					break;
				default:
					break;
				}
			}
			System.out.println(tmp + (i + 1) + ": " + new String(g));
		}
	}
}
