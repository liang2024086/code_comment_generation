package methodEmbedding.Counting_Sheep.S.LYD698;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

public class CountingSheep {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			FileWriter fstream = new FileWriter("output.out");
			BufferedWriter out = new BufferedWriter(fstream);
			String sCurrentLine;

			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			sCurrentLine = br.readLine();
			int i = 1;
			while ((sCurrentLine = br.readLine()) != null) {
				BigInteger N = new BigInteger(sCurrentLine);
				HashSet<Character> ints = new HashSet<Character>();
				
				String output = "";
				if(N.equals(BigInteger.ZERO))
				{
					output = "INSOMNIA";
				}
				else
				{
					BigInteger multiplier = BigInteger.ONE;
					BigInteger currentValue = new BigInteger(sCurrentLine);
					while(ints.size() < 10)
					{
						currentValue = N.multiply(multiplier);
						char[] digits = currentValue.toString().toCharArray();
						for (int j = 0; j < digits.length; j++) {
							ints.add(digits[j]);
						}
						multiplier = multiplier.add(BigInteger.ONE);
					}
					
					output = currentValue.toString();
				}

				out.write("Case #" + i++ + ": " + output);
				out.write("\n");
			}
			out.close();

		} catch (IOException e) {
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
			}
		}
	}
}
