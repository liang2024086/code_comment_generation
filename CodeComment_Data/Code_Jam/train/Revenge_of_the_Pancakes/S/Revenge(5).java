package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1057;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Revenge {

	public static final char HAPPY = '+';
	public static final char BLANK = '-';

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();

		for (int i = 1; i <= t; ++i) {

			String line = in.next();

			boolean happy = line.charAt(0) == HAPPY;
			
			int erg = 1;

			for (int j = 0; j < line.length(); j++) {
				if (happy) {
					if (line.charAt(j) == BLANK) {
						happy = false;
						erg = erg + 1;
					}
				} else {
					if (line.charAt(j) == HAPPY) {
						happy = true;
						erg = erg + 1;
					}
				}
			}
			
			if(line.charAt(line.length()-1) == HAPPY){
				erg = erg - 1;
			}

			System.out.println("Case #" + i + ": " + erg);
		}

		in.close();
	}

}
