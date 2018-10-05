package methodEmbedding.Magic_Trick.S.LYD24;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MagicTrick {
	public static final String FILE_NAME = "A-small-attempt0";
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(FILE_NAME + ".in"));
		PrintStream output = new PrintStream(new File(FILE_NAME + ".out"));
		int cases = input.nextInt();
		
		for (int i = 1; i <= cases; i++) {
			int[] row = new int[4];
			int guess = input.nextInt();
			int ans = -1;
			
			for (int j = 0; j < 16; j++) {
				if ((j < guess * 4) && j >= ((guess - 1) * 4)) {
					row[j % 4] = input.nextInt();
				} else {
					input.nextInt(); // Throw away values
				}
			}
			
			guess = input.nextInt(); // Volunteer's second guess
			
			int count = 0; // number of matches
			
			for (int j = 0; j < 16; j++) {
				if ((j < guess * 4) && j >= ((guess - 1) * 4)) {
					int tmp = input.nextInt();
					for (int num: row) {
						if (tmp == num) {
							count++;
							ans = num;
						}
					}
				} else {
					input.nextInt(); // Throw away values
				}
			}
			
			output.print("Case #" + i + ": ");
			if (count == 0) {
				output.println("Volunteer cheated!");
			} else if (count == 1) {
				output.println(ans);
			} else {
				output.println("Bad magician!");
			}
		}
		
		input.close();
		output.close();
	}

}
