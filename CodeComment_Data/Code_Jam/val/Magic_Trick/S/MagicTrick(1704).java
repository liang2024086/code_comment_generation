package methodEmbedding.Magic_Trick.S.LYD545;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick{
	public static void main(String[] args) throws IOException {
		String inFile = "E:/A-small-attempt0.in";
		String outFile = "E:/A-small-attempt0.out";
		
		Scanner sc = new Scanner(new FileReader(inFile));
		PrintWriter pw = new PrintWriter(outFile);

		int n = sc.nextInt();
		int count = 0;
		int timeRun = 1;
		int resuft = 0;

		while (sc.hasNext()) {
			int numrow1 = sc.nextInt();
			int[] arr1 = new int[16];
			for (int i = 0; i < 16; i++) {
				arr1[i] = sc.nextInt();
			}

			int numrow2 = sc.nextInt();
			int[] arr2 = new int[16];
			for (int i = 0; i < 16; i++) {
				arr2[i] = sc.nextInt();
			}

			int[] answer1 = new int[4];
			int k1 = (numrow1 * 4 - 4);
			for (int i = 0; i < 4; i++) {
				answer1[i] = arr1[k1];
				k1++;
			}

			int[] answer2 = new int[4];
			int k2 = (numrow2 * 4 - 4);
			for (int i = 0; i < 4; i++) {
				answer2[i] = arr2[k2];
				k2++;
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 3; j >=0; j--) {
					if (answer1[i] == answer2[j]) {
						count++;
						resuft = answer1[i];
					}
					
				}

			}
			if (count == 1)
				pw.println("Case " + "#"+timeRun + ": " + resuft);
			else if (count == 0)
				pw.println("Case " +"#"+ timeRun + ": Volunteer cheated!");
			else
				pw.println("Case " + "#"+timeRun + ": Bad magician!");

			timeRun++;
			count = 0;
			resuft = 0;

		}
		pw.flush();
		pw.close();
		
	}

	

	
	
}
