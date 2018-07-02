package methodEmbedding.Magic_Trick.S.LYD1416;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int runs = sc.nextInt();
		for (int i = 1; i <= runs; i++) {
			int rowNum = sc.nextInt();
			//System.out.println(rowNum);
			for (int j = 0; j < rowNum; j++) {
				sc.nextLine();
			}
			String row1[] = sc.nextLine().split(" ");
			//System.out.println(row1[0]);

			for (int k = rowNum + 1; k <= 4; k++)
				sc.nextLine();
			rowNum = sc.nextInt();
			//System.out.println(rowNum);
			for (int j = 0; j < rowNum; j++)
				sc.nextLine();
			String rowTemp[] = sc.nextLine().split(" ");
			ArrayList<String> row2 = new ArrayList<String>(rowTemp.length);
			for(int k = 0; k< rowTemp.length; k++)
				row2.add(rowTemp[k]);
			//System.out.println(row2);

			for (int k = rowNum + 1; k <= 4; k++)
				sc.nextLine();
			int dupes = 0;
			int card = 0;
			for (int f = 0; f < row1.length; f++) {
				if (row2.contains(row1[f])) {
					dupes++;
					card = Integer.parseInt(row1[f]);
					//System.out.println(card);

				}
			}
			if (dupes == 1)
				System.out.format("Case #%d: %d\n", i, card);
			else if (dupes < 1)
				System.out.format("Case #%d: Volunteer cheated!\n", i);
			else if (dupes > 1)
				System.out.format("Case #%d: Bad magician!\n", i);
		}
	}
}
