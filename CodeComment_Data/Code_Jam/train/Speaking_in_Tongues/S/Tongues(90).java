package methodEmbedding.Speaking_in_Tongues.S.LYD1409;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * 
 * @author JD Reddaway
 *
 */
public class Tongues {
	public static void main(String[] args) {
		char[] key = new char[26]; //index is char - 'a'
		Scanner scan;
		PrintWriter writer;
		int t; //number of test cases
		int i;
		String text, output;
		
		try {
			scan = new Scanner(new File("A-small-attempt1.in"));
			writer = new PrintWriter("tongueout.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("FileNotFoundException");
			return;
		}
		
		t = scan.nextInt();
		
		key[0] = 'y'; //a
		key[1] = 'h'; //b
		key[2] = 'e'; //c
		key[3] = 's'; //d
		key[4] = 'o'; //e
		key[5] = 'c'; //f
		key[6] = 'v'; //g
		key[7] = 'x'; //h
		key[8] = 'd'; //i
		key[9] = 'u'; //j
		key[10] = 'i'; //k
		key[11] = 'g'; //l
		key[12] = 'l'; //m
		key[13] = 'b'; //n
		key[14] = 'k'; //o
		key[15] = 'r'; //p
		key[16] = 'z'; //q
		key[17] = 't'; //r
		key[18] = 'n'; //s
		key[19] = 'w'; //t
		key[20] = 'j'; //u
		key[21] = 'p'; //v
		key[22] = 'f'; //w
		key[23] = 'm'; //x
		key[24] = 'a'; //y
		key[25] = 'q'; //z
		
		scan.nextLine();
		
		for (int caseNum = 0; caseNum < t; caseNum++) {
			text = scan.nextLine();
			output = "";
			for (i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') {
					output += ' ';
				} else {
					output += key[text.charAt(i) - 'a'];
					System.out.println(key[text.charAt(i) - 'a']);
				}
			}
			writer.println("Case #" + (caseNum + 1) + ": " + output);
		}
		
		writer.close();
	}
}
