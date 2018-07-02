package methodEmbedding.Magic_Trick.S.LYD577;

import java.util.Scanner;


public class Qual_Magic_Trick_fixed {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		Scanner in = new Scanner(System.in);
		
		int numCases = Integer.parseInt(in.nextLine());
		
		for( int testCase = 1; testCase < numCases + 1 ; testCase++){
			int[] possAnswers = new int[4];
			
			int answer = -1;
			//get answer rowNum & store possible answers
			int volAnswer = Integer.parseInt(in.nextLine());
			for(int i = 0; i < 4; i++){
				String row = in.nextLine();
				if(i == volAnswer - 1){
					String[] strVals = row.split(" ");
					for(int j = 0; j < 4; j++){
						possAnswers[j] = Integer.parseInt(strVals[j]);
					}
				}
			}
			//get supposed answer rowNum for second grid
			volAnswer = Integer.parseInt(in.nextLine());
			int[][] grid = new int[4][4];
			int numAnswers=0;
			for(int rowN = 0; rowN < 4; rowN++){
				String row = in.nextLine();
				String[] rowVals = row.split(" ");
				for(int colN = 0; colN < 4; colN++){
					grid[rowN][colN] = Integer.parseInt(rowVals[colN]);
					if(rowN == volAnswer - 1){
						for(int n: possAnswers){
							if(n == grid[rowN][colN]){
								answer = grid[rowN][colN];
								numAnswers++;
							}
						}
					}
				}
			}
			String answMsg = "";
			if(numAnswers ==1) answMsg = Integer.toString(answer);
			else if(numAnswers == 0) answMsg = "Volunteer cheated!";
			else answMsg = "Bad magician!";
			System.out.println("Case #" + testCase + ": " + answMsg);
		
		}
		

	}

}
