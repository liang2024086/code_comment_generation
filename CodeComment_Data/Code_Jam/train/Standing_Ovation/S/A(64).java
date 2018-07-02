package methodEmbedding.Standing_Ovation.S.LYD2186;

import java.util.*;

public class A{
	public static void main(String[] args){
	 	Scanner input = new Scanner(System.in);
	 	int T = input.nextInt();

	 	for(int t=0; t<T; t++){
	 		int maxShy = input.nextInt();
	 		String shyLevels = input.next();
	 		int res = 0;
	 		int noOfStand = 0;
	 		int[] levels = new int[maxShy + 1];
	 		for (int i=0; i < maxShy+1; i++){
	 			levels[i] = Integer.parseInt(String.valueOf(shyLevels.charAt(i)));
	 		}
	 		noOfStand = levels[0];
	 		for(int i=1; i<maxShy+1; i++){
	 			if(noOfStand < i){
	 				res += (i - noOfStand);
	 				noOfStand += (i - noOfStand); 
	 			}
	 			noOfStand += levels[i];
	 		}
	 		System.out.println("Case #"+(t+1)+": "+res);
	 	}
	}
}
