package methodEmbedding.Speaking_in_Tongues.S.LYD939;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class GooglereseConverter {

	public static void main(String args[]) throws IOException {

		FileInputStream inputreader = new FileInputStream("A-small-attempt0.in");

		DataInputStream in = new DataInputStream(inputreader);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String strLine;

		int input = Integer.parseInt(br.readLine());

		for (int k = 0; k < input; k++) {
			strLine = br.readLine();

			String x = "qz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";

			String y = "zq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

			Map<Character, Character> googlerese1 = new HashMap<Character, Character>();
			for (int i = 0; i < x.length(); i++) {
				googlerese1.put(x.charAt(i), y.charAt(i));
			}

			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt",true)));
			try {
				// FileWriter always assumes default encoding is OK!

				System.out.print("Case #" + (k + 1) + ": ");
				output.write("Case #" + (k + 1) + ": ");
				for (int j = 0; j < strLine.length(); j++) {
					System.out.print(googlerese1.get(strLine.charAt(j)));
					output.write(googlerese1.get(strLine.charAt(j)));
				}
				System.out.print("\n");
				output.println();
			} finally {
				output.close();
			}

		}

		in.close();

	}

}
