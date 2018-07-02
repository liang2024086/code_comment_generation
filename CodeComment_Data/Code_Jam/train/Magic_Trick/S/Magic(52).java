package methodEmbedding.Magic_Trick.S.LYD518;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Magic {

	static byte cards1[][], cards2[][], temp1[], temp2[];

	// Main Begins
	public static void main(String args[]) throws IOException {
		File file = new File("A-small-attempt4.in");
		Scanner scan = new Scanner(file);
		
		byte  count = 0, match = 0;
		int t;
		byte answer1 = -1, answer2 = -1;
		File output = new File("output7.txt");
		output.createNewFile();
		FileWriter fw = new FileWriter(output.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		// Initializing the two arrangements of cards.

		cards1 = new byte[4][4];
		cards2 = new byte[4][4];
		temp1 = new byte[4];
		temp2 = new byte[4];
       
		// Reads and store the number of Test cases
		t = scan.nextInt();
		
		// System.out.println("nnumber of test cases= " +t);
		for (int k = 0; k < t; k++) {
			// Reads and store the answer to the first question
			answer1 = scan.nextByte();

			// System.out.println("Answer1=" +answer1);

			// Reads and store the cards arrangement
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					cards1[i][j] = scan.nextByte();
				}
			}

			// System.out.println("cards1= "+ cards1[3][3]);
			// Reads and store the answer to the second question
			answer2 = scan.nextByte();
			// System.out.println("Answer2=" +answer2);
			// Reads and store the other arrangement of cards.
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					cards2[i][j] = scan.nextByte();
				}
			}

			// System.out.println("cards2= "+ cards2[3][3]);
			// Storing the elements of the row chosen as answer one
			for (int i = 0; i < 4; i++) {
				temp1[i] = cards1[answer1 - 1][i];
			}

			// Storing the elements of the row chosen as answer two
			for (int i = 0; i < 4; i++) {
				temp2[i] = cards2[answer2 - 1][i];
			}

			// Checking if any of the item is same.

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (temp1[i] == temp2[j]) {
						count++;
						
						match = temp1[i];
					}
				}
				
			}

		
			if (count == 1) {
				bw.write("Case #" + (k + 1) + ": " + match+"\n");
                
				
			} 
			else if (count > 1){
				bw.write("Case #" + (k + 1) + ": " + "Bad Magician!"+"\n");
			}
				
			else{
				bw.write("Case #" + (k + 1) + ": " + "Volunteer cheated!"+"\n");
			}
				
        count=0;
		}
		
     scan.close();
     bw.close();
	}

	// ENd of Main

}
