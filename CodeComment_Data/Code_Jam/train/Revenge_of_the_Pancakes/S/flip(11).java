package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1029;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class flip {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("test.in"));
		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		// Use StringTokenizer vs. readLine/split -- lots faster
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken()); // first integer

		for (int i = 1; i <= T; i++) {
			StringTokenizer line = new StringTokenizer(f.readLine());
//			System.out.println(line.countTokens());

				int flips = 0;
				String str = line.nextToken();
				char prev = str.charAt(0);
				str = str.substring(1);

//				System.out.println(prev);
				
				while(str.length() > 0)
				{
					char t = str.charAt(0);
//					System.out.print(t);
					
					if (t != prev)
					{
//						prev = t;
						flips++;
					}
					prev = t;
					
					str = str.substring(1);
				}
//				System.out.println();s
				
				if (prev == '-')
				{
					flips++;
				}
				
				out.println("Case #" + i + ": " + flips);
		}

		// out.println(i1 + i2); // output result
		out.close(); // close the output file
		System.exit(0); // don't omit this!
	}
}
