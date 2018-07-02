package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1392;

import java.util.Scanner;


public class Cookie {

	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		
		for(int testcase = 0; testcase < testCases; testcase++){
			
			//for every farm iteration
			int numFarmsToBuy = 0;
			int theAnswer = 0;
			double c = s.nextDouble();
			double f = s.nextDouble();
			double x = s.nextDouble();
			double numOfCookies = 0;
			double rate = 2.0;
			double timeTakes = 0.0;
			double prevTime = -1.0;
			while(true){
				int numFarmsLeftToBuy = numFarmsToBuy;
				
				while(numFarmsLeftToBuy > 0){
//					if(numOfCookies >= c){
//						numOfCookies -= c;
//						numFarmsLeftToBuy--;
//						rate += f;
//					}
//					numOfCookies += rate;
					
					timeTakes += c/rate;
					//System.err.println(c/rate);
					//System.err.println(timeTakes);
					
					rate += f;
					
					numFarmsLeftToBuy--;
				}
				
				timeTakes += x/rate;
				//System.err.println(timeTakes);
				
				if(prevTime != -1 && prevTime < timeTakes){
					break;
				}
				prevTime = timeTakes;
				timeTakes = 0;
				rate = 2;
				//BRAPBRAP JOSH IS THE BEST
				numFarmsToBuy++;
			}
			System.out.print("Case #" + (testcase+1) + ": ");
			System.out.printf("%.7f\n", prevTime);			
		}
	}

}
