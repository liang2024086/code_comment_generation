package methodEmbedding.Magic_Trick.S.LYD950;

import java.io.*;
import java.util.Scanner;
public class MagicTrick {
	public static void main(String[] args) throws IOException {
		File file = new File("blahblah.txt");
		Scanner keyboard = new Scanner(file);
		File output = new File("Solutions1.txt");
		FileWriter fw = new FileWriter(output);
		int a = keyboard.nextInt();
		for(int i = 0; i < a; i++) {
			int answer = keyboard.nextInt();
			int arr[][] = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++)
				arr[j][k] = keyboard.nextInt();
			}
			int answer1 = keyboard.nextInt();
			int arr1[][] = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++)
				arr1[j][k] = keyboard.nextInt();
			}
			int counter = 0;
			int ans = 0;
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					if (arr[answer - 1][k] == arr1[answer1 - 1][j]) {
						ans = arr[answer - 1][k];
						counter++;
					}
				}
			}
			if (counter == 0) {
				fw.write("Case #" + (i+1) + ": Volunteer cheated!\n");
			} else if(counter == 1) {
				fw.write("Case #" + (i+1) + ": " + ans + "\n");
			} else {
				fw.write("Case #" + (i+1) + ": Bad magician!\n");
			}
		}
		keyboard.close();
		fw.close();
	}

}
