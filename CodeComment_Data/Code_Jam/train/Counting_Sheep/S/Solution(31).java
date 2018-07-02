package methodEmbedding.Counting_Sheep.S.LYD785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n= Long.parseLong(br.readLine());
		int num[] = new int[10];
		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				num[j]=0;
			}
			long a = Long.parseLong(br.readLine());
			if(a==0) System.out.println("Case #"+(i+1)+": INSOMNIA");
			else{
				int sleep=0;
				long mul=1;
				long gar=a;
				while(sleep!=1){
					long z=gar;
					while(z!=0){
						int t = (int) (z%10);
						if(num[t]==0)num[t]=1;
						z=z/10;
					}
					int c=0;
					for(int k=0;k<10;k++){
						if(num[k]==0)c=1;
					}
					if(c==0)sleep=1;
					gar += a;
					mul++;
				}
				System.out.println("Case #"+(i+1)+": "+(gar-a));
			}
		}
	}
}
