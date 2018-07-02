package methodEmbedding.Speaking_in_Tongues.S.LYD1472;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Tongues {

	public static void main(String[] args) throws IOException {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		String[] in = new String[] {
				"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String[] out = new String[] {
				"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		hm.put(' ', ' ');
		hm.put('a', 'y');
		hm.put('o', 'e');
		hm.put('z', 'q');
		hm.put('q', 'z');

		for (int r = 0; r < 3; r++) {
			for (int g = 0; g < in[r].length(); g++) {
				hm.put(in[r].charAt(g), out[r].charAt(g));
			}
		}
		Scanner sc = null;
		try {
			sc = new Scanner(new File("A-small-attempt2.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] inn = new String[sc.nextInt()];
		sc.nextLine();
		for (int r = 0; r < inn.length; r++) {
			inn[r] = sc.nextLine();
		}

		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter outp = new BufferedWriter(fstream);
		for (int r = 0; r < inn.length; r++) {
			String out1 = "";
			for (int g = 0; g < inn[r].length(); g++) {
				out1 += hm.get(inn[r].charAt(g));
			}
			System.out.println("Case #" + (r + 1) + ": " + out1);
			outp.write("Case #" + (r + 1) + ": " + out1 + "\n");
		}
		outp.flush();
		fstream.close();
	}

}

