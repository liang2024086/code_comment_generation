package methodEmbedding.Standing_Ovation.S.LYD562;

import java.io.*;


public class Main{


	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tCount = Integer.parseInt(in.readLine());
		for (int t = 0; t < tCount; ++t){
			String line = in.readLine();
			int sMax = line.charAt(0) - '0';
			
			int sum = 0;
			int needed = 0;
			for (int i = 0; i <= sMax; ++i){
				int s = line.charAt(2+i) - '0';
				if (s == 0)
					continue;
				if (sum < i){
					needed += i - sum;
					sum = i;
				}
				
				sum += s;
			}
			
			System.out.printf("Case #%d: %d\n", (t+1), needed);
		}
		
		
	}

}
