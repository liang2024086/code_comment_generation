package methodEmbedding.Speaking_in_Tongues.S.LYD928;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Translation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String googlereseSample = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String englisSample = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		char[] c = new char[26];
		// Given.
		c['a' - 97] = 'y';
		c['y' - 97] = 'a';
		c['z' - 97] = 'q';
		c['q' - 97] = 'z';
		c['o' - 97] = 'e';
		c['e' - 97] = 'o';
		char pos;
		// Train.
		for (int i = 0; i < googlereseSample.length(); i++) {
			pos = googlereseSample.charAt(i);
			if (pos != ' ') {
				c[pos - 97] = englisSample.charAt(i);
			}
		}

		try {
			FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			FileWriter fwriter = new FileWriter("A-small-attempt0.out");
			BufferedWriter out = new BufferedWriter(fwriter);
			
			String strLine;
			strLine = br.readLine();
			int testCases = Integer.parseInt(strLine);
			int currentNum = 0;
			char[] inoutString;
			while ((strLine = br.readLine()) != null && currentNum < testCases) {
				inoutString = strLine.toCharArray();
				for (int j = 0; j < inoutString.length; j++) {
					if (inoutString[j] != ' ')
						inoutString[j] = c[inoutString[j] - 97];
				}
				out.write("Case #" + ++currentNum + ": ");
				out.write(inoutString);
				out.newLine();
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.err.println("I/O Error while reading file.");
		}

		// 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'. This means that "a zoo" will
		// become "y qee".

	}
}
