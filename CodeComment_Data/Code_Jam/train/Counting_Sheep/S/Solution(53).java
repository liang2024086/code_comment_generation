package methodEmbedding.Counting_Sheep.S.LYD340;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\spratee\\Downloads\\A-small-attempt0.in"));
		FileWriter writer = new FileWriter("C:\\Users\\spratee\\Downloads\\output.txt");
		int T = Integer.parseInt(reader.readLine());
		for (int i = 0; i < T; i++) {
			Set<Integer> allNumbers = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
			int calls = 0;
			BigInteger N = new BigInteger(reader.readLine());
			BigInteger M = BigInteger.ONE;
			BigInteger lastNumber = null;
			while (!(calls > 1000 || allNumbers.size() == 0)) {
				BigInteger newNumber = N.multiply(M);
				M = M.add(BigInteger.ONE);
				lastNumber = newNumber;
				++calls;

				char[] values = newNumber.toString().toCharArray();
				for (int x = 0; x < values.length; x++) {
					if (allNumbers.contains(Integer.valueOf("" + values[x]))) {
						allNumbers.remove(Integer.valueOf("" + values[x]));
					}
				}
			}

			if (allNumbers.size() == 0) {
				writer.write("Case #" + (i + 1) + ": " + (lastNumber.toString()));
			} else {
				writer.write("Case #" + (i + 1) + ": INSOMNIA");
			}
			writer.write("\n");
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
