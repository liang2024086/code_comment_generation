package methodEmbedding.Magic_Trick.S.LYD879;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Mage {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("A-small-attempt0.out"),false));
		
		int cases = scanner.nextInt();
		scanner.nextLine();
		
		for (int t = 0; t < cases; t++) {
			int answer1 = scanner.nextInt();
			int[][] start = new int[4][4];
			int[][] end = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					start[i][j] = scanner.nextInt();
				}
			}
			int answer2 = scanner.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					end[i][j] = scanner.nextInt();
				}
			}
			int cnt = 0;
			int number = -1;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (start[answer1-1][i] == end[answer2-1][j]) {
						number = start[answer1-1][i];
						cnt++;
					}
				}
			}
			
			String s = "";
			if (cnt == 1) {
				s = s + number;
			} else if (cnt == 0) {
				s = "Volunteer cheated!";
			} else {
				s = "Bad magician!";
			}
			
			writer.write("Case #"+(t+1)+": " + s +"\n");
		}
		
		scanner.close();
		writer.close();
	}

}
