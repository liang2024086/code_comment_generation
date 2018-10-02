package methodEmbedding.Magic_Trick.S.LYD1516;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int [][] firstMatrix = new int [4][4];
		int [][] secondMatrix = new int [4][4];
		int [] firstChosenRow = new int [4];
		int [] secondChosenRow = new int [4];
		int firstChoice = 0;
		int secondChoice = 0;
		int caseCounter = 0;
		int i=0,j=0,k=0;
		caseCounter = scanner.nextInt();		
		BufferedWriter out = new BufferedWriter(new FileWriter("result.out"));
		
		for(i=0;i<caseCounter;i++){
			firstChoice = scanner.nextInt();
			for(j=0;j<4;j++){
				for(k=0;k<4;k++){
					firstMatrix[j][k] = scanner.nextInt();
				}
			}
			firstChosenRow = firstMatrix[firstChoice-1];
			secondChoice = scanner.nextInt();
			for(j=0;j<4;j++){
				for(k=0;k<4;k++){
					secondMatrix[j][k] = scanner.nextInt();
				}
			}
			secondChosenRow = secondMatrix[secondChoice-1];
			int result = 0;
			int resultCounter = 0;
			for(j=0;j<4;j++){
				for(k=0;k<4;k++){
					if(firstChosenRow[j] == secondChosenRow[k]){
						result = firstChosenRow[j];
						resultCounter++;
					}
				}
			}
			
			if(resultCounter == 0){
				out.write("Case #" + (i+1) + ":" + " Volunteer cheated!");
			}else if(resultCounter == 1){
				out.write("Case #" + (i+1) + ": " + result);
			}else{
				out.write("Case #" + (i+1) + ":" + " Bad magician!");
			}
			out.newLine();
		}
		
		out.close();
		
	}
}
