package methodEmbedding.Magic_Trick.S.LYD1744;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedInputStream;
public class A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		
		int N = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
			int firstRow = scanner.nextInt();
			int[] row1 = new int[4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					int x = scanner.nextInt();
					if (firstRow == j+1) {
						row1[k] = x;
					}
				}
			}
			
			int secondRow = scanner.nextInt();
			int[] row2 = new int[4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					int x = scanner.nextInt();
					if (secondRow == j+1) {
						row2[k] = x;
					}
				}
			}
			
			Arrays.sort(row1);
			Arrays.sort(row2);
			
			int j = 0;
			int k = 0;
			int out = -1;
			boolean found = false;
			boolean badMagician = false;
			while (j < 4 && k < 4) {
				if (row1[j] == row2[k]) {
					if (found) {
						badMagician = true;
						break;
					}
					found = true;
					out = row1[j];
					j++;
					k++;
				}
				else if (row1[j] < row2[k]) {
					j++;
				}
				else {
					k++;
				}
			}
			
			String message = "Case #" + (i+1) + ": ";
			if (badMagician) {
				message += "Bad magician!";
			}
			else if (!found) {
				message += "Volunteer cheated!";
			}
			else {
				message += out;
			}
			
			System.out.println(message);
			
			/*System.out.println(firstRow);
			for (int j = 0; j < 4; j++) {
				System.out.println(row1[j]);
			}
			System.out.println(secondRow);
			for (int j = 0; j < 4; j++) {
				System.out.println(row2[j]);
			}*/
		}
	}
}
