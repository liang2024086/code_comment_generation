package methodEmbedding.Magic_Trick.S.LYD1576;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int z = 0; z < numCases; z++) {
			int col;
			int[][] matrix2 = new int[4][4];
			int[][] matrix = new int[4][4];
			ArrayList<Integer> test = new ArrayList<Integer>();
			ArrayList<Integer> test2 = new ArrayList<Integer>();
			int row = input.nextInt();
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = input.nextInt();
				}
			}
			col = input.nextInt();
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[0].length; j++) {
					matrix2[i][j] = input.nextInt();
				}
			}
			for (int i = 0; i < matrix.length; i++)
				test.add(matrix[row - 1][i]);
			for (int i = 0; i < matrix2.length; i++)
				test2.add(matrix2[col - 1][i]);
			int number = 0;
			int count =0;
			for (int i = 0; i < test.size(); i++) {
				if (test2.contains(test.get(i))) {
					if (number == 0) {
						number = test.get(i);
						count++;
					} else {
						System.out.println("Case #"+(z+1)+": Bad magician!");
						count++;
						break;
					}
					
				}
			}
			if (count == 0) {
				System.out.println("Case #"+(z+1)+": Volunteer cheated!");
			} 
			if(count == 1){
				System.out.println("Case #"+(z+1)+": " + number);
			}

		}
	}

}
