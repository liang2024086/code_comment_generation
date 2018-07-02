package methodEmbedding.Standing_Ovation.S.LYD1120;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {

	public static void main(String args[]) {

		Scanner scInput = null;
		try {
			scInput = new Scanner(new File("test/A-small-attempt0.in.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int T = scInput.nextInt() + 1;
		for(int i = 1 ; i < T ; i++) {
			int audiences = 0;
			int friends = 0;

			int length = scInput.nextInt() + 1;
			String sData = scInput.next();
			for(int j = 0 ; j < length ; j++) {
				int friendCurrent = 0;
				int sCurrent = sData.charAt(j) - '0';

				if (audiences < j) {
					friendCurrent = j - audiences;
				}
				audiences += sCurrent + friendCurrent;
				friends += friendCurrent;
			}
			System.out.format("Case #%d: %d\n", i, friends);

		}
		
		scInput.close();

	}

}
