package methodEmbedding.Counting_Sheep.S.LYD1138;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		String fileInPath = "A-small-attempt0.in";
		String fileOutPath = "A-small-attempt0.out";

		Scanner sc = new Scanner(new FileReader(fileInPath));
		FileWriter fOut = new FileWriter(fileOutPath);

		int numCases = sc.nextInt();
		for (int caseNo = 1; caseNo <= numCases; caseNo++) {
			int n = sc.nextInt();
			String result = "INSOMNIA";
			boolean[] digitsSeen = new boolean[10]; // true at 0 if 0 has been seen etc
			
			int cap = 100;
			int i = 1;
			while (i < cap) {
				Integer num = n * i;
				//System.out.println(num);

				String numString = num.toString();
				for (int j = 0; j < numString.length(); j++) {
					int digit = Character.digit(numString.charAt(j), 10);
					digitsSeen[digit] = true;
				}

				boolean allSeen = true;
				for (int k = 0; k < 10; k++) {
					if (digitsSeen[k] == false) {
						allSeen = false;
					}
				}

				if (allSeen) {
					result = num.toString();
					break;
				}
				i++;
			}
			System.out.println(System.currentTimeMillis() - start);
			fOut.write("Case #" + caseNo + ": " + result + '\r' + '\n');
			if (caseNo % 10 == 0) {
				System.out.println("Case " + caseNo + " done");
			}
		}

		sc.close();
		fOut.close();
		System.out.println("Done!");
	}

}
