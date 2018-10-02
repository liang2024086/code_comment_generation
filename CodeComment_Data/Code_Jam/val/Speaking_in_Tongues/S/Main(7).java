package methodEmbedding.Speaking_in_Tongues.S.LYD319;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("input.in"));
		Formatter formatter = new Formatter(new File("output.out"));

		// read
		int T = scanner.nextInt();
		scanner.nextLine();
		char[] chars;
		String G="";
		String line;
		int lengthOfChar=0;
		
		for (int i = 0; i < T; i++) {
			line = scanner.nextLine();
			lengthOfChar = line.length();
			chars = new char[lengthOfChar + 1];
			line.getChars(0, lengthOfChar, chars, 0); // copying to chars
			G="";
			for (int j = 0; j < lengthOfChar; j++) {
				switch (chars[j]) {
				case ' ':G=G.concat(" ");break;
				case 'a':G=G.concat("y");break;
				case 'b':G=G.concat("h");break;
				case 'c':G=G.concat("e");break;
				case 'd':G=G.concat("s");break;
				case 'e':G=G.concat("o");break;
				case 'f':G=G.concat("c");break;
				case 'g':G=G.concat("v");break;
				case 'h':G=G.concat("x");break;
				case 'i':G=G.concat("d");break;
				case 'j':G=G.concat("u");break;
				case 'k':G=G.concat("i");break;
				case 'l':G=G.concat("g");break;
				case 'm':G=G.concat("l");break;
				case 'n':G=G.concat("b");break;
				case 'o':G=G.concat("k");break;
				case 'p':G=G.concat("r");break;
				case 'q':G=G.concat("z");break;
				case 'r':G=G.concat("t");break;
				case 's':G=G.concat("n");break;
				case 't':G=G.concat("w");break;
				case 'u':G=G.concat("j");break;
				case 'v':G=G.concat("p");break;
				case 'w':G=G.concat("f");break;
				case 'x':G=G.concat("m");break;
				case 'y':G=G.concat("a");break;
				case 'z':G=G.concat("q");break;
				default:break;
				}
			}
		
			
			System.out.printf("Case #%d: %s\n", i + 1, G);
			formatter.format("Case #%d: %s\n", i + 1, G);
			

		}// out
		formatter.close();
	}
}
