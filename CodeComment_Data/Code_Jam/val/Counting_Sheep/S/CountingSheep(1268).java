package methodEmbedding.Counting_Sheep.S.LYD1461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CountingSheep {
	public static void main(String args[]) throws IOException
	{
		long t = System.currentTimeMillis();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int ii=1; ii<=T; ii++)
		{		
			int N = Integer.parseInt(br.readLine());
			if(N == 0) {
				System.out.println("Case #" + ii + ": INSOMNIA");
			}else {
				long S = N;
				boolean[] arr = new boolean[10];
				for(int i=0; i< 1000; i++) {
					long c = S;
					while(c > 0) {
						arr[(int) (c % 10)] = true;
						c /= 10;
					}
					
					boolean found = true;
					for(int j=0;j<10;j++){
						if(!arr[j]) found = false;
					}
					if(found) break;
					S += N;
				}
				if(S >= 1000 * N) {
					System.out.println("Case #" + ii + ": INSOMNIA");
				} else {
					System.out.println("Case #" + ii + ": " + S);
				}
			}
		}
		System.out.println(System.currentTimeMillis()-t);
	}
}
