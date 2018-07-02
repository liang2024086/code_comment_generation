package methodEmbedding.Magic_Trick.S.LYD1299;

// Problem A. Magic Trick

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class MagicTrick {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t = 1; t <= tc; t++) {
			int ans1 = sc.nextInt();
			int[] array1 = new int[4];
			int[][] arrangement = new int[4][4];
			
			for(int i = 0; i < arrangement.length; i++)
				for(int j = 0; j < arrangement.length; j++)
					arrangement[i][j] = sc.nextInt();
			
			System.arraycopy(arrangement[ans1 - 1], 0, array1, 0, 4);
			
			int ans2 = sc.nextInt();
			int[] array2 = new int[4];
			for(int i = 0; i < arrangement.length; i++)
				for(int j = 0; j < arrangement.length; j++)
					arrangement[i][j] = sc.nextInt();
			
			System.arraycopy(arrangement[ans2 - 1], 0, array2, 0, 4);
			
			ArrayList<Integer> row1 = new ArrayList<Integer>();
			for(int i = 0; i < array1.length; i++)
				row1.add(array1[i]);
			
			ArrayList<Integer> row2 = new ArrayList<Integer>();
			for(int i = 0; i < array2.length; i++)
				row2.add(array2[i]);
			
			row1.retainAll(row2);
			
			if(row1.size() == 1)
				System.out.println("Case #" + t + ": " + row1.get(0));
			else if(row1.size() == 0)
				System.out.println("Case #" + t + ": Volunteer cheated!");
			else
				System.out.println("Case #" + t + ": Bad magician!");
				
		}
	}

}
