package methodEmbedding.Magic_Trick.S.LYD56;

import java.io.*;
import java.util.*;

public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int currCase = 1; currCase <= cases; currCase++){
			int firstRow = input.nextInt() - 1;
			int[][] firstGrid = new int[4][4];
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < 4; j++){
					firstGrid[i][j] = input.nextInt();
				}
			}
			int secondRow = input.nextInt() - 1;
			int[][] secondGrid = new int[4][4];
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < 4; j++){
					secondGrid[i][j] = input.nextInt();
				}
			}
			List<Integer> matches = new LinkedList<Integer>();
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < 4; j++){
					if (firstGrid[firstRow][i] == secondGrid[secondRow][j]) matches.add(firstGrid[firstRow][i]);
				}
			}
			String answer = "";
			if (matches.size() > 1) answer = "Bad magician!";
			else if (matches.size() == 0) answer = "Volunteer cheated!";
			else answer = matches.get(0).toString();

			System.out.println("Case #" + currCase + ": " + answer);
		}
	}
}
