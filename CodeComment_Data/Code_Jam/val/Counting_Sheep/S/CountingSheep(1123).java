package methodEmbedding.Counting_Sheep.S.LYD277;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;

public class CountingSheep {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		int t = Integer.parseInt(bf.readLine());
		for (int tc = 1; tc <= t; tc++) {
			HashSet<BigInteger> hs = new HashSet<BigInteger>();
			boolean vis[] = new boolean[10];
			BigInteger n = new BigInteger(bf.readLine(), 10);
			BigInteger i = new BigInteger("1", 10);
			boolean forever = false;
			while (true) {
				BigInteger m = n.multiply(i);
				//System.out.println("hello " + m);
				if (hs.contains(m)) {
					forever = true;
					break;
				}
				hs.add(n);
				String s = m.toString();
				for (int j = 0; j < s.length(); j++)
					vis[s.charAt(j) - '0'] = true;
				boolean f = true;
				for (int j = 0; j < 10; j++)
					f = f && vis[j];
				if (f)
					break;
				i = i.add(BigInteger.ONE);
			}
			if (forever)
				out.println("Case #" + tc + ": INSOMNIA");
			else
				out.println("Case #" + tc + ": " + n.multiply(i));
		}
		out.flush();
		out.close();
	}
}
