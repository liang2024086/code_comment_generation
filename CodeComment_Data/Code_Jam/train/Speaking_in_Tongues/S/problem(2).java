package methodEmbedding.Speaking_in_Tongues.S.LYD372;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class problem {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("A-small-attempt1.in"));
			String st = in.nextLine();
			int t = Integer.parseInt(st);
			char replace[] = new char[26];
			String test = "yhesocvxduiglbkrztnwjpfmaq";
			for (int i = 0; i < 26; i++) {
				replace[i] = test.charAt(i);
			}
			int i = 0;
			while (i < t && in.hasNextLine()) {
				try {
					String s = "";
					char c='a';

					String ts = in.nextLine();
					for (int j = 0; j < ts.length(); j++) {
						c = ts.charAt(j);
						if (c >= 'a' && c <= 'z') {
							s += replace[c - 'a'];
						} else
							s += " ";

					}

					System.out.println("Case #" + (i + 1) + ": " + s);
					i++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
}
