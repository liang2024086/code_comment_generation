package methodEmbedding.Speaking_in_Tongues.S.LYD237;

import java.util.*;
public class Googlerese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String input = sc.nextLine();
				char[] c = input.toLowerCase().toCharArray();
				char[] d = new char[c.length];
				for (int j = 0; j < c.length; j++) {
					if (c[j] == 'a') {
						d[j] = 'y';
					} if (c[j] == 'b') {
						d[j] = 'h';
					} if (c[j] == 'c') {
						d[j] = 'e';
					} if (c[j] == 'd') {
						d[j] = 's';
					} if (c[j] == 'e') {
						d[j] = 'o';
					} if (c[j] == 'f') {
						d[j] = 'c';
					} if (c[j] == 'g') {
						d[j] = 'v';
					} if (c[j] == 'h') {
						d[j] = 'x';
					} if (c[j] == 'i') {
						d[j] = 'd';
					} if (c[j] == 'j') {
						d[j] = 'u';
					} if (c[j] == 'k') {
						d[j] = 'i';
					} if (c[j] == 'l') {
						d[j] = 'g';
					} if (c[j] == 'm') {
						d[j] = 'l';
					} if (c[j] == 'n') {
						d[j] = 'b';
					} if (c[j] == 'o') {
						d[j] = 'k';
					} if (c[j] == 'p') {
						d[j] = 'r';
					} if (c[j] == 'q') {
						d[j] = 'z';
					} if (c[j] == 'r') {
						d[j] = 't';
					} if (c[j] == 's') {
						d[j] = 'n';
					} if (c[j] == 't') {
						d[j] = 'w';
					} if (c[j] == 'u') {
						d[j] = 'j';
					} if (c[j] == 'v') {
						d[j] = 'p';
					} if (c[j] == 'w') {
						d[j] = 'f';
					} if (c[j] == 'x') {
						d[j] = 'm';
					} if (c[j] == 'y') {
						d[j] = 'a';
					} if (c[j] == 'z') {
						d[j] = 'q';
					} if (c[j] == ' ') {
						d[j] = ' ';
					}
				}
				System.out.println("Case #" + (i+1) + ": " + String.valueOf(d));
				}
	}

}

