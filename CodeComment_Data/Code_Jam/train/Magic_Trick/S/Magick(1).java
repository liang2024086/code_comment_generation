package methodEmbedding.Magic_Trick.S.LYD997;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;



public class Magick {

	public static void main (String[] args) throws NumberFormatException, IOException{
		
		BufferedReader infile = null;
		BufferedWriter out = new BufferedWriter(new FileWriter("src/output.txt"));

		
		try {
			infile = new BufferedReader (new FileReader("src/input.txt"));
		

			// Read File

			int numRuns=0;
		
			numRuns = Integer.parseInt(infile.readLine());
	
			int choice1;
			int choice2;
			int[][] matrix1 = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
			int[][] matrix2 = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

			ArrayList <Integer> choiceRow1 = new ArrayList<Integer> ();
			ArrayList <Integer> choiceRow2 = new ArrayList<Integer> ();

			System.out.println("numRuns = " + numRuns);
	
			for (int i = 0; i < numRuns; i++) {
			
				choiceRow1.clear();
				choiceRow2.clear();

			// run each 
				
				// CHOICE 1
				
				choice1 = Integer.parseInt(infile.readLine())-1;
			
				for (int j = 0; j < 4; j++){
					// Loop four times for the rows
					String s = infile.readLine();
					String[] rowNums = s.toLowerCase().split(" ");
					
					if (j!=choice1) // just ignore the other three rows
						for(int k = 0; k < 4; k++){
							matrix1[j][k] = Integer.parseInt(rowNums[k]);
						}
					else
						for(int k = 0; k < 4; k++){
							matrix1[j][k] = Integer.parseInt(rowNums[k]);
							choiceRow1.add(matrix1[j][k]);
						}
				}
				
				// CHOICE 2
				
				choice2 = Integer.parseInt(infile.readLine())-1;
				
				for (int j = 0; j < 4; j++){
					// Loop four times for the rows
					String s = infile.readLine();
					String[] rowNums = s.toLowerCase().split(" ");
					
					if (j!=choice2) // just ignore the other three rows
						for(int k = 0; k < 4; k++){
							matrix2[j][k] = Integer.parseInt(rowNums[k]);
						}
					else
						for(int k = 0; k < 4; k++){
							matrix2[j][k] = Integer.parseInt(rowNums[k]);
							choiceRow2.add(matrix1[j][k]);
						}	

				}
				
				
				// Input's been read

				// Outfile
				
				
				String output = null;
				
				// First: Check is choice1 is in a different rows
				
				System.out.println(choiceRow1.toString() + " " + i);

				
				int bits = 0;
				int answer = 0;
				
				for (int j = 0; j < 4; j++){
					for (int k = 0; k< 4; k++){
						if (choiceRow1.contains(matrix2[j][k])){
							bits = bits | (1 << (j));
							
							if (j==choice2)
								answer = matrix2[j][k];
						}
					}
				}
				
				//----------------
				// bug fix
				
				int counter = 0;
				
				for (int j = 0; j < 4; j++) {
					if (choiceRow1.contains(matrix2[choice2][j]))
						counter++;
				}
				
				//----------------
				
				if (bits == 15 || counter == 1) {
					output = "Case #" + (i+1) + ": " + answer + "\n";
				}				
				else if (answer == 0){
					output = "Case #" + (i+1) + ": Volunteer cheated!\n";
				}
				else {
					output = "Case #" + (i+1) + ": Bad magician!\n";
				}
	
				
				out.write(output);
	
			}
			
			out.close();	

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
