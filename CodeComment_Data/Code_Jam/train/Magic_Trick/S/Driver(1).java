package methodEmbedding.Magic_Trick.S.LYD1108;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		Scanner k = null;
		//Output to file with
		//writer.println() (replace prinln with just print or any other type of output)
		PrintWriter writer = null;
		try 
		{
			//Make the data equal the infile variable
			k = new Scanner (new File("i.txt"));
			writer = new PrintWriter("o.txt");
		} 
		catch (FileNotFoundException e) 
		{
			//If the file isn't found, stop the program
			System.out.println ("File not found!");
	      	System.exit (0);
		}
		//Goes through Everything in the file
		while(k.hasNext()){
			int cases = k.nextInt();
			int[][] set1 = new int[4][4];
			int[][] set2 = new int[4][4];
			int[] row1 = new int[4];
			int[] row2 = new int[4];
			int r1;
			int r2;
			for(int e = 0; e < cases; e ++){
				r1 = k.nextInt();
				for(int a = 0; a < 4; a ++){
					for(int d = 0; d < 4; d ++){
						set1[a][d] = k.nextInt();
					}
				}

				//row1 = set1[r1 - 1];
				for(int a = 0; a < 4; a ++){
					row1[a] = set1[r1 - 1][a];
					System.out.print(set1[r1 - 1][a]);
				}
				System.out.println();
				
				r2 = k.nextInt();
				
				for(int a = 0; a < 4; a ++){
					for(int d = 0; d < 4; d ++){
						set2[a][d] = k.nextInt();
					}
				}
				int answers = 0;
				int answer = 0;
				row2 = set2[r2 - 1];
				for(int c : set1[r1 - 1]){
					for(int g : set2[r2 - 1]){
						if(c == g){
							answers ++;
							answer = c;
						}
					}
				}
				writer.print("Case #" + (e + 1) + ": ");
				if(answers == 0){
					writer.println("Volunteer cheated!");
				}
				else if(answers == 1){
					writer.println(answer);
				}
				else{
					writer.println("Bad magician!");
				}
			}
		}
		
		k.close();
		writer.close();
	}
}
