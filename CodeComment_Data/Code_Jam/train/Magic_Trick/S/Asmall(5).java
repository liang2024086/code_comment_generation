package methodEmbedding.Magic_Trick.S.LYD1116;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Asmall {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("Asmall.in"));
		PrintWriter out = new PrintWriter("Asmall.out");
		int t,chosenRow;
		int[] a,b;
		int[][] matrix = new int[4][4];
		t = in.nextInt();
		for(int i = 0; i < t; i++){
			chosenRow = in.nextInt();
			for(int m = 0; m < 4; m++)
				for(int n = 0; n < 4; n++)
					matrix[m][n] = in.nextInt();
			a = matrix[chosenRow-1].clone();
			chosenRow = in.nextInt();
			for(int m = 0; m < 4; m++)
				for(int n = 0; n < 4; n++)
					matrix[m][n] = in.nextInt();
			b = matrix[chosenRow-1].clone();
			int repetition = 0, number = 0;
			for(int p = 0; p < 4; p++)
				for(int q = 0; q < 4; q++)
					if(a[p] == b[q]){
						repetition++;
						number = a[p];
					}
			out.print("Case #" + (i+1) + ":");
			if(repetition == 0){
				out.println(" Volunteer cheated!");
			} else if(repetition == 1){
				out.println(" " + number);
			} else{
				out.println(" Bad magician!");
			}
		}
		in.close();
		out.close();
	}
}
