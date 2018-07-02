package methodEmbedding.Revenge_of_the_Pancakes.S.LYD646;

import java.util.Scanner;

public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0; i< t; i++){	
				String in = input.next();
				int len = in.length();
				int[] dp = new int[len+1];
				dp[0] = 0;
			if(in.substring(0, 1).equals("+")){
				dp[1] = 0;
			}else{
				dp[1] = 1;
			}
			
			for(int j = 2; j <= len; j++){
				if(in.substring(j-1, j).equals("+")){
					dp[j] = dp[j-1];
				}
				if(in.substring(j-1, j).equals("-")){
					if(in.substring(j-2, j-1).equals("-")){
						dp[j] = dp[j-1];
					}
					if(in.substring(j-2, j-1).equals("+")){
						dp[j] = dp[j-1] + 2;
					}
				}
			}
			int k = i+1;
			System.out.println("Case #"+k+": "+dp[len]);
		}	
	}
}
