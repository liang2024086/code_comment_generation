package methodEmbedding.Magic_Trick.S.LYD456;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MagicTrickMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/Users/Fudge/Desktop/magicTrick"); // base
																	// directory

		try {
			BufferedReader br = new BufferedReader(new FileReader(inFile));
			String text = br.readLine();

			int cases = Integer.parseInt(text);

			System.out.println("cases:" + cases);

			for (int i = 0; i < cases; i++) {

				text = br.readLine();
				int firstAnswer = Integer.parseInt(text);

				String row;
				int[] firstAnswerRow = new int[4];

				for (int j = 0; j < 4; j++) {
					row = br.readLine();

					if (j == firstAnswer-1) {

						Scanner sc = new Scanner(row);
						for (int k = 0; k < 4; k++) {
							firstAnswerRow[k] = sc.nextInt();
						}

					}

				} // ends first answer

				text = br.readLine();
				int secondAnswer = Integer.parseInt(text);

				int[] secondAnswerRow = new int[4];

				for (int j = 0; j < 4; j++) {
					row = br.readLine();

					if (j == secondAnswer-1) {

						Scanner sc = new Scanner(row);
						for (int k = 0; k < 4; k++) {
							secondAnswerRow[k] = sc.nextInt();
						}

					}

				} // ends second answer

				// lets print so far to check

//				System.out.println("first answer:" + firstAnswer);
//				System.out.println("first answer row:" + firstAnswerRow[0]+ firstAnswerRow[1] + firstAnswerRow[2] + firstAnswerRow[3]);
//				System.out.println("second answer:" + secondAnswer);
//				System.out.println("second answer row:" + secondAnswerRow[0]+ secondAnswerRow[1] + secondAnswerRow[2] + secondAnswerRow[3]);

				int found = 0;

				for (int first : firstAnswerRow) {

					for (int second : secondAnswerRow) {

						if (first == second) {
							if (found == 0) {

								found = first;

							} else {
								found = -1;
							}

						}

					}

				}
				
				
				if (found == 0){
					System.out.println("Case #" + (i+1)+ ": Volunteer cheated!" );
				} else if (found == -1){
					System.out.println("Case #" + (i+1)+ ": Bad magician!" );
				}else {
					System.out.println("Case #" + (i+1)+ ": "+ found);

				}
				

			} // ends cases

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
