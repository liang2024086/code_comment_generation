package methodEmbedding.Revenge_of_the_Pancakes.S.LYD299;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RevengePancakes {
	static PrintWriter out;

	public static void main(String[] args) throws IOException{

		File f = new File("src/B-small-attempt1.in");
		File o = new File("src/B-small-attempt1.out");
		String strLine = null;

		BufferedReader br = new BufferedReader(new FileReader(f));
		out = new PrintWriter(new FileWriter(o));

		strLine = br.readLine();

		long T = Long.parseLong(strLine);

		for (long i = 1; i <= T; i++) {
			String panStack = br.readLine();

			char[] str = panStack.toCharArray();
			int noFlips = 0;

			int length = panStack.length();

			char c = '\0';
			char p = '\0';

			int k = 0;
			while (k < length) {
				c = str[k];

				if (c == '-') {
					str[k] = '+';
					if ((c == '+' && p == '-') || (c == '-' && p == '+'))
						noFlips++;

					p = '-';
				} else if (c == '+') {

					if ((c == '+' && p == '-'))
						noFlips++;
					p = '+';

				}

				k++;

			}
			if (p == '-')
				noFlips++;
			
			out.write("Case #" + i +": "+noFlips+"\n");
		}

		br.close();
		out.close();
	}

}
