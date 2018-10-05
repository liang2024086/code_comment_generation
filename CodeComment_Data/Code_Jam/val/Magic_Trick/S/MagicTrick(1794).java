package methodEmbedding.Magic_Trick.S.LYD431;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(args[0]));
		PrintWriter pw = new PrintWriter("output.txt");
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			int row1 = scanner.nextInt();
			System.out.println(row1);
			for (int j = 0; j < row1; j++) {
				scanner.nextLine();
			}
			List<Integer> firstRow = new ArrayList<Integer>(4);
			for (int k = 0; k < 4; k++) {
				firstRow.add(scanner.nextInt());
			}
			System.out.println(firstRow);
			for (int j = row1; j <= 4; j++) {
				scanner.nextLine();
			}
			
			int row2 = scanner.nextInt();
			System.out.println(row2);
			for (int j = 0; j < row2; j++) {
				scanner.nextLine();
			}
			List<Integer> secondRow = new ArrayList<Integer>(4);
			for (int k = 0; k < 4; k++) {
				secondRow.add(scanner.nextInt());
			}
			System.out.println(secondRow);
			for (int j = row2; j <= 4; j++) {
				scanner.nextLine();
			}
			firstRow.retainAll(secondRow);
			if (firstRow.size() == 0) {
				pw.println("Case #"+ (i + 1) +": Volunteer cheated!");
			} else if (firstRow.size() > 1) {
				pw.println("Case #"+ (i + 1) +": Bad magician!");
			} else {
				pw.println("Case #"+ (i + 1) +": " + firstRow.get(0));
			}
		}
		pw.close();
		scanner.close();
	}
}
