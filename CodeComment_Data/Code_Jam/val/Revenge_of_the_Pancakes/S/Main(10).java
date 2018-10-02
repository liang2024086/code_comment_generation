package methodEmbedding.Revenge_of_the_Pancakes.S.LYD142;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
			
			FileInputStream inputStream = null;
			Scanner sc = null;
			inputStream = new FileInputStream("F:\\B-small-attempt0.in");

			FileOutputStream fs = new FileOutputStream(new File("F:\\out.txt"));
	        PrintStream p = new PrintStream(fs);
			Set<Integer> set = new HashSet<Integer>();
			
			sc = new Scanner(inputStream, "UTF-8");
			int t = sc.nextInt();
			for(int j = 1; j <= t; ++j){
				String str = sc.next();
				int[][] dp = new int[str.length()+1][2];
				if(str.charAt(0) == '+'){
					dp[0][0] = 0;
					dp[0][1] = 1;
				}
				if(str.charAt(0) == '-'){
					dp[0][0] = 1;
					dp[0][1] = 0;
				}
				for(int i = 1; i < str.length(); i++){
					if(str.charAt(i) == '+'){
						dp[i][0] =  Math.min(dp[i-1][0], dp[i-1][1]+1);
						dp[i][1] = Math.min(dp[i-1][1]+2, dp[i-1][0]+1);
					}
					if(str.charAt(i) == '-'){
						dp[i][0] =  Math.min(dp[i-1][0]+2, dp[i-1][1]+1);
						dp[i][1] = Math.min(dp[i-1][1], dp[i-1][0]+1);
					}
				}
				p.println(String.format("Case #%d: %d", j, dp[str.length()-1][0]));
			}
			p.close();
	}

}
