package methodEmbedding.Magic_Trick.S.LYD312;

import java.io.*;
import java.util.*;
public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
		int numCases = Integer.parseInt(in.nextLine());

		for (int i=0; i < numCases; i++) {
			// first board
			int firstRow = Integer.parseInt(in.nextLine());
			// throw away rows until the wanted one
			for (int j=0; j < firstRow-1; j++) {
				in.nextLine();
			}
			// read the desired line
			int[] firstLine = new int[4];
			firstLine[0] = in.nextInt();
			firstLine[1] = in.nextInt();
			firstLine[2] = in.nextInt();
			firstLine[3] = in.nextInt();
			in.nextLine();
			// throw away remaining lines
			for (int j=0; j < (4-firstRow); j++) {
				in.nextLine();
			}

			// second board
			int secondRow = Integer.parseInt(in.nextLine());
			// throw away rows until the wanted one
			for (int j=0; j < secondRow-1; j++) {
				in.nextLine();
			}
			// read the desired line
			int[] secondLine = new int[4];
			secondLine[0] = in.nextInt();
			secondLine[1] = in.nextInt();
			secondLine[2] = in.nextInt();
			secondLine[3] = in.nextInt();
			in.nextLine();
			// throw away remaining lines
			for (int j=0; j < (4-secondRow); j++) {
				in.nextLine();
			}

			// compare arrays
			int inBothArrays = 0;
			int numFromBoth = -1;

			for (int j=0; j < 4; j++) {
				for (int k=0; k < 4; k++) {
					if (firstLine[j] == secondLine[k]) {
						inBothArrays++;
						numFromBoth = firstLine[j];
					}
				}
			}

			if (inBothArrays == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}

			else if (inBothArrays > 1) {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}

			else if (inBothArrays == 1) {
				System.out.println("Case #" + (i+1) +": " + numFromBoth);
			}
		}
	}
}
