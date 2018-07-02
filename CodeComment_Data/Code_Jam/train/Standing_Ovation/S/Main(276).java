package methodEmbedding.Standing_Ovation.S.LYD2000;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Deepak Soni
 *
 */
public class Main {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(
					new File(
							"C:/Users/Deepak Soni/Documents/eclipse/Standing Ovation/testsets/A-small-attempt0.in"));
			PrintWriter out = new PrintWriter(
					new FileWriter(
							"C:/Users/Deepak Soni/Documents/eclipse/Standing Ovation/testsets/A-small-attempt0.out"));

			int t = in.nextInt();
			for (int c = 1; c <= t; c++) {

				/* input */
				int smax = in.nextInt();

				String audShyFacStr = in.nextLine();
				int[] audShyFac = new int[smax + 1];
				for (int i = 0; i < smax + 1; i++) {
					audShyFac[i] = ((int) audShyFacStr.charAt(i + 1)) - 48;
				}

				/* logic */
				int noOfAudOva = 0;
				int noOfFrnds = 0;
				for (int i = 0; i < smax + 1; i++) {
					if (audShyFac[i] != 0) {
						if (noOfAudOva < i) {
							noOfFrnds += i - noOfAudOva;
							noOfAudOva = i;
						}
						noOfAudOva += audShyFac[i];
					}
				}

				out.println("Case #" + c + ": " + noOfFrnds);
			}

			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
