package methodEmbedding.Cookie_Clicker_Alpha.S.LYD806;


import java.util.*;
import java.math.*;
import java.io.*;

public class P2 {

	public P2 () throws IOException {
		BufferedReader in = new BufferedReader (new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter (new FileWriter("output.out"));

		int numCases = Integer.parseInt(in.readLine().trim());

		for (int cases = 1; cases <= numCases; cases++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			BigDecimal rate = new BigDecimal("2");
			BigDecimal c = new BigDecimal(st.nextToken());
			BigDecimal f = new BigDecimal(st.nextToken());
			BigDecimal x = new BigDecimal(st.nextToken());		
			BigDecimal time = new BigDecimal("0");
			BigDecimal cookies = new BigDecimal("0");


			while (true) {
				if (x.divide(rate, 7, BigDecimal.ROUND_HALF_DOWN).compareTo(c.divide(rate, 7, BigDecimal.ROUND_HALF_DOWN).add(x.divide(rate.add(f), 7, BigDecimal.ROUND_HALF_DOWN))) == 1) {
					time = time.add(c.divide(rate, 7, BigDecimal.ROUND_HALF_DOWN));
					rate = rate.add(f);
				}
				else {
					time = time.add(x.divide(rate, 7, BigDecimal.ROUND_HALF_DOWN));
					break;
				}
			}

			out.print("Case #" + cases +": ");
			out.println(time.toPlainString());
		}

		out.close();
		in.close();
	}


	public static void main (String [] args) throws IOException {
		new P2 ();
	}
}
