package methodEmbedding.Standing_Ovation.S.LYD1190;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			
			String[] data = br.readLine().split(" ");
			
			char[] nums = data[1].toCharArray();
			
			int suma = 0;
			int r = 0;
			
			for (int j = 0; j < nums.length; j++) {
				if(suma + (int)(nums[j])-48 < j+1){
					r++;
					suma++;
				}
				suma += (int)(nums[j])-48;
			}
			sb.append("Case #"+i+": "+r+"\n");	
		}
		System.out.print(sb);
	}
}
