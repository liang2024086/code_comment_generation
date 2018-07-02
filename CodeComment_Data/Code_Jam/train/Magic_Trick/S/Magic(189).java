package methodEmbedding.Magic_Trick.S.LYD159;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Magic {

	public static void main(String[] args) {
		
		Scanner file = null;
		try {
			file = new Scanner(new File("A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int total_cases = file.nextInt();
		file.nextLine();
		
		int one, two, three, four;
		
		for (int i = 0; i < total_cases; i++) {
			
			int row_number = file.nextInt();
			file.nextLine();
			
			for (int j = 0; j < row_number-1; j++) {
				file.nextLine();
			}
			
			one = file.nextInt();
			two = file.nextInt();
			three = file.nextInt();
			four = file.nextInt();
			file.nextLine();
			
			for (int j = 0; j < 4-row_number; j++) {
				file.nextLine();
			}
			
			row_number = file.nextInt();
			file.nextLine();
			
			for (int j = 0; j < row_number-1; j++) {
				file.nextLine();
			}
			
			int number = 0;
			int number_of_repeats = 0;
			
			for (int j = 0; j < 4; j++) {
				
				int temp = file.nextInt();
				
				if (temp == one) {
					number_of_repeats++;
					number = temp;
				}
				
				if (temp == two) {
					number_of_repeats++;
					number = temp;
				}
				
				if (temp == three) {
					number_of_repeats++;
					number = temp;
				}
				
				if (temp == four) {
					number_of_repeats++;
					number = temp;
				}

			}
			
			file.nextLine();
			
			for (int j = 0; j < 4-row_number; j++) {
				file.nextLine();
			}
			
			if (number_of_repeats == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else if (number_of_repeats == 1) {
				System.out.println("Case #" + (i+1) + ": " + number);
			} else if (number_of_repeats > 1 ) {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
			
		}

	}

}
