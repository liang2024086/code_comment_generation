package methodEmbedding.Speaking_in_Tongues.S.LYD407;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Tongues {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("A-small-attempt2.in");
		Scanner input = null;
		File f2 = new File("file2.txt");
		PrintStream p = new PrintStream(f2);
		try {
			input = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String in = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String out = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		String[] in_words = in.split(" ");
		String[] out_words = out.split(" ");
		boolean bool = true;
		int c = 0;
		char[][] letters = new char[26][2];
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < in_words[i].length(); j++) {
				for (int k = 0; k < 26; k++) {
					if (in_words[i].charAt(j) == letters[k][0])
						bool = false;
				}
				if (bool) {
					letters[c][0] = in_words[i].charAt(j);
					letters[c][1] = out_words[i].charAt(j);
					c++;
				}
				bool = true;
			}
		}
		letters[c][0] = 'z';
		letters[c][1] = 'q';
		c++;
		letters[c][0] = 'q';
		letters[c][1] = 'z';
		
		String word = "";
		String s = input.nextLine();
		int n = Integer.parseInt(s);
		for (int i = 0; i < n; i++) {
			p.print("Case #" + Integer.toString(i + 1) + ": ");
			String line = input.nextLine();
			String[] arr = line.split(" ");
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length(); k++) {
					for (int l = 0; l < 26; l++) {
						if (letters[l][0] == arr[j].charAt(k)) {
							word += letters[l][1];
							break;
						}
					}
				}
				if (j == 0)
					p.print(word);
				else
					p.print(" " + word);
				word = "";
			}
			p.println();
		}
	}
}
