package methodEmbedding.Speaking_in_Tongues.S.LYD287;

import java.io.*;
import java.util.Scanner;

class Tongues {
	Scanner s;
	PrintWriter pw;
	int n, count;
	String[] cases;

	Tongues() {
		try {
			s = new Scanner(new File("A-small-attempt0.in"));
			pw = new PrintWriter(new FileWriter("out.txt"));
		} catch (IOException e) {}

		n = s.nextInt();
		s.nextLine();
		cases = new String[n];
		for (int i = 0; i < n; i++) {
			cases[i] = s.nextLine();
		}

		// no discernible patter
		// hard code Googlese --> English
		count = 0;
		while (count < n) {
			pw.print("Case #" + (count+1) + ": ");
			for (char c : cases[count].toCharArray()) {
				switch (c) {
				case ' ':
					pw.print(' ');
					break;
				case 'a':
					pw.print('y');
					break;
				case 'b':
					pw.print('h');
					break;
				case 'c':
					pw.print('e');
					break;
				case 'd':
					pw.print('s');
					break;
				case 'e':
					pw.print('o');
					break;
				case 'f':
					pw.print('c');
					break;
				case 'g':
					pw.print('v');
					break;
				case 'h':
					pw.print('x');
					break;
				case 'i':
					pw.print('d');
					break;
				case 'j':
					pw.print('u');
					break;
				case 'k':
					pw.print('i');
					break;
				case 'l':
					pw.print('g');
					break;
				case 'm':
					pw.print('l');
					break;
				case 'n':
					pw.print('b');
					break;
				case 'o':
					pw.print('k');
					break;
				case 'p':
					pw.print('r');
					break;
				case 'q':
					pw.print('z');
					break;
				case 'r':
					pw.print('t');
					break;
				case 's':
					pw.print('n');
					break;
				case 't':
					pw.print('w');
					break;
				case 'u':
					pw.print('j');
					break;
				case 'v':
					pw.print('p');
					break;
				case 'w':
					pw.print('f');
					break;
				case 'x':
					pw.print('m');
					break;
				case 'y':
					pw.print('a');
					break;
				case 'z':
					pw.print('q');
					break;
				}
			}
			pw.println();
			count++;
		}
		pw.flush();
		pw.close();
	}

	public static void main(String args[]) {
		new Tongues();
	}
}
