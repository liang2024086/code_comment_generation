package methodEmbedding.Speaking_in_Tongues.S.LYD1511;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.jam.eaque.qualif.a.Small;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("args length : " + args.length);
			System.exit(0);
		}

		Stub body = new Small();
		body.setOutputFileName(args[1]);

		char[] alphabet = new char[26];
		alphabet[0] = 'y';
		alphabet[1] = 'h';
		alphabet[2] = 'e';
		alphabet[3] = 's';
		alphabet[4] = 'o';
		alphabet[5] = 'c';
		alphabet[6] = 'v';
		alphabet[7] = 'x';
		alphabet[8] = 'd';
		alphabet[9] = 'u';
		alphabet[10] = 'i';
		alphabet[11] = 'g';
		alphabet[12] = 'l';
		alphabet[13] = 'b';
		alphabet[14] = 'k';
		alphabet[15] = 'r';
		alphabet[16] = 'z';
		alphabet[17] = 't';
		alphabet[18] = 'n';
		alphabet[19] = 'w';
		alphabet[20] = 'j';
		alphabet[21] = 'p';
		alphabet[22] = 'f';
		alphabet[23] = 'm';
		alphabet[24] = 'a';
		alphabet[25] = 'q';

		try {
			InputFileManager ifm = new InputFileManager(args[0]);
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					body.getOutputFileName()));

			int nbTestCases = (int) ifm.readLong();

			for (int i = 0; i < nbTestCases; i++) {
				bw.write("Case #" + (i + 1) + ":" + body.runTestCase(ifm, alphabet));
				bw.newLine();
			}

			ifm.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
