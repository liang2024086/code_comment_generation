package methodEmbedding.Speaking_in_Tongues.S.LYD192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		int x = 1;
		while (t > 0) {
			String g = bf.readLine();
			for (int i = 0; i < g.length(); i++) {
				char c = g.charAt(i);
				switch (c) {
				case 'a':
					g = g.substring(0, i) + "y" + g.substring(i + 1);
					break;
				case 'b':
					g = g.substring(0, i) + "h" + g.substring(i + 1);
					break;
				case 'c':
					g = g.substring(0, i) + "e" + g.substring(i + 1);
					break;
				case 'd':
					g = g.substring(0, i) + "s" + g.substring(i + 1);
					break;
				case 'e':
					g = g.substring(0, i) + "o" + g.substring(i + 1);
					break;
				case 'f':
					g = g.substring(0, i) + "c" + g.substring(i + 1);
					break;
				case 'g':
					g = g.substring(0, i) + "v" + g.substring(i + 1);
					break;
				case 'h':
					g = g.substring(0, i) + "x" + g.substring(i + 1);
					break;
				case 'i':
					g = g.substring(0, i) + "d" + g.substring(i + 1);
					break;
				case 'j':
					g = g.substring(0, i) + "u" + g.substring(i + 1);
					break;
				case 'k':
					g = g.substring(0, i) + "i" + g.substring(i + 1);
					break;
				case 'l':
					g = g.substring(0, i) + "g" + g.substring(i + 1);
					break;
				case 'm':
					g = g.substring(0, i) + "l" + g.substring(i + 1);
					break;
				case 'n':
					g = g.substring(0, i) + "b" + g.substring(i + 1);
					break;
				case 'o':
					g = g.substring(0, i) + "k" + g.substring(i + 1);
					break;
				case 'p':
					g = g.substring(0, i) + "r" + g.substring(i + 1);
					break;
				case 'q':
					g = g.substring(0, i) + "z" + g.substring(i + 1);
					break;
				case 'r':
					g = g.substring(0, i) + "t" + g.substring(i + 1);
					break;
				case 's':
					g = g.substring(0, i) + "n" + g.substring(i + 1);
					break;
				case 't':
					g = g.substring(0, i) + "w" + g.substring(i + 1);
					break;
				case 'u':
					g = g.substring(0, i) + "j" + g.substring(i + 1);
					break;
				case 'v':
					g = g.substring(0, i) + "p" + g.substring(i + 1);
					break;
				case 'w':
					g = g.substring(0, i) + "f" + g.substring(i + 1);
					break;
				case 'x':
					g = g.substring(0, i) + "m" + g.substring(i + 1);
					break;
				case 'y':
					g = g.substring(0, i) + "a" + g.substring(i + 1);
					break;
				case 'z':
					g = g.substring(0, i) + "q" + g.substring(i + 1);
					break;
				default:
					break;
				}
			}

			System.out.println("Case #" + x + ": " + g);
			x++;
		}
	}

}
