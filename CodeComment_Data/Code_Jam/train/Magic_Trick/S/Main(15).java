package methodEmbedding.Magic_Trick.S.LYD1540;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = null;
		File file = new File("A-small-attempt1.in");
		try {
			input = new Scanner(file);
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int number_of_tests = input.nextInt();
		int case_number = 1;
		int number_that_match = 0;
		int answer = 0;
		int[] card_grid = new int[16];
		int[] first_answer = new int[4];
		int[] second_answer = new int[4];

		while (input.hasNextInt()) {
			int vol_answer = input.nextInt();
			for (int i = 0; i < card_grid.length; i++) {
				card_grid[i] = input.nextInt();
			}
		
			for (int i = 0; i < first_answer.length; i++) {
				first_answer[i] = card_grid[i + (vol_answer - 1) * 4];
			}

			vol_answer = input.nextInt();
			for (int i = 0; i < card_grid.length; i++) {
				card_grid[i] = input.nextInt();
			}
			
			
			for (int i = 0; i < second_answer.length; i++) {
				second_answer[i] = card_grid[i + (vol_answer - 1) * 4];
			}
			
			for (int i = 0; i < first_answer.length; i++) {
				for (int j = 0; j < second_answer.length; j++) {
					if (first_answer[i] == second_answer[j]) {
						number_that_match++;
						answer = first_answer[i];
					}
				}
			}
			
			if (number_that_match == 1) {
				System.out.println("Case #" + case_number +  ": " + answer);
			} else if (number_that_match > 1) {
				System.out.println("Case #" + case_number +  ": Bad magician!");
			} else {
				System.out.println("Case #" + case_number +  ": Volunteer cheated!");
			}
			
			number_that_match = 0;
			case_number++;
			
		}

	}

}
