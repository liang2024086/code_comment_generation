package methodEmbedding.Magic_Trick.S.LYD985;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class magic {



	public static void main(String[] args){
		int testcases = 0;
		int oneA = 0;
		int twoA = 0;
		int casenumber = 0;
		int[][] oneAR = new int[4][4];
		int[][] twoAR = new int[4][4];
		int possible = 0;
		int answer = 0;

		FileReader inFile = null;
		try {
			inFile = new FileReader("input.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Scanner input = new Scanner(inFile);

		testcases = input.nextInt();

		for(int i = 0; i < testcases; i++){
			casenumber++;
			oneA = input.nextInt();
			for(int w = 0; w < 4; w++){
				for(int e = 0; e < 4; e++){
				oneAR[w][e] = input.nextInt();
				}//2nd for loop
			}//end 1st for loop
			twoA = input.nextInt();
			for(int m = 0; m < 4; m++){
				for(int e = 0; e < 4; e++){
				twoAR[m][e] = input.nextInt();
				}//2nd for loop
			}//end 1st for loop
			for(int n = 0; n < 4; n++){
				for(int e = 0; e < 4; e++){
					if(oneAR[oneA - 1][n] == twoAR[twoA - 1][e]){
						possible ++;
						answer = oneAR[oneA - 1][n];
					}//end if
				}//end loop
			}//end loop
			if(possible == 1){
				System.out.println("Case #" + casenumber + ": " + answer);
			}
			else if(possible > 1){
				System.out.println("Case #" + casenumber + ": " + "Bad magician!" );
			}
			else if(possible == 0){
				System.out.println("Case #" + casenumber + ": " + "Volunteer cheated!" );
			}

			possible = 0;
		}//end testcases loop


	}

}
