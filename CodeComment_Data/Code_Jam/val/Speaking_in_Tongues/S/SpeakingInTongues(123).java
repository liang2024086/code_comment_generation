package methodEmbedding.Speaking_in_Tongues.S.LYD1040;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpeakingInTongues {

	/**
	 * Input 3 ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh
	 * wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv
	 * 
	 * 
	 * Output Case #1: our language is impossible to understand Case #2: there
	 * are twenty six factorial possibilities Case #3: so it is okay if you want
	 * to just give up
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Reading the input file
		Scanner in = new Scanner(new File("Input.txt"));
		// writting the input file
		FileWriter fstream = new FileWriter("Output.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		int testCase = Integer.parseInt(in.nextLine());
		System.out.println(testCase);
		for (int i = 0; i < testCase; i++) {
			String temp = in.nextLine();
			Scanner sc = new Scanner(temp);
			out.write("Case #" + (i + 1) + ":\t");
			sc.useDelimiter("");
			while (sc.hasNext()) {
				char character = sc.next().charAt(0);
				switch (character) {
				case 'a':
					out.write('y');
					break;
				case 'b':
					out.write('h');
					break;
				case 'c':
					out.write('e');
					break;
				case 'd':
					out.write('s');
					break;
				case 'e':
					out.write('o');
					break;
				case 'f':
					out.write('c');
					break;
				case 'g':
					out.write('v');
					break;
				case 'h':
					out.write('x');
					break;
				case 'i':
					out.write('d');
					break;
				case 'j':
					out.write('u');
					break;
				case 'k':
					out.write('i');
					break;
				case 'l':
					out.write('g');
					break;
				case 'm':
					out.write('l');
					break;
				case 'n':
					out.write('b');
					break;
				case 'o':
					out.write('k');
					break;
				case 'p':
					out.write('r');
					break;
				case 'q':
					out.write('z');
					break;
				case 'r':
					out.write('t');
					break;
				case 's':
					out.write('n');
					break;
				case 't':
					out.write('w');
					break;
				case 'u':
					out.write('j');
					break;
				case 'v':
					out.write('p');
					break;
				case 'w':
					out.write('f');
					break;
				case 'x':
					out.write('m');
					break;
				case 'y':
					out.write('a');
					break;
				case 'z':
					out.write('q');
					break;
				case 'A':
					out.write('Y');
					break;
				case 'B':
					out.write('H');
					break;
				case 'C':
					out.write('E');
					break;
				case 'D':
					out.write('S');
					break;
				case 'E':
					out.write('O');
					break;
				case 'F':
					out.write('C');
					break;
				case 'G':
					out.write('V');
					break;
				case 'H':
					out.write('X');
					break;
				case 'I':
					out.write('D');
					break;
				case 'J':
					out.write('U');
					break;
				case 'K':
					out.write('I');
					break;
				case 'L':
					out.write('G');
					break;
				case 'M':
					out.write('L');
					break;
				case 'N':
					out.write('B');
					break;
				case 'O':
					out.write('K');
					break;
				case 'P':
					out.write('R');
					break;
				case 'Q':
					out.write('Z');
					break;
				case 'R':
					out.write('T');
					break;
				case 'S':
					out.write('N');
					break;
				case 'T':
					out.write('W');
					break;
				case 'U':
					out.write('J');
					break;
				case 'V':
					out.write('P');
					break;
				case 'W':
					out.write('F');
					break;
				case 'X':
					out.write('M');
					break;
				case 'Y':
					out.write('A');
					break;
				case 'Z':
					out.write('Q');
					break;
				default:
					out.write(character);
					break;
				}
			} // while
			out.write("\n");
		}// for
		in.close();
		out.close();
		fstream.close();
		System.out.println("__________END____________________");

	}// main

}// class
