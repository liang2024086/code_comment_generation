package methodEmbedding.Speaking_in_Tongues.S.LYD1034;

import java.util.*;

public class Tongues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[] decode = new char[26];

		decode[0] = 'y'; // a
		decode[1] = 'h'; // b
		decode[2] = 'e'; // c
		decode[3] = 's'; // d
		decode[4] = 'o'; // e
		decode[5] = 'c'; // f
		decode[6] = 'v'; // g
		decode[7] = 'x'; // h
		decode[8] = 'd'; // i
		decode[9] = 'u'; // j
		decode[10] = 'i'; // k
		decode[11] = 'g'; // l
		decode[12] = 'l'; // m
		decode[13] = 'b'; // n
		decode[14] = 'k'; // o
		decode[15] = 'r'; // p
		decode[16] = 'z'; // q
		decode[17] = 't'; // r
		decode[18] = 'n'; // s
		decode[19] = 'w'; // t
		decode[20] = 'j'; // u
		decode[21] = 'p'; // v
		decode[22] = 'f'; // w
		decode[23] = 'm'; // x
		decode[24] = 'a'; // y
		decode[25] = 'q'; // z

		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			System.out.print("Case #" + (i + 1) + ": ");
			for (char c : s.toCharArray()) {
				if (c == ' ')
					System.out.print(c);
				else
					System.out.print(decode[c - 'a']);
			}
			System.out.println();
		}
	}
}
