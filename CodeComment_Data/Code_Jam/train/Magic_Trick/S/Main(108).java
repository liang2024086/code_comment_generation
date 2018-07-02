package methodEmbedding.Magic_Trick.S.LYD2169;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner=new Scanner(new File("E:\\A-small-attempt0.in"));
		PrintWriter printWriter=new PrintWriter(new File("E:\\output.txt"));
		int T=scanner.nextInt();
		for (int i = 1; i <= T; i++) {
			int m=scanner.nextInt();
			int[][] matrix=new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					matrix[j][k]=scanner.nextInt();
				}
			}
			int n=scanner.nextInt();
			int[][] matrix2=new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					matrix2[j][k]=scanner.nextInt();
				}
			}
			int count=0;
			int res=0;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if(matrix[m-1][j]==matrix2[n-1][k]){
						count++;
						res=matrix[m-1][j];
					}
				}
			}
			
			if(count==1){
				printWriter.println("Case #"+i+": "+res);
			}
			else if(count==0){
				printWriter.println("Case #"+i+": Volunteer cheated!");
			}
			else {
				printWriter.println("Case #"+i+": Bad magician!");
			}
			
		}
		printWriter.close();
	}	 	 
}

