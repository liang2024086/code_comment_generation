package methodEmbedding.Speaking_in_Tongues.S.LYD693;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SpeakinginTongues {
	final static String FILENAME = "A-small-attempt0";

	static String gstr = "qzejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv",
			engstr = "zqour language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader("/home/workshop/Documents/"
				+ FILENAME + ".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/home/workshop/Documents/" + FILENAME + ".out"));
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String line = sc.nextLine().trim();
			bw.write("Case #" + (t + 1) + ": ");
			for (char c : line.toCharArray()) {
				System.out.println(c);
				bw.write(engstr.charAt(gstr.indexOf(c)));
				bw.flush();
			}
			bw.newLine();
		}
		bw.close();
		sc.close();
	}

}
