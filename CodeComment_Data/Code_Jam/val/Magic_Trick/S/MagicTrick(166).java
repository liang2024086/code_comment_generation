package methodEmbedding.Magic_Trick.S.LYD1153;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String [] args) throws IOException {
		Scanner input = new Scanner(new File("A-small-attempt2.in"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt")); 

		int testCases = input.nextInt();
		for (int i=1; i<=testCases; i++) {
			ArrayList<ArrayList> board1 = new ArrayList(4);
			int row1 = input.nextInt() - 1;
			for (int y=0; y<4; y++) {
				ArrayList<Integer> row = new ArrayList(4);
				for (int x=0; x<4; x++) {
					row.add(input.nextInt());
				}
				board1.add(row);
			}
			ArrayList<Integer> pickedRow = board1.get(row1);
			int row2 = input.nextInt() - 1;
			ArrayList<ArrayList> board2 = new ArrayList(4);
			for (int y=0; y<4; y++) {
				ArrayList<Integer> row = new ArrayList(4);
				for (int x=0; x<4; x++) {
					row.add(input.nextInt());
				}
				board2.add(row);
			}
			ArrayList<Integer> pickedRow2 = board2.get(row2);
			out.print("Case #" + i + ": ");
			int num = -1;
			for (Integer first: pickedRow) {
				if (pickedRow2.contains(first)) {
					if (num!=-1) {
						num = -2;
						break;
					}
					num = first;
				}
			}
			if (num == -1) {
				out.println("Volunteer cheated!");
			} else if (num == -2) {
				out.println("Bad magician!");
			} else {
				out.println(num);
			}
		}
		out.close();
	}
}
