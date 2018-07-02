package methodEmbedding.Magic_Trick.S.LYD1609;

import java.util.*;
import java.io.*;

public class magic{
	public static void main(String args[])throws Exception{
		Scanner input=new Scanner(new File("magic.in"));
		PrintWriter output=new PrintWriter(new File("magic.out"));
		int Z=input.nextInt();
		ArrayList<Integer> first=new ArrayList<Integer>(4);
		ArrayList<Integer> both=new ArrayList<Integer>(4);
		int[][] board=new int[4][4];
		int N;
		int M;
		for(int z=1; z<=Z; z++){
			N=input.nextInt();
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					board[i][j]=input.nextInt();
				}
			}
			for(int i=0; i<4; i++){
				first.add(board[N-1][i]);
			}
			M=input.nextInt();
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					board[i][j]=input.nextInt();
				}
			}
			for(int i=0; i<4; i++){
				if(first.contains(board[M-1][i])) both.add(board[M-1][i]);
			}
			if(both.size()==0) output.println("Case #"+z+": Volunteer cheated!");
			else if(both.size()==1) output.println("Case #"+z+": "+both.get(0));
			else output.println("Case #"+z+": Bad magician!");
//			System.out.println(z+" "+Arrays.toString(first.toArray())+" "+Arrays.toString(both.toArray()));
			first.clear();
			both.clear();
		}
		output.close();
	}
}
