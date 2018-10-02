package methodEmbedding.Magic_Trick.S.LYD2082;

import java.util.*;

public class MagicTrick {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int iter = input.nextInt();

		int[] answers = new int[iter];


		// number of cases
		for(int i = 0; i < iter; i++) {
			int first_answer = input.nextInt();
			int[] row = new int[4];
			for(int count = 1; count <= 4; count++) {
				
				for(int j = 0; j < 4; j++) {

					int next = input.nextInt();
					if(first_answer == count) {
						row[j] = next;
					}
				}
			}
			int second_answer = input.nextInt();
			int answer = 0;
			int ans_count = 0;

			for(int count = 1; count <= 4; count++) {
				for(int j = 0; j < 4; j++) {

					int next = input.nextInt();
					if(second_answer == count) {
						for(int k = 0; k < row.length; k++) {
							if(row[k] == next) {
								 ans_count++;
								 answer = row[k];
							}
						}
					}
				}
			}
			if(ans_count == 1) {
				answers[i] = answer;
			}
			if(ans_count > 1) {
				answers[i] = -1;
			}
			if(ans_count == 0) {
				answers[i] = 0;
			}
		}

		for(int i = 0; i < iter; i++) {

			if(answers[i] == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
			else if(answers[i] == -1) {
				System.out.println("Case #" + (i+1) + ": Bad magician!");		
			}
			else {
				System.out.println("Case #" + (i+1) + ": " + answers[i]);
			}
		}
	}
}

