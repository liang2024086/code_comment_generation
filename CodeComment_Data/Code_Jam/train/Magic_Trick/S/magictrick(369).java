package methodEmbedding.Magic_Trick.S.LYD2198;

import java.util.ArrayList;
import java.util.Scanner;

public class magictrick {

	public static void main(String[] args) {
		int f,s,c = 0;
		
		int[][] fm = new int[4][4];
		int[][] sm = new int[4][4];
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> matches = new ArrayList<Integer>();
		c = sc.nextInt();
	
		for(int i = 0; i<c; i++){
		
			System.out.print("Case #"+(i+1)+": ");
			f = sc.nextInt();
			
			
			for(int j = 0; j<4; j++)
				for(int k = 0; k<4; k++)
					fm[j][k] = sc.nextInt();

			s = sc.nextInt();

			for(int j = 0; j<4; j++)
				for(int k = 0; k<4; k++)
					sm[j][k] = sc.nextInt();
			
			for(int j = 0; j<4; j++) 
				for( int k = 0; k<4; k++) {
				if(fm[f-1][j]==sm[s-1][k])
					matches.add(fm[f-1][j]);
			}
					
					
			if(matches.size()>1){
				System.out.print("Bad magician!");
			}
			
			else if(matches.size()==0){
				System.out.print("Volunteer cheated!");
			}
			else
				System.out.print(matches.get(0));
		
			matches.clear();
			System.out.println();
		}
	}
	
}
