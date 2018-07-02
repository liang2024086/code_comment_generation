package methodEmbedding.Speaking_in_Tongues.S.LYD1120;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Scanner;

public class SpeakinginTongues {

	public static void main(String[] args) throws FileNotFoundException {
		Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
		String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String output = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		ht.put('q', 'z');
		ht.put('z', 'q');
		for (int i = 0; i < input.length(); i++) {
			ht.put(input.charAt(i), output.charAt(i));
		}

		Scanner in = new Scanner(new File("A-small-attempt1.in"));
		// Scanner in = new Scanner(System.in);
		BufferedWriter out = null;
		try {
			FileWriter fstream = new FileWriter("out.txt");
			out = new BufferedWriter(fstream);
			int cases = in.nextInt();
			in.nextLine();
			String value;
			for (int i = 0; i < (cases); i++) {
				String result = "";
				value = in.nextLine();
				for (int j = 0; j < value.length(); j++) {
					result = result + ht.get(value.charAt(j));
				}
				out.write("Case #" + (i + 1) + ": " + result + "\n");
				System.out.println("Case #" + (i + 1) + ": " + result);
			}
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
}
