package methodEmbedding.Magic_Trick.S.LYD1328;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PrintStream out = null ;
		try {
			out = new PrintStream(new FileOutputStream("output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setOut(out);
		
		int cases = sc.nextInt();
		int first_choice = 0;
		int second_choice = 0;
		int [][] board1 = new int [4][4];
		int [][] board2 = new int [4][4];
		HashSet<Integer> set1 = new HashSet<Integer>();
		int count = 0;
		int val = 0;
		
		
		for(int i = 0; i < cases; i ++){

			
			first_choice = sc.nextInt();
			
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					board1[j][k] = sc.nextInt();
					
					// if the right row
					if(j == first_choice - 1){
						
						set1.add(board1[j][k]);
					
					}
				}
			}
			
			second_choice = sc.nextInt();
			
			for(int l = 0; l < 4; l++){
				for(int m = 0; m < 4; m++){
					board2[l][m] = sc.nextInt();
					
					// if the right row
					if(l == second_choice - 1){
						
						if(set1.contains(board2[l][m])){
							val = board2[l][m];
							count++;
						}
						
					}
					
				}
			}
			
			if(count == 1){
				System.out.println("Case #" + (i+1) + ": " + val);
			}
			else if(count > 1){
				System.out.println("Case #" + (i+1) + ": Bad magician!");
				
			}else{
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
				//System.out.println(count);
			}
			
			// reset count and val
			count = 0;
			val = 0;
			set1.clear();
		}
		
				
	}

}
