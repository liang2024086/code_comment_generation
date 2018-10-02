package methodEmbedding.Standing_Ovation.S.LYD903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2015QA {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		long T = Long.parseLong(br.readLine());

		for(int i=0;i<T;i++){
			String str = br.readLine();
			String arr[] = str.split(" ");
			long maxS = Long.parseLong(arr[0]);
			str = arr[1];
			
			long sum = 0;
			long qSum = 0;
			long eSum = 0;
			long tmp = 0;
			for(long l = 0;l<=maxS;l++){
				tmp = (long) str.charAt((int)l) - '0';
				qSum += tmp;
				eSum = (l+1);
				if(eSum > qSum){
					sum += eSum - qSum;
					qSum += eSum - qSum;
				}
				
			}
			
			
			System.out.println("Case #" + (i + 1) +": "+sum);
		}
		br.close();
	}
}
