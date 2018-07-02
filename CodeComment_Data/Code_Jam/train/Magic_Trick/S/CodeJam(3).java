package methodEmbedding.Magic_Trick.S.LYD585;

import java.util.Scanner;
import java.util.Arrays;

public class CodeJam {
	
static int cases;
static int firstrow;
static int secondrow;
static int[][] grid;
static int[] row;
static int[] row2;
public static void main(String args[]) {

Scanner in = new Scanner(System.in);
grid = new int[4][4];
row = new int[4];
row2 = new int[4];
cases = in.nextInt();

for (int i =1; i<= cases; i++) {
	firstrow = in.nextInt();
	for (int r = 0; r < 4; r++) {
		for(int c = 0; c <4; c++) {
			if (r == firstrow-1) {
				row[c] = in.nextInt();
			} else {
			grid[r][c] = in.nextInt();
		}
		}
	}

secondrow = in.nextInt();
for (int r = 0; r < 4; r++) {
		for(int c = 0; c <4; c++) {
			if (r == secondrow-1) {
			row2[c] = in.nextInt();
		} else {
			grid[r][c] = in.nextInt();
		}
		}
	}
int matches = 0;
int m = 0;
	for (int c = 0; c <4; c++) {
		for (int c1 = 0; c1 <4; c1++) {
			if (row[c] == row2[c1]) {
				matches++;
				m = row[c];
			}
		}
	}

if (matches == 1) {
System.out.println("Case #"+i+": " + m);
} else if(matches > 1) {
	System.out.println("Case #"+i+": Bad magician!");
} else if (matches == 0) {
	System.out.println("Case #"+i+": Volunteer cheated!");
}
}

	}
}
