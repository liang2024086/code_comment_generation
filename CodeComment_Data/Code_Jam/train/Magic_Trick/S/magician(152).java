package methodEmbedding.Magic_Trick.S.LYD1802;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int caseNumber = in.nextInt();
			
		int R1[] = new int[caseNumber];
		int R2[] = new int[caseNumber];
				
		int[][][] cards1 = new int[caseNumber][4][4];
		int[][][] cards2 = new int[caseNumber][4][4];
		
		for(int x = 0; x < caseNumber; x++){
			
			R1[x] = in.nextInt() - 1;
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					cards1[x][i][j] = in.nextInt();
				}
			}

			R2[x] = in.nextInt() - 1;
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					cards2[x][i][j] = in.nextInt();
				}
			}
		}
		

			
		//CHECK
		for(int x = 0; x < caseNumber; x++){
			List<Integer> answers = new ArrayList<Integer>();
			
			for(int i = 0; i < 4; i++){
				
				for(int j = 0; j < 4; j++){
					if(cards2[x][R2[x]][i] == cards1[x][R1[x]][j]){
						answers.add(cards2[x][R2[x]][i]);
					}
				}
			}
			
			
			if(answers.size() == 0){
				System.out.println("Case #" + (x + 1) + ": Volunteer cheated!");
			} else if(answers.size() == 1){
				System.out.println("Case #" + (x + 1) + ": " + answers.get(0));
			} else {
				System.out.println("Case #" + (x + 1) + ": Bad magician!");
			}
		}
	}
}
