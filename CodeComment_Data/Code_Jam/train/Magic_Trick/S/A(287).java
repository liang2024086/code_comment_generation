package methodEmbedding.Magic_Trick.S.LYD1233;

import java.util.*;

public class A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		outer: for(int i=1;i<=t;i++){
			int a = s.nextInt();
			int[][] board = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					board[j][k] = s.nextInt();
				}
			}
			int[] possibilities = board[a-1];
			a = s.nextInt();
			board = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					board[j][k] = s.nextInt();
				}
			}
			int[] otherPos = board[a-1];
			ArrayList<Integer> results = new ArrayList<Integer>();
			int answer=-1;
			for(int j=0;j<4;j++){
				if(results.contains(possibilities[j])){
					if(answer==-1){
						answer = possibilities[j];
					}
					else {
						System.out.println("Case #"+i+": Bad magician!");
						continue outer;
					}
				}
				results.add(possibilities[j]);
				if(results.contains(otherPos[j])){
					if(answer==-1){
						answer = otherPos[j];
					}
					else {
						System.out.println("Case #"+i+": Bad magician!");
						continue outer;
					}
				}
				results.add(otherPos[j]);
			}
			if(answer == -1){
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			else {
				System.out.println("Case #"+i+": "+answer);
			}
		}
	}
}
