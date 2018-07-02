package methodEmbedding.Magic_Trick.S.LYD1071;


import java.io.*;
import java.util.Scanner;

public class BadMagician {
	public static void main(String[] args) throws IOException{
		Scanner inData = new Scanner(new File("C:\\Users\\Alex\\workspace"
				+ "\\CodeJam\\src\\problemA\\A-small-attempt0.in"));
		PrintWriter outData = new PrintWriter(new File("C:\\Users\\Alex\\workspace"
				+ "\\CodeJam\\src\\problemA\\output.txt"));
		int testCases = inData.nextInt();
		int firstRow;
		int[][] firstSetup = new int[4][4];
		int secondRow;
		int[][] secondSetup = new int[4][4];
		int [] tempRow1 = new int[4];
		int [] tempRow2 = new int[4];
		int answer = 0;
		int count = 0;
		boolean found = false;
		int caseNum;

		for(int i=0; i<testCases; i++){
			firstRow = inData.nextInt()-1;
			for(int r = 0; r<4; r++){
				for(int c = 0; c<4; c++){
					firstSetup[r][c] = inData.nextInt();
				}
			}
			for(int c = 0; c<4; c++){
				tempRow1[c] = firstSetup[firstRow][c];
			}
			secondRow = inData.nextInt()-1;
			for(int r = 0; r<4; r++){
				for(int c = 0; c<4; c++){
					secondSetup[r][c] = inData.nextInt();
				}
			}
			for(int c = 0; c<4; c++){
				tempRow2[c] = secondSetup[secondRow][c];
			}
			for(int in = 0; in<4; in++){
				for(int c = 0; c<4; c++){
					if(tempRow2[in]==tempRow1[c]){
						answer = tempRow2[in];
						count++;
						found = true;
					}
				}
			}
			
			caseNum = i+1;
			if(!found){
				outData.println("Case #"+caseNum+": Volunteer cheated!");
			}
			else if(count==1){
				outData.println("Case #"+caseNum+": "+answer);
			}
			else if(count!=0){
				outData.println("Case #"+caseNum+": Bad magician!");
			}

			count = 0;
			found = false;
		}

		inData.close();
		outData.close();
	}
}
