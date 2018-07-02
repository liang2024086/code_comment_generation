package methodEmbedding.Speaking_in_Tongues.S.LYD544;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

final class SpeakinginTongues {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String file = "A-small-attempt0";
		Scanner sc = new Scanner(new FileReader(file + ".in"));
		PrintWriter pw = new PrintWriter(new FileWriter(file + ".out"));
		
		
		char [] clue1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi".trim().toCharArray();
		char []  convertClue1 = "our language is impossible to understand".trim().toCharArray();
		char []  clue2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd".trim().toCharArray();
		char []  convertClue2 = "there are twenty six factorial possibilities".trim().toCharArray();
		char []  clue3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv".trim().toCharArray();
		char []  convertClue3 = "so it is okay if you want to just give up".trim().toCharArray();
		
		Map<String, String> mp = new HashMap<String, String>();
		for (int i1 = 0; i1 < clue1.length; i1++) {
			mp.put(clue1[i1] + "", convertClue1[i1] + "");
		}
		for (int i2 = 0; i2 < clue2.length; i2++) {
			mp.put(clue2[i2] + "", convertClue2[i2] + "");
		}
		for (int i3 = 0; i3 < clue3.length; i3++) {
			mp.put(clue3[i3] + "", convertClue3[i3] + "");
		}

		mp.put("z", "q");
		mp.put("q", "z");
		//mp.put(" ", " ");
		int T = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < T; i++) {

			char [] value = sc.nextLine().toCharArray();
			String result = "";
			for (int ii = 0; ii < value.length; ii++)
			{
				result += mp.get(value[ii]+"");
			}
			
			pw.println("Case #" + (i + 1) + ": " + result);
			//pw.println();

		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
