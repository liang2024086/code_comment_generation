package methodEmbedding.Standing_Ovation.S.LYD1957;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StOvation {
	public static void main(String[] args) throws IOException {
		// Read input file
		FileInputStream fi= new FileInputStream("A-small-attempt1.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		// write Output file
		FileWriter fo = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fo);

		String strLine;
		int cs, i = 1, check, tmp;
		int testCase = Integer.parseInt(br.readLine());

		while ((strLine = br.readLine()) != null) {
			String[] s = strLine.split(" ");
			int smax = Integer.parseInt(s[0]);
			cs = 0;
			check = 0;
			for (int j = 0; j < smax + 1; j++) {
				tmp = Integer.parseInt(s[1].charAt(j) + "");

				if (check + cs < j)
					cs++;
				check += tmp;
			}
			System.out.println("Case #" + i + ": " + cs);
			bw.write("Case #" + i + ": " + cs + "\n");
			i++;
		}

		br.close();
		bw.close();
	}
}
