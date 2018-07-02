package methodEmbedding.Speaking_in_Tongues.S.LYD1204;

import java.util.*;
class Googlerese {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numCases; i++) {
			String str = sc.nextLine();
			String str2 = "";
			for (int k = 0; k < str.length(); k++) {
				char temp = str.charAt(k);
				if ('a' == temp)
					str2 += 'y';
				else if ('b' == temp)
					str2 += 'h';
				else if ('c' == temp)
					str2 += 'e';
				else if ('d' == temp)
					str2 += 's';
				else if ('e' == temp)
					str2 += 'o';
				else if ('f' == temp)
					str2 += 'c';
				else if ('g' == temp)
					str2 += 'v';
				else if ('h' == temp)
					str2 += 'x';
				else if ('i' == temp)
					str2 += 'd';
				else if ('j' == temp)
					str2 += 'u';
				else if ('k' == temp)
					str2 += 'i';
				else if ('l' == temp)
					str2 += 'g';
				else if ('m' == temp)
					str2 += 'l';
				else if ('n' == temp)
					str2 += 'b';
				else if ('o' == temp)
					str2 += 'k';
				else if ('p' == temp)
					str2 += 'r';
				else if ('q' == temp)
					str2 += 'z';
				else if ('r' == temp)
					str2 += 't';
				else if ('s' == temp)
					str2 += 'n';
				else if ('t' == temp)
					str2 += 'w';
				else if ('u' == temp)
					str2 += 'j';
				else if ('v' == temp)
					str2 += 'p';
				else if ('w' == temp)
					str2 += 'f';
				else if ('x' == temp)
					str2 += 'm';
				else if ('y' == temp)
					str2 += 'a';
				else if ('z' == temp)
					str2 += 'q';
				else 
					str2 += ' ';
			}
			System.out.println("Case #" + (i + 1) + ": " + str2);
		}
	}
}
