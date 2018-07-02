package methodEmbedding.Magic_Trick.S.LYD602;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class Magic {
	
	static Scanner in;
	static PrintWriter out;
	
	public static void main(String[] args) throws IOException{
		
		in = new Scanner(new FileInputStream("A-small-attempt2.in"));
		out = new PrintWriter(new FileOutputStream("A-small-attempt2.out")); 
		
		int iteration = in.nextInt();
		
		for (int z = 0; z < iteration; z++){
			
			int[][] board1 = new int[4][4];
			int[][] board2 = new int[4][4];
			
			int row1;
			int row2;
			
			row1 = in.nextInt() - 1;
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < 4; j++){
					board1[i][j] = in.nextInt();
				}
			}
			
			row2 = in.nextInt() - 1;
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < 4; j++){
					board2[i][j] = in.nextInt();
				}
			}
			
			LinkedList store = new LinkedList();
			
			for (int i = 0; i < 4; i++){
				// System.out.println("~~" + board1[row1][i]);
				for (int j = 0; j < 4; j++){
					// System.out.println("***" + board2[row2][j]);
					if (board1[row1][i] == board2[row2][j]){
						store.add(board1[row1][i]);
					}
				}
			}
			
			int num = z + 1;
			
			if (store.size() == 1){
				out.println("Case #" + num + ": " + store.get(0));
			} else if (store.size() == 0){
				out.println("Case #" + num + ": " + "Volunteer cheated!");
			} else {
				out.println("Case #" + num + ": " + "Bad magician!");
			}
			
		}
		
		out.flush();
		out.close();
		
	}

}
