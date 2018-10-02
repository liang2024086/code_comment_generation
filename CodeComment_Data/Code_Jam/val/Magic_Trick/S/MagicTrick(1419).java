package methodEmbedding.Magic_Trick.S.LYD719;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<cases; i++) {
			int firstRow = Integer.parseInt(scan.nextLine());
			String[][] firstOrient = new String[4][4];
			for(int j=0; j<4; j++) {
				firstOrient[j] = scan.nextLine().split(" ");
			}
			
			HashSet<String> firstPos = new HashSet<>();
			for(int j=0; j<4; j++) {
				firstPos.add(firstOrient[firstRow-1][j]);
			}

			int secondRow = Integer.parseInt(scan.nextLine());
			String[][] secondOrient = new String[4][4];
			for(int j=0; j<4; j++) {
				secondOrient[j] = scan.nextLine().split(" ");
			}
			
			HashSet<String> secondPos = new HashSet<>();
			for(int j=0; j<4; j++) {
				secondPos.add(secondOrient[secondRow-1][j]);
			}
			
			firstPos.retainAll(secondPos);
			if(firstPos.size()>1) {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
			else if(firstPos.size()==0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
			else {
				System.out.println("Case #" + (i+1) + ": " + firstPos.iterator().next());
			}
		}
	}

}
