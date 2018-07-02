package methodEmbedding.Standing_Ovation.S.LYD1931;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(new BufferedReader(
				new FileReader("A-small-attempt2.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A-Small.out")));

		int t = in.nextInt();
		int y = 0, sMax = 0, z = 0;
		String shynessLevel = "";
		int people = 0;
		for (int i = 1; i <= t; i++) {
			sMax = in.nextInt();
			shynessLevel = in.next();
			people = Integer.valueOf(shynessLevel.substring(0, 1));
			if (shynessLevel.length() == 1) {
				y = 0;
			} else {
				for (int j = 1; j <= sMax; j++) {
					if (Integer.valueOf(shynessLevel.substring(j, j + 1)) > 0) {
						if (people < j) {
							z = j - people;
						}
						people =people +z+ Integer.valueOf(shynessLevel.substring(j,
								j + 1));
						y += z;
						z= 0;
					}
				}
			}
			out.println("Case #" + i + ": " + y);
			y=0;
		}
		in.close();
		out.flush();
		out.close();
	}
}
