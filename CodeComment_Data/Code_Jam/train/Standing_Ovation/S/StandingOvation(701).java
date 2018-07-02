package methodEmbedding.Standing_Ovation.S.LYD511;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args)  throws IOException {
		Scanner in = new Scanner(new File("standing.txt"));
		int sets = in.nextInt();
		for(int x = 0; x < sets; x++) {
			int useless = in.nextInt();
			String useful = in.nextLine().substring(1);
			int count = 0;
			int numofpeople = 0;
			for(int y = 0; y < useful.length(); y++) {
				numofpeople += useful.charAt(y)-'0';
				if(numofpeople <= y) {
					count++;
					numofpeople++;
				}
			}
			System.out.printf("Case #%d: %d%n", x+1, count);
		}
	}
}
