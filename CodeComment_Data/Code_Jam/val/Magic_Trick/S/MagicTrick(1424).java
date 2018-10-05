package methodEmbedding.Magic_Trick.S.LYD148;


import java.io.File;

import java.util.Scanner;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numTestCases =0;
		try{
		File inputFile = new File("/tmp/A-small-attempt0.in");
		Scanner scanner = new Scanner(inputFile);
		numTestCases  = scanner.nextInt();
		
		for(int testCase=1; testCase<=numTestCases ; testCase++){
			int firstAppearance = scanner.nextInt()-1;
			int[][] arr1 = new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr1[i][j] = scanner.nextInt();
				}
			}
			int secondAppearance = scanner.nextInt()-1;
			int[][] arr2 = new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr2[i][j] = scanner.nextInt();
				}
			}
			
			int selectedCard =0;
			int matchCount = 0;
			String output ="Case #"+testCase+": ";

			for(int i=0 ; i<4 ;i++){
				int temp = arr1[firstAppearance][i];
				for(int j=0;j<4;j++){
					if(temp == arr2[secondAppearance][j]){
						selectedCard = temp;
						matchCount++;
						
					}
				}
			}
			if(matchCount == 1){
				output =output+ ""+selectedCard;
			}
			else if(matchCount == 0){
				output =output+ "Volunteer cheated!";
			}
			else{
				output =output+ "Bad magician!";
			}
			System.out.println(output);
		}
	}
		catch(Exception exception){
		System.err.println(exception.getMessage());	
		}

	}
	
}
