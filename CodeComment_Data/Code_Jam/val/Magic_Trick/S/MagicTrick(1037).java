package methodEmbedding.Magic_Trick.S.LYD595;


import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	public static void main (String args[]){
		int[] cards1 = new int[4];
		int[] cards2 = new int[4];
		Scanner input = new Scanner(System.in);
		int numTest = input.nextInt();
		
		
		for (int i = 1; i <= numTest; i++){
			int ans1 = input.nextInt();
			for (int skip = 1; skip <= 4; skip++){
				if (skip == ans1){
					for (int a = 0; a < 4; a++){
						cards1[a] = input.nextInt();
					}
				}
				else {
					for (int a = 0; a < 4; a++){
						input.nextInt();
					}
				}
			}	

			int ans2 = input.nextInt();
			for (int skip = 1; skip <= 4; skip++){
				if (skip == ans2){
					for (int a = 0; a < 4; a++){
						cards2[a] = input.nextInt();
					}
				}
				else {
					for (int a = 0; a < 4; a++){
						input.nextInt();
					}
				}
			}
						
			ArrayList<Integer> res = new ArrayList<Integer>();

			for (int element1: cards1){
				for (int element2: cards2){
					if (element1 == element2){
						res.add(element1);
					}
				}
			}
			
			String msg = null;
			
			if (res.size() == 1){
				msg = "" + res.get(0);
			}
			else if (res.size() > 1){
				msg = "Bad magician!";
			}
			else {
				msg = "Volunteer cheated!";
			}
			
			System.out.println("Case #" + i + ": " + msg);
		}
		
		input.close();
	}
}
