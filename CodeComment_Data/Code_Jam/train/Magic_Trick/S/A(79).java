package methodEmbedding.Magic_Trick.S.LYD81;

import java.util.ArrayList;
import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++){
			int[] firstGrid = new int[4];
			int row1 = in.nextInt();
			
			for(int j = 0; j < 4; j++){	
				for(int k = 0; k < 4; k++){
					if(j+1 == row1)
						firstGrid[k] = in.nextInt();
					else
						in.nextInt();
				}
			}
			
			int[] secondGrid = new int[4];
			int row2 = in.nextInt();
			
			for(int j = 0; j < 4; j++){	
				for(int k = 0; k < 4; k++){
					if(j+1 == row2)
						secondGrid[k] = in.nextInt();
					else
						in.nextInt();
				}
			}
			
			ArrayList<Integer> sameCard = new ArrayList<Integer>();
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					if(firstGrid[j] == secondGrid[k])
						sameCard.add(firstGrid[j]);
				}
			}
			
			System.out.print("Case #" + (i+1) + ": ");
			if(sameCard.isEmpty())
				System.out.println("Volunteer cheated!");
			else if(sameCard.size() > 1)
				System.out.println("Bad magician!");
			else
				System.out.println(sameCard.get(0));
		}

	}

}
