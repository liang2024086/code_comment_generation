package methodEmbedding.Speaking_in_Tongues.S.LYD679;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class mapping {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("input.in"));
		int offset = 97;
		char[] map = new char[26];
		map[0] = 'y';
		map[1] = 'h';
		map[2] = 'e';
		map[3] = 's';
		map[4] = 'o';
		map[5] = 'c';
		map[6] = 'v';
		map[7] = 'x';
		map[8] = 'd';
		map[9] = 'u';
		map[10] = 'i';
		map[11] = 'g';
		map[12] = 'l';
		map[13] = 'b';
		map[14] = 'k';
		map[15] = 'r';
		map[16] = 'z';
		map[17] = 't';
		map[18] = 'n';
		map[19] = 'w';
		map[20] = 'j';
		map[21] = 'p';
		map[22] = 'f';
		map[23] = 'm';
		map[24] = 'a';
		map[25] = 'q';
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 1; i <= n; i++) {
			String s = scan.nextLine();
			System.out.printf("Case #%d: ", i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != ' ') {
					System.out.print(map[(((int) s.charAt(j)) - offset)]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
