package methodEmbedding.Standing_Ovation.S.LYD1274;

import java.io.*;


public class CodeJam {
	public static void main(String ar[]) throws Exception {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(buff.readLine());
		for(int i = 0; i < N; i++) {
			String str[] = buff.readLine().split(" ");
			int max = Integer.parseInt(str[0]);
			String data = str[1];
			int sum = 0;
			int additional = 0;
			int target;	
			
			for(int j = 0; j <= max; j++) {
				target = Integer.parseInt(data.charAt(j) + "");
				if(target > 0) {
					if(sum < j) {
						//add
						int temp = j - sum;
						sum = sum + temp + target;
						additional = additional + temp;
					} else {
						sum = sum + target;
					}
				}
			}
			System.out.println("Case #" + (i+1) + ": " + additional);
		}
	}
}
