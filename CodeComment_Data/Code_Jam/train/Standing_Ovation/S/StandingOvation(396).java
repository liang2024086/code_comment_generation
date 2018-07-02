package methodEmbedding.Standing_Ovation.S.LYD1912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		// Read from file
		FileInputStream fis = new FileInputStream("A-small-attempt2.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		// Output file
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		String strLine;
		int c, i = 1, test, temp;
		int testCase = Integer.parseInt(br.readLine());

		while ((strLine = br.readLine()) != null) {
			String[] s = strLine.split(" ");
			int smax = Integer.parseInt(s[0]);
			c = 0;
			test = 0;
			for (int j = 0; j < smax + 1; j++) {
				temp = Integer.parseInt(s[1].charAt(j) + "");

				if (test + c < j)
					c++;
				test += temp;
			}
			System.out.println("Case #" + i + ": " + c);
			bw.write("Case #" + i + ": " + c + "\n");
			i++;
		}

		br.close();
		bw.close();
	}
}
