package methodEmbedding.Revenge_of_the_Pancakes.S.LYD211;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HappyPancakes {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		String filePartName = "B-small-attempt0";
		String fileInPath = filePartName + ".in";
		String fileOutPath = filePartName + ".out";

		Scanner sc = new Scanner(new FileReader(fileInPath));
		FileWriter fOut = new FileWriter(fileOutPath);

		int numCases = sc.nextInt();
		sc.nextLine();
		for (int caseNo = 1; caseNo <= numCases; caseNo++) {
			String stack = sc.nextLine();
			int flips = 0;
			for (int i = stack.length() - 1; i >= 0; i--) {
				if (stack.charAt(i) == '-' && (flips % 2 == 0)) {
					flips++;
				} else if (stack.charAt(i) == '+' && (flips % 2 == 1)) {
					flips++;
				}
			}
			
			fOut.write("Case #" + caseNo + ": " + flips + '\r' + '\n');
			if (caseNo % 10 == 0) {
				System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
				System.out.println("Case " + caseNo + " done");
			}
		}

		sc.close();
		fOut.close();
		System.out.println("Done!");
	}

}
