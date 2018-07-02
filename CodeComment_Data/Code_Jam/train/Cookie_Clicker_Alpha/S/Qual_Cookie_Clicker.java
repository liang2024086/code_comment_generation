package methodEmbedding.Cookie_Clicker_Alpha.S.LYD16;

import java.util.Scanner;


public class Qual_Cookie_Clicker {


	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		
		for(int testCase = 1; testCase < cases + 1 ; testCase++){
			//setup/getvals

			double cps = 2;
			double farmPrice, farmOutput, winCondition;
			String[] inputs = in.nextLine().split(" ");
			farmPrice = Double.parseDouble(inputs[0]);
			farmOutput = Double.parseDouble(inputs[1]);
			winCondition = Double.parseDouble(inputs[2]);
			
			
			// base case 0 farms
			double currT = winCondition/cps;
			double lastT = 0;;
			int numFarms = 1;
			// while next case is better than previous, update
			do {
				lastT = currT;
				double farmCost = 0;
				for(int i = 0; i < numFarms; i++){
					farmCost += farmPrice/(cps + i*farmOutput);
				}
				currT = farmCost + winCondition/(cps + numFarms*farmOutput);
				numFarms++;
			}while(currT < lastT);
			
			//Output Case #1: 1.0000000 to 7 dp
			System.out.printf("Case #%d: %.7f\n", testCase, lastT);
		}

	}
	
	

}
