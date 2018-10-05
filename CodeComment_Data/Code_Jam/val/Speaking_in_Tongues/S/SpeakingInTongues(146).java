package methodEmbedding.Speaking_in_Tongues.S.LYD1100;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SpeakingInTongues {
	
	public SpeakingInTongues(){
//		Scanner sc = new Scanner(System.in).useDelimiter("\\s*\n\\s*");
		Scanner sc = new Scanner(System.in);
		int numberLines = Integer.valueOf(sc.nextLine());
		char [] sentence;
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0;i<numberLines;i++){
			stringBuilder.append("Case #" + (i + 1) + ": ");
			sentence = sc.nextLine().toCharArray();
			for (int j = 0; j < sentence.length; j++) {
				switch (sentence[j]) {
				case 'a':
					sentence[j] = 'y';
					break;
				case 'b':
					sentence[j] = 'h';
					break;
				case 'c':
					sentence[j] = 'e';
					break;
				case 'd':
					sentence[j] = 's';
					break;
				case 'e':
					sentence[j] = 'o';
					break;
				case 'f':
					sentence[j] = 'c';
					break;
				case 'g':
					sentence[j] = 'v';
					break;
				case 'h':
					sentence[j] = 'x';
					break;
				case 'i':
					sentence[j] = 'd';
					break;
				case 'j':
					sentence[j] = 'u';
					break;
				case 'k':
					sentence[j] = 'i';
					break;
				case 'l':
					sentence[j] = 'g';
					break;
				case 'm':
					sentence[j] = 'l';
					break;
				case 'n':
					sentence[j] = 'b';
					break;
				case 'o':
					sentence[j] = 'k';
					break;
				case 'p':
					sentence[j] = 'r';
					break;
				case 'q':
					sentence[j] = 'z';
					break;
				case 'r':
					sentence[j] = 't';
					break;
				case 's':
					sentence[j] = 'n';
					break;
				case 't':
					sentence[j] = 'w';
					break;
				case 'u':
					sentence[j] = 'j';
					break;
				case 'v':
					sentence[j] = 'p';
					break;
				case 'w':
					sentence[j] = 'f';
					break;
				case 'x':
					sentence[j] = 'm';
					break;
				case 'y':
					sentence[j] = 'a';
					break;
				case 'z':
					sentence[j] = 'q';
					break;
				default:
					break;
				}
				stringBuilder.append(sentence[j]);
			}
			if (i != numberLines - 1) {
				stringBuilder.append("\n");
			}
		}
		FileWriter fstream;
		BufferedWriter out;
		try {
			fstream = new FileWriter("out.txt");
			out = new BufferedWriter(fstream);
			out.write(stringBuilder.toString());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("SpeakingInTongues.in"));
			SpeakingInTongues speakingInTongues = new SpeakingInTongues();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
