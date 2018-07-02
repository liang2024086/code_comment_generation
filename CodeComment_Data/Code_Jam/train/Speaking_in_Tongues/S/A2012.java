package methodEmbedding.Speaking_in_Tongues.S.LYD1389;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;


public class A2012 {
	public static void main(String[] args) throws Exception {
		HashMap<Character, Character> m = new HashMap<Character, Character>();
		m.put('y', 'a');
		m.put('e', 'o');
		m.put('z', 'q');
		String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String output = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for (int i = 0; i < input.length(); i++) {
			m.put(input.charAt(i), output.charAt(i));
		}
		char nkey = 0;
		char nvalue = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			if (!m.containsKey(i)) {
				if (nkey != 0) {
					Logger.getAnonymousLogger().warning("nkey is not zero!!");
				}
				nkey = i;
			}
			if (!m.containsValue(i)) {
				nvalue = i;
			}
		}
		m.put(nkey, nvalue);
		
		File f = new File("C:\\gcj\\a_res.txt");
		FileWriter w = new FileWriter(f);
		Scanner sca = new Scanner(new File("C:\\gcj\\a.txt"));
		int T = sca.nextInt();
		sca.nextLine();
		for (int i =  0;i < T;i++) {
			String line = sca.nextLine();
			String res = "";
			for (int j = 0; j< line.length(); j++) {
				res += String.valueOf(m.get(line.charAt(j)));
			}
			w.write("Case #" + (i + 1) + ": " + res + "\n");
		}
		w.flush();
		w.close();
	}
}
