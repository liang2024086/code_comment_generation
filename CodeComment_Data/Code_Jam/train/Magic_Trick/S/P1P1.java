package methodEmbedding.Magic_Trick.S.LYD2211;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P1P1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(
				new File(
						"/Users/olvitole/Dropbox/workspace/Googe Code/src/gcj2014/files/A-small-attempt0.in"));
		// Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		OutputStream outStr = new FileOutputStream(
				"/Users/olvitole/Dropbox/workspace/Googe Code/src/gcj2014/files/A1-output.txt");
		PrintStream printOut = new PrintStream(outStr);

		for (int zz = 1; zz <= t; zz++) {

			int q1 = Integer.parseInt(in.nextLine().trim());
			String[] q1Choices = null;
			for (int i = 1; i <= 4; i++) {
				String currRows = in.nextLine();
				if (i == q1) {
					q1Choices = currRows.trim().split(" ");
				}
			}

			int q2 = Integer.parseInt(in.nextLine().trim());
			String[] q2Choices = null;
			for (int i = 1; i <= 4; i++) {
				String currRows = in.nextLine();
				if (i == q2) {
					q2Choices = currRows.trim().split(" ");
				}
			}

			int size = 0;
			String answer = "";
			for (String a : q1Choices) {
				for (String b : q2Choices) {
					if (a.equals(b)) {
						size++;
						answer = a;
					}
				}
			}

			String output = "Volunteer cheated!";
			if (size == 1) {
				output = answer;
			} else if (size > 1) {
				output = "Bad magician!";
			}

			System.out.println("Case #" + zz + ": " + output);

			printOut.append("Case #" + zz + ": " + output + "\n");

		}

		System.setOut(printOut);
	}
}
