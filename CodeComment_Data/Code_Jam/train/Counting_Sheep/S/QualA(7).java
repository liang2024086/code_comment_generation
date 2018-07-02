package methodEmbedding.Counting_Sheep.S.LYD1374;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QualA {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int c = 1; c<= T; c++) {
			int i = Integer.parseInt(in.readLine());
		//for(int i=0;i<10000;i++){
			if(i==0){
				System.out.println("Case #"+c+": INSOMNIA");
				continue;
			}
			boolean[] seen = new boolean[10];
			int nums = 0;
			int j;
			for(j=i;;j+=i){
				int t = j;
				while(t>0){
					if(!seen[t%10]){
						seen[t%10]=true;
						nums++;
					}
					t/=10;
				}
				if(nums==10)
					break;
			}
			System.out.println("Case #"+c+": "+(j));
		}
	}
}
