package methodEmbedding.Magic_Trick.S.LYD1555;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai1 {
		public static void main(String[] args) throws IOException {
			int[][] arr1 = new int[4][4];
			int[][] arr2 = new int[4][4];
			String inFile = "D:\\A-small-attempt1.in";
			String outFile = "D:\\A-small-attempt1.out";
			Scanner sc = new Scanner(new FileReader(inFile));
			PrintWriter print = new PrintWriter(outFile);
			int a = sc.nextInt();
			int time = 1;
			while (a > 0) {
				int choice = sc.nextInt();
				sc.nextLine();
				String[] arrStrings = new String[4];
				for (int i = 0; i < 4; i++) {
					arrStrings[i] = sc.nextLine();
				}
				StringTokenizer st = new StringTokenizer(arrStrings[choice - 1]);
				int number = 0;
				while (st.hasMoreTokens()) {
					arr1[choice - 1][number] = Integer.parseInt(st.nextToken());
					number++;

				}
				int choice2 = sc.nextInt();
				sc.nextLine();
				String[] arrText2 = new String[4];
				for (int i = 0; i < 4; i++) {
					arrText2[i] = sc.nextLine();
				}
				StringTokenizer str2 = new StringTokenizer(arrText2[choice2 - 1]);
				int number2 = 0;
				while (str2.hasMoreTokens()) {
					arr2[choice2 - 1][number2] = Integer.parseInt(str2.nextToken());
					number2++;
				}
				int NumLike = 0;
				int number3 = 0;
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr2.length; j++) {
						if (arr1[choice - 1][i] == arr2[choice2 - 1][j]) {
							NumLike++;
							number3 = arr1[choice - 1][i];
						}
					}
				}
				if (NumLike == 1) {
					print.println("Case #" + time + ": " + number3);
					time++;
				} else if (NumLike == 0) {
					print.println("Case #" + time + ": Volunteer cheated!");
					time++;
				} else {
					print.println("Case #" + time  + ": Bad magician!");
					time++;
				}
				a--;
			}
			print.flush();
			print.close();
			System.out.println("Done");
		}
	}
