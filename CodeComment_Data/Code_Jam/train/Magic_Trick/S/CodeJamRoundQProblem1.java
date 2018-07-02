package methodEmbedding.Magic_Trick.S.LYD1979;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class CodeJamRoundQProblem1 {
	public static void main(String[] args) {
		try {
			File file = new File("A-small-attempt0.in");
			Scanner scanner = new Scanner(file);
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			
			int numCases = scanner.nextInt();
			for (int i = 0; i < numCases; i++) {
				int row1Picked = scanner.nextInt();
				int[] pickedCards = new int[16];
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						int value = scanner.nextInt();
						if (j + 1 == row1Picked) {
							pickedCards[value-1]++;
						}
					}
				}
				int row2Picked = scanner.nextInt();
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						int value = scanner.nextInt();
						if (j + 1 == row2Picked) {
							pickedCards[value-1]++;
						}
					}
				}
				for (int j = 0; j < 16; j++) {
					System.out.println(j+1+": "+pickedCards[j]);
				}
				for (int j = 0; j < 16; j++) {
					System.out.println(j+1+": "+pickedCards[j]);
				}
				int numSolutions = 0;
				int solution = -1;
				for (int j = 0; j < 16; j++) {
					if (pickedCards[j] == 2 ) {
						numSolutions++;
						solution = j + 1;
					}
				}
				out.write("Case #"+(i+1)+": ");
				if (numSolutions == 0) {
					out.write("Volunteer cheated!");
				}
				else if (numSolutions > 1) {
					out.write("Bad magician!");
				}
				else {
					out.write(Integer.toString(solution));
				}
				if (i < numCases - 1) {
					out.write("\n");
				}
			}
			out.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
