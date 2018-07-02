package methodEmbedding.Magic_Trick.S.LYD411;

/* Filename: Q2014A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2014A {

	public static void main(String[] args) throws Exception {
		final int SIZE = 4 + 1;
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter output = new PrintWriter(new File("pA.out"));

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int t = 1; t <= T; ++t){
				int row1 = input.nextInt();
				int[][] arrange1 = new int[SIZE][SIZE];
				
				for(int i = 1; i < SIZE; ++i){
					for(int j = 1; j < SIZE; ++j){
						arrange1[i][j] = input.nextInt();
					}
				}
				
				int row2 = input.nextInt();
				int[][] arrange2 = new int[SIZE][SIZE];
				
				for(int i = 1; i < SIZE; ++i){
					for(int j = 1; j < SIZE; ++j){
						arrange2[i][j] = input.nextInt();
					}
				}
				
				int[] countNum = new int[16 + 1];
				for(int i = 1; i < SIZE; ++i){
					++countNum[arrange1[row1][i]];
					++countNum[arrange2[row2][i]];
				}
				
				int count2 = 0;
				int selectedNum = 0;
				for(int i = 1; i < countNum.length; ++i){
					if(countNum[i] >= 2){
						selectedNum = i;
						++count2;
					}
				}
				
				output.printf("Case #%d: ", t);
				if(count2 > 1){
					output.println("Bad magician!");
				}
				else if(count2 < 1){
					output.println("Volunteer cheated!");
				}
				else{
					output.println(selectedNum);
				}
			}
		}
		
		output.close();
	}

}
