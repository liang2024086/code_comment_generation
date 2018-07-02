package methodEmbedding.Magic_Trick.S.LYD32;

import java.io.*;
import java.util.*;


public class Magician {
	public static void main(String[] args) throws FileNotFoundException {
		int cases;
		
		Scanner sc = new Scanner(new File("input.txt"));
		PrintStream output = new PrintStream(new FileOutputStream("output.txt"));
		
		cases = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= cases; i++) {
			int num_solution = 0;
			int solution = 0;
			int row_num = Integer.parseInt(sc.nextLine());
			
			LinkedList<Integer> row_before = new LinkedList<Integer>();
			LinkedList<Integer> row_after = new LinkedList<Integer>();
			
			for (int j = 1; j <= 4; j++) {
				String row = sc.nextLine();
				if (j == row_num) {
					String[] row_nums = row.split(" ");
					for (String x : row_nums) {
						row_before.add(Integer.parseInt(x));
					}
				}
			}
			
			row_num = Integer.parseInt(sc.nextLine());
			
			for (int j = 1; j <= 4; j++) {
				String row = sc.nextLine();
				if (j == row_num) {
					String[] row_nums = row.split(" ");
					for (String x : row_nums) {
						row_after.add(Integer.parseInt(x));
					}
				}
			}
			
			for (int x : row_after) {
				if (row_before.contains(x)) {
					solution = x;
					num_solution++;
				}	
			}
			
			output.print("Case #" + i + ": ");
			
			if (num_solution == 0) {
				output.println("Volunteer cheated!");
			} else if (num_solution == 1) {
				output.println(solution);
			} else {
				output.println("Bad magician!");
			}
		}
		
		output.close();
		sc.close();
	}
}
