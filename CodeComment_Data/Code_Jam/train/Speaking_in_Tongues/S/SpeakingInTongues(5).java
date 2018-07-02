package methodEmbedding.Speaking_in_Tongues.S.LYD1454;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("input.in")));
		PrintWriter out = new PrintWriter("output.out");

		int testCases = Integer.parseInt(in.readLine());
		for (int i = 1; i <= testCases; i++) {
			String s = in.readLine();
			out.printf("Case #"+i+": ");
			char[] solution = s.toCharArray();

			for (int j = 0; j < s.length(); j++) {
				switch (solution[j]) {
				case ' ':
					solution[j] = ' ';
					break;
				case 'a':
					solution[j] = 'y';
					break;
				case 'b':
					solution[j] = 'h';
					break;
				case 'c':
					solution[j] = 'e';
					break;
				case 'd':
					solution[j] = 's';
					break;
				case 'e':
					solution[j] = 'o';
					break;
				case 'f':
					solution[j] = 'c';
					break;
				case 'g':
					solution[j] = 'v';
					break;
				case 'h':
					solution[j] = 'x';
					break;
				case 'i':
					solution[j] = 'd';
					break;
				case 'j':
					solution[j] = 'u';
					break;
				case 'k':
					solution[j] = 'i';
					break;
				case 'l':
					solution[j] = 'g';
					break;
				case 'm':
					solution[j] = 'l';
					break;
				case 'n':
					solution[j] = 'b';
					break;
				case 'o':
					solution[j] = 'k';
					break;
				case 'p':
					solution[j] = 'r';
					break;
				case 'q':
					solution[j] = 'z';
					break;
				case 'r':
					solution[j] = 't';
					break;
				case 's':
					solution[j] = 'n';
					break;
				case 't':
					solution[j] = 'w';
					break;
				case 'u':
					solution[j] = 'j';
					break;
				case 'v':
					solution[j] = 'p';
					break;
				case 'w':
					solution[j] = 'f';
					break;
				case 'x':
					solution[j] = 'm';
					break;
				case 'y':
					solution[j] = 'a';
					break;
				case 'z':
					solution[j] = 'q';
					break;

				}
				out.print(solution[j]);
			}
			out.println();

		}
		out.close();
		in.close();
	}
}
