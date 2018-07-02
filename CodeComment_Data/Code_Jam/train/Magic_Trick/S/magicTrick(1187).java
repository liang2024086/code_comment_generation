package methodEmbedding.Magic_Trick.S.LYD2041;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class magicTrick {
	

	public static void main(String[] args) throws FileNotFoundException {
		int T;
		Scanner file = new Scanner(new File("A-small-attempt3.in"));
		
		
		T = file.nextInt();
		int i = 1;
		int[][] grid = new int[4][4];
		int[][] regrid = new int[4][4];
		while (i < T + 1) {
			int row1 = file.nextInt();
			for (int x = 0;x < 4;x++) {
				for (int y = 0;y < 4;y++) {
					grid[x][y] = file.nextInt();
				}
			}
			ArrayList<Integer> targetRow = new ArrayList<>();
			for (int element:grid[row1 - 1]) {
				
				targetRow.add(element);
			}
		    int row2 = file.nextInt();
		    for (int x = 0;x < 4;x++) {
				for (int y = 0;y < 4;y++) {
					regrid[x][y] = file.nextInt();
				}
			}
		    int[] result = regrid[row2 - 1];
		    int num = 0;
		    int x = 0;
		    for (int index = 0;index < 4;index++) {
		    	
		    	if (targetRow.contains(result[index])) {
		    		num++;
		    		x = index;
		    	}
		    }
		    if (num > 1) {
		    	System.out.println("Case #" + i +": Bad magician!");
		    } else if (num == 0) {
		    	System.out.println("Case #" + i +": Volunteer cheated!");
		    } else {
		    	System.out.println("Case #" + i +": " + result[x]);
		    }
		    
			
			
			i++;
			
		}
		file.close();
		
		
	}
	
	
	
	
	
	
}
