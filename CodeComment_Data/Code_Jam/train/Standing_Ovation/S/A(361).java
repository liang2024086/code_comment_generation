package methodEmbedding.Standing_Ovation.S.LYD44;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class A {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new FileReader("A-small-attempt1 (1).in"));
		PrintWriter out = new PrintWriter(new FileWriter("output.out"));
		int t = Integer.parseInt(bf.readLine());
		int j = 1;
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int digits = Integer.parseInt(st.nextToken()) + 1;
			String s = st.nextToken();
			int res = 0;
			int sofar = 0;
			for (int i = 0; i < digits; i++) {
				int k = s.charAt(i) - '0';
				if (i > sofar) {
					int added = i - sofar;
					res += added;
					sofar += added;
				}
				sofar += k;
			}
			out.println("Case #" + j + ": " +res);
			j++;
			
		}
		out.flush();
		out.close();
	}

}
