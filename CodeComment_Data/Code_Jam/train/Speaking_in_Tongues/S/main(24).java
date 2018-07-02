package methodEmbedding.Speaking_in_Tongues.S.LYD9;

import java.io.*;

public class main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstream = new FileInputStream("D:\\A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int testCasesNum = Integer.parseInt(br.readLine());
			String[] output = new String[testCasesNum];
			while (testCasesNum-- > 0) {
				strLine = br.readLine();
				output[testCasesNum] = "";

				for (int i = 0; i < strLine.length(); i++) {
					if (strLine.charAt(i) == 'y')
						output[testCasesNum] += 'a';
					else if (strLine.charAt(i) == 'n')
						output[testCasesNum] += 'b';
					else if (strLine.charAt(i) == 'f')
						output[testCasesNum] += 'c';
					else if (strLine.charAt(i) == 'i')
						output[testCasesNum] += 'd';
					else if (strLine.charAt(i) == 'c')
						output[testCasesNum] += 'e';
					else if (strLine.charAt(i) == 'w')
						output[testCasesNum] += 'f';
					else if (strLine.charAt(i) == 'l')
						output[testCasesNum] += 'g';
					else if (strLine.charAt(i) == 'b')
						output[testCasesNum] += 'h';
					else if (strLine.charAt(i) == 'k')
						output[testCasesNum] += 'i';
					else if (strLine.charAt(i) == 'u')
						output[testCasesNum] += 'j';
					else if (strLine.charAt(i) == 'o')
						output[testCasesNum] += 'k';
					else if (strLine.charAt(i) == 'm')
						output[testCasesNum] += 'l';
					else if (strLine.charAt(i) == 'x')
						output[testCasesNum] += 'm';
					else if (strLine.charAt(i) == 's')
						output[testCasesNum] += 'n';
					else if (strLine.charAt(i) == 'e')
						output[testCasesNum] += 'o';
					else if (strLine.charAt(i) == 'v')
						output[testCasesNum] += 'p';
					else if (strLine.charAt(i) == 'z')
						output[testCasesNum] += 'q';
					else if (strLine.charAt(i) == 'p')
						output[testCasesNum] += 'r';
					else if (strLine.charAt(i) == 'd')
						output[testCasesNum] += 's';
					else if (strLine.charAt(i) == 'r')
						output[testCasesNum] += 't';
					else if (strLine.charAt(i) == 'j')
						output[testCasesNum] += 'u';
					else if (strLine.charAt(i) == 'g')
						output[testCasesNum] += 'v';
					else if (strLine.charAt(i) == 't')
						output[testCasesNum] += 'w';
					else if (strLine.charAt(i) == 'h')
						output[testCasesNum] += 'x';
					else if (strLine.charAt(i) == 'a')
						output[testCasesNum] += 'y';
					else if (strLine.charAt(i) == 'q')
						output[testCasesNum] += 'z';
					else if (strLine.charAt(i) == ' ')
						output[testCasesNum] += ' ';
				}

				System.out.println(output[testCasesNum]);
			}
			in.close();

			FileWriter outfstream = new FileWriter("D:\\output.txt");
			BufferedWriter out = new BufferedWriter(outfstream);
			for (int i = output.length-1; i >= 0; i--) {
				out.write("Case #" + (output.length-i) + ": " + output[i] + "\n");
				out.newLine();
			}
			out.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
