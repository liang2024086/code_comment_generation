package methodEmbedding.Magic_Trick.S.LYD2234;

import java.util.*;

public class MagicTrick{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i = 1; i <= t; i++){
			int row = in.nextInt() - 1;
			int arr1[][] = new int[4][4];
			boolean sign[] = new boolean[17];
			
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					arr1[j][k] = in.nextInt();
										
					if(row == j){
						sign[arr1[j][k]] = true;
						//System.out.print(arr1[j][k] + " ");
					}
				}
			}
			
			//System.out.println();
			arr1 = new int[4][4];
			row = in.nextInt() - 1;
			int result = 0;
			int counter = 0;
			
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					arr1[j][k] = in.nextInt();
					
					if(row == j && sign[arr1[j][k]]){
						counter++;
						result = arr1[j][k];
					}
				}
			}
			
			String temp;
			
			if(counter == 0){
				temp = "Volunteer cheated!";
			}
			else if(counter == 1){
				temp = result + "";
			}
			else{
				temp = "Bad magician!";
			}
			
			System.out.println("Case #" + i + ": " + temp);
		}
	}
}
