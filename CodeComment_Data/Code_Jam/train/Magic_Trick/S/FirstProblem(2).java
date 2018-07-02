package methodEmbedding.Magic_Trick.S.LYD87;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class FirstProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int [][] table = new int[4][4];
			int firChoice = sc.nextInt();
			for (int j = 0; j < table.length; j++) {
				for (int j2 = 0; j2 < table.length; j2++) {
					table[j][j2]=sc.nextInt();
				}
			}
			HashSet<Integer> row = new HashSet<>();
			for (int j = 0; j < table.length; j++) {
				row.add(table[firChoice-1][j]);
			}
			int secChoice = sc.nextInt();
			for (int j = 0; j < table.length; j++) {
				for (int j2 = 0; j2 < table.length; j2++) {
					table[j][j2]=sc.nextInt();
				}
			}
			int choices = 0;
			int chosen = -1;
			for (int j = 0; j < table.length; j++) {
				if(row.contains(table[secChoice-1][j])){
					choices++;
					chosen = table[secChoice-1][j];
				}	
			}
			if(choices==1){
				System.out.printf("Case #%d: %d\n", (i+1), chosen);
			}
			else if(choices == 0){
				System.out.printf("Case #%d: Volunteer cheated!\n", (i+1));
			}
			else{
				System.out.printf("Case #%d: Bad magician!\n", (i+1));
			}
		}
	}

}
