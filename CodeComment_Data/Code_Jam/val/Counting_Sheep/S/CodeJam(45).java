package methodEmbedding.Counting_Sheep.S.LYD864;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CodeJam {
	public static void main(String args[]) throws IOException {

		File file = new File("/home/shanki/test/A-small-attempt0.in");
		File outFile = new File("/home/shanki/test/A-small-attempt0.out");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; ++i) {

			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				bw.write("Case #" + i + ": INSOMNIA" + "\n");
				continue;
			}
			
			ArrayList<String> numberSeen = new ArrayList<String>(10);
			int count = 1;
			int number = 0;
			while (numberSeen.size() != 10) {
				number = count * n;
				String [] digits = Integer.toString(number).split("(?<=.)");
				for (String digit : digits) {
					if (!numberSeen.contains(digit)) {
						numberSeen.add(digit);
					}
				}
				count++;
			}
			bw.write("Case #" + i + ": " + number + "\n");
		}

		br.close();
		bw.close();
	}
}
