package methodEmbedding.Speaking_in_Tongues.S.LYD861;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainApp {

	public static void main(String[] args) {
		String sample1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String sample2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String sample3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";

		String encode1 = "our language is impossible to understand";
		String encode2 = "there are twenty six factorial possibilities";
		String encode3 = "so it is okay if you want to just give up";

		HashMap<String, String> map = new HashMap<String, String>();

		int len1 = sample1.length();
		int len2 = sample2.length();
		int len3 = sample3.length();

		for (int i = 0; i < len1; ++i) {
			map.put(sample1.substring(i, i + 1), encode1.substring(i, i + 1));
		}

		for (int i = 0; i < len2; ++i) {
			map.put(sample2.substring(i, i + 1), encode2.substring(i, i + 1));
		}

		for (int i = 0; i < len3; ++i) {
			map.put(sample3.substring(i, i + 1), encode3.substring(i, i + 1));
		}

		map.put("q", "z");
		map.put("z", "q");
		
		String input = "";

		try {
			FileInputStream fstream = new FileInputStream("A-small-attempt3.in");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			while ((strLine = br.readLine()) != null) {
				input += strLine + "\n";
			}
			in.close();
		} catch (Exception e) {
		}

		String[] inputs = input.split("\n");

		for (int i = 1; i < inputs.length; ++i) {
			System.out.print("Case #" + i + ": ");
			for (int j = 0; j < inputs[i].length(); ++j) {
				System.out.print(map.get(inputs[i].substring(j, j + 1)));
			}

			System.out.println("");
		}
	}
}
