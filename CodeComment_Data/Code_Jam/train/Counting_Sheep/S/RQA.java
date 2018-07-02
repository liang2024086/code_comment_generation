package methodEmbedding.Counting_Sheep.S.LYD1292;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class RQA {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int nCases = s.nextInt();
		for (int z = 0; z < nCases; z++) {
			BigInteger n = new BigInteger(s.next());
			if (n.equals(BigInteger.ZERO)) {
				System.out.printf("Case #%d: INSOMNIA\n", z + 1);
				continue;
			}
			BigInteger x = BigInteger.ZERO;
			int mask = (1 << 10) - 1;
			while (mask != 0) {
				x = x.add(n);
				String d = x.toString();
				for (int i = 0; i < d.length(); i++) {
					int digit = d.charAt(i) - '0';
					mask &= ~(1 << digit);
				}
			}
			System.out.printf("Case #%d: %s\n", z + 1, x.toString());
		}
		s.close();
	}
}
