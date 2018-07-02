package methodEmbedding.Speaking_in_Tongues.S.LYD1517;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) throws FileNotFoundException {
		char[] input = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv"
				.toCharArray();
		boolean[] inputmarks = new boolean[26];
		char[] compareTo = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up"
				.toCharArray();
		boolean[] outmarks = new boolean[26];
		Hashtable<Character, Character> lookUp = new Hashtable<Character, Character>();
		lookUp.put('z', 'q');
		lookUp.put('q', 'z');
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ' && input[i] != '\n') {
				inputmarks[(int) input[i] - 97] = true;
				outmarks[(int) compareTo[i] - 97] = true;
			}
			lookUp.put(input[i], compareTo[i]);
		}
		for (int i = 0; i < 26; i++) {
			if (!inputmarks[i]) {
				for (int j = 0; j < 26; j++) {
					if (!outmarks[j]) {
						lookUp.put((char) i, (char) j);
					}
				}
			}
		}
		BufferedReader in = new BufferedReader(new FileReader(new File(
				"input.txt")));
		// Scanner in = new Scanner(System.in);
		BufferedWriter out = null;
		try {
			FileWriter fstream = new FileWriter("out.txt");
			out = new BufferedWriter(fstream);
			int cases = Integer.parseInt(in.readLine());
			String value;
			for (int i = 0; i < (cases); i++) {
				char[] current = in.readLine().toCharArray();
				String result = "";
				for (int j = 0; j < current.length; j++) {
					result += lookUp.get(current[j]);
				}
				out.write("Case #" + (i + 1) + ": " + result + "\n");
				// System.out.println("Case #" + (i + 1) + ": " + money);
			}
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
}
