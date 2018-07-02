package methodEmbedding.Revenge_of_the_Pancakes.S.LYD874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class main {
	final static String pathTiny = "tiny";
	final static String pathSmall = "B-small-attempt0";
	final static String pathLarge = "B-large";

	final static String filesPrefix = "src\\";
	final static String inSuffix = ".in";
	final static String outSuffix = ".out";
	
	public static void main(String[] args) throws Exception {
		//String path = pathTiny;
		String path = pathSmall;
		//String path = pathLarge;

		BufferedReader br = new BufferedReader(new FileReader(filesPrefix + path + inSuffix));
		BufferedWriter bw = new BufferedWriter(new FileWriter(filesPrefix + path + outSuffix));

		String line = br.readLine();
		Integer at = 0;
		
		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();

			at++;

			sb.append("Case #");
			sb.append(at);
			sb.append(": ");

			Integer flips = 0;
			Boolean expectingWrong = true;
			char previousChar = '+';
			for (Integer index = line.length(); index > 0; index--) {
				char thisChar = line.charAt(index - 1);
				if (previousChar != thisChar) {
					flips++;
					previousChar = thisChar;
				}
			}
			if (line.charAt(line.length() - 1) == '-') {
				//flips++;
			}
			if (expectingWrong) {
				//flips++;
			}
			sb.append(flips);

			System.out.println(sb.toString());

			bw.write(sb.toString());
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
