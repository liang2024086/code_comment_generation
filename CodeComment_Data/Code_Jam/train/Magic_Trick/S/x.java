package methodEmbedding.Magic_Trick.S.LYD116;

import java.util.*;
import java.math.*;

public class x {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			System.out.print("Case #" + i + ": ");
			int firstPick = scan.nextInt();
			int[] row = new int[4];
			for(int j = 1; j <= 4; j++){
				for(int k = 0; k < 4; k++){
					if(firstPick == j){
						row[k] = scan.nextInt();
					}else{
						scan.nextInt();
					}
				}
			}
			int secondPick = scan.nextInt();
			int chosen = 0;
			for(int j = 1; j <= 4; j++){
				for(int k = 0; k < 4; k++){
					if(secondPick == j){
						int pot = scan.nextInt();
						for(int l = 0; l < 4; l++){
							
							if(pot == row[l]){
								if(chosen == 0){
									chosen = pot;
								}else{
									chosen = -1;
								}
							}
						}
					}else{
						scan.nextInt();
					}
				}
			}
			if(chosen == 0){
				System.out.println("Volunteer cheated!");
			}else if(chosen == -1){
				System.out.println("Bad magician!");
			}else{
				System.out.println(chosen);
			}
		}
	}
}
