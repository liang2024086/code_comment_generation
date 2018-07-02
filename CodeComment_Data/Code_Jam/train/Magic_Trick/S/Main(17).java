package methodEmbedding.Magic_Trick.S.LYD1075;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		boolean sample = false;
		String input = "A-small-attempt0.in";
		String output = "output.txt";
		if(sample){
			input = "sample.in";
			output = "sample.out";
		}
		
		Scanner in = new Scanner(new File(input));
		PrintWriter out  = new PrintWriter(new File(output));
		
		
		int t = in.nextInt();
		
		for(int c = 1; c <= t; c++){
			int a1 = in.nextInt();
			
			int [][] board = new int [4][4];
			
			for(int i = 0; i < board.length; i++){
				for(int j = 0; j < board.length; j++){
					board[i][j] = in.nextInt();
				}
			}
			
			int a2 = in.nextInt();
			
			
			int [][] board2 = new int [4][4];
			
			for(int i = 0; i < board2.length; i++){
				for(int j = 0; j < board2.length; j++){
					board2[i][j] = in.nextInt();
				}
			}
			
			
			int x = -1;
			int count = 0;
			HashSet<Integer> s = new HashSet<Integer>();
			
			for(int i = 0; i < 4; i++){
				s.add(board[a1-1][i]);
			}
			
			for(int i = 0; i < 4; i++){
				if(s.contains(board2[a2-1][i])){
					count++;
					x = board2[a2-1][i];
				}
			}
			
			System.out.printf("Case #%d: ", c);
			if(count == 0){
				System.out.println("Volunteer cheated!");
			}
			else if(count == 1){
				System.out.println(x);
			}
			else{
				System.out.println("Bad magician!");
			}
			
		}
		
		
		
		
		
		in.close();
		out.close();
	}
}
