package methodEmbedding.Speaking_in_Tongues.S.LYD1305;

import java.util.*;

public class A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nCases = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= nCases; i++) {
			String input = sc.nextLine();
			input.toLowerCase();
			char[] inputchar = input.toCharArray();
			for (int j = 0; j < inputchar.length; j++) {
				char replace = ' ';
				switch (inputchar[j]) {
				case 'a': replace = 'y';
					break;
				case 'b': replace = 'h';
				break;
				case 'c': replace = 'e';
				break;
				case 'd': replace = 's';
				break;
				case 'e': replace = 'o';
				break;
				case 'f': replace = 'c';
				break;
				case 'g': replace = 'v';
				break;
				case 'h': replace = 'x';
				break;
				case 'i': replace = 'd';
				break;
				case 'j': replace = 'u';
				break;
				case 'k': replace = 'i';
				break;
				case 'l': replace = 'g';
				break;
				case 'm': replace = 'l';
				break;
				case 'n': replace = 'b';
				break;
				case 'o': replace = 'k';
				break;
				case 'p': replace = 'r';
				break;
				case 'q': replace = 'z';
				break;
				case 'r': replace = 't';
				break;
				case 's': replace = 'n';
				break;
				case 't': replace = 'w';
				break;
				case 'u': replace = 'j';
				break;
				case 'v': replace = 'p';
				break;
				case 'w': replace = 'f';
				break;
				case 'x': replace = 'm';
				break;
				case 'y': replace = 'a';
				break;
				case 'z': replace = 'q';
				break;
				default: break;
				}
				inputchar[j] = replace;
			}
			System.out.print("Case #" + i + ": ");

			for (int z = 0; z < inputchar.length; z++) {
				System.out.print(inputchar[z]);
			}
			System.out.print("\n");
		}
	}
}
