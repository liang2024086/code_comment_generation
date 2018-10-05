package methodEmbedding.Speaking_in_Tongues.S.LYD633;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class small {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		int numStrings;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		numStrings = Integer.parseInt(in.readLine());

		String[] inputStrings = new String[numStrings];
		String[] outputStrings = new String[numStrings];

		for (int i = 0; i < numStrings; i++) {
			inputStrings[i] = in.readLine();
		}

		for (int i = 0; i < numStrings; i++) {
			outputStrings[i] = "";
			for (int j = 0; j < inputStrings[i].length(); j++) {
				switch (inputStrings[i].charAt(j)) {
				case 'e':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('e' - 'o'));
					break;
				case 'j':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('j' - 'u'));
					break;
				case 'p':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('p' - 'r'));
					break;
				case ' ':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - (' ' - ' '));
					break;
				case 'm':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('m' - 'l'));
					break;
				case 'y':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('y' - 'a'));
					break;
				case 's':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('s' - 'n'));
					break;
				case 'l':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('l' - 'g'));
					break;
				case 'c':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('c' - 'e'));
					break;
				case 'k':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('k' - 'i'));
					break;
				case 'd':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('d' - 's'));
					break;
				case 'v':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('v' - 'p'));
					break;
				case 'i':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('i' - 'd'));
					break;
				case 'r':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('r' - 't'));
					break;
				case 'b':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('b' - 'h'));
					break;
				case 't':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('t' - 'w'));
					break;
				case 'a':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('a' - 'y'));
					break;
				case 'w':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('w' - 'f'));
					break;
				case 'f':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('f' - 'c'));
					break;
				case 'g':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('g' - 'v'));
					break;
				case 'h':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('h' - 'x'));
					break;
				case 'n':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('n' - 'b'));
					break;
				case 'o':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('o' - 'k'));
					break;
				case 'q':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('q' - 'z'));
					break;
				case 'u':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('u' - 'j'));
					break;
				case 'x':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('x' - 'm'));
					break;
				case 'z':
					outputStrings[i] += (char) (inputStrings[i].charAt(j) - ('z' - 'q'));
					break;
				}
			}

			System.out.println(String.format("Case #%d: %s", i + 1,
					outputStrings[i]));
		}

	}

}
