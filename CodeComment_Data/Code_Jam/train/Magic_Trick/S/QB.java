package methodEmbedding.Magic_Trick.S.LYD1529;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QB {
	public static void main(String[] Args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-small.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

		int caseCnt = sc.nextInt();
		sc.nextLine();

		// Case number
		for (int caseNum = 1; caseNum <= caseCnt; caseNum++) {
			pw.write("Case #"+caseNum+": ");
			System.out.println(caseNum);
			int firstRow = sc.nextInt() - 1;
			int[][] firstArrangement = new int[4][4];
			sc.nextLine();
			for (int j = 0; j < 4; j++) {
				String row = sc.nextLine();
				String[] rowArray = row.split(" ");
				for (int i = 0; i < 4; i++) {
					firstArrangement[j][i] = Integer.parseInt(rowArray[i]);
				}
			}
			int secongRow = sc.nextInt() - 1;
			int[][] secongArrangement = new int[4][4];
			sc.nextLine();
			for (int j = 0; j < 4; j++) {
				String row = sc.nextLine();
				String[] rowArray = row.split(" ");
				for (int i = 0; i < 4; i++) {
					secongArrangement[j][i] = Integer.parseInt(rowArray[i]);
				}
			}
			int result = 0;
			boolean foundOne = false;
			boolean badMagician = false;
			for(int i = 0;i<4;i++) {
				for(int j = 0;j<4;j++) {
					if(secongArrangement[secongRow][i] == firstArrangement[firstRow][j]) {
						if(foundOne) {
							badMagician = true;
						}
						result = secongArrangement[secongRow][i];
						foundOne = true;
					}
				}
			}
			if(badMagician) {
				pw.write("Bad magician!");
			} else if(foundOne) {
				pw.write(result + "");
			} else {
				pw.write("Volunteer cheated!");
			}
			pw.write("\n");
		}

		pw.flush();
		pw.close();
		sc.close();
	}

}
