package methodEmbedding.Speaking_in_Tongues.S.LYD1342;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) throws FileNotFoundException {
		char[] map = new char['z' - 'a' + 1];
		String from = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String to = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for (int i = 0; i < from.length(); i++) {
			char c = from.charAt(i);
			if (c != ' ') {
				map[c - 'a'] = to.charAt(i);
			}
		}
		map[25] = 'q';
		map[16] = 'z';

		Scanner sc = new Scanner(new File("inputA.txt"));
		int T = sc.nextInt();
		sc.nextLine();
		PrintWriter pw = new PrintWriter("outputA.txt");
		for (int t = 1; t <= T; t++) {
			String s = sc.nextLine();
			String out = "Case #" + t + ": ";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c != ' ') {
					c = map[c - 'a'];
				}
				out += c;
			}
			pw.println(out);
		}
		pw.flush();
		pw.close();
	}
}
