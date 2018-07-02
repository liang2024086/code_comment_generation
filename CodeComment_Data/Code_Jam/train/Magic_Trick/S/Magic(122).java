package methodEmbedding.Magic_Trick.S.LYD1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Magic {

public static void main(String[] args){
		
		Scanner scan = null;
		try {
			scan = new Scanner(new File("C:\\Users\\Hans\\Desktop\\A-small-attempt0.in"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintStream ps = null;
		
		try {
			 ps = new PrintStream(new File("C:\\Users\\Hans\\Desktop\\Answers.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++){
			
			int x = scan.nextInt();
			int[][] input1 = new int[4][4];
			
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					input1[j][k] = scan.nextInt();
				}
			}
			
			int y = scan.nextInt();
			int[][] input2 = new int[4][4];
			
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					input2[j][k] = scan.nextInt();
				}				
			}
			
			int counter = 0;
			int chosen = 0;
			
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					if(input1[x-1][j] == input2[y-1][k]){
						counter++;
						chosen = input1[x-1][j];
					}
				}
			}
			
			if(counter == 1)
				ps.println("Case #" + (i+1) + ": " + chosen);
			else if(counter > 1)
				ps.println("Case #" + (i+1) + ": Bad magician!");
			else if(counter == 0)
				ps.println("Case #" + (i+1) + ": Volunteer cheated!");
			
		}
		
		scan.close();
		
	}
	
}
