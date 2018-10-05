package methodEmbedding.Cookie_Clicker_Alpha.S.LYD161;

import java.util.Scanner;


public class ProblemB {

	public static void main(String[] args) {
		int T;
		Scanner reader = new Scanner(System.in);
		T = reader.nextInt();
		
		for (int i = 0; i < T; i++) {
			double C = reader.nextDouble();
			double F = reader.nextDouble();
			double X = reader.nextDouble();
			
			
			double totalTime = X/2;
			double facTime = 0;
			int currFac = 0;
			
			while(true){
				currFac++;
				double nFacTime = facTime + C/(2 + (currFac-1) * F);
				double nTotalTime = nFacTime + (X / (2 + currFac * F));
				
				if(nTotalTime > totalTime)
					break;
				facTime = nFacTime;
				totalTime = nTotalTime;
			}
			
			
			System.out.print("Case #"+(i + 1)+": ");
			System.out.printf("%.7f", totalTime);
			System.out.println("");
			
		}
	}
}
