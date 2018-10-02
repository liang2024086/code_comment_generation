package methodEmbedding.Standing_Ovation.S.LYD1231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem1{
	public static void main(String[] args) throws Exception{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		int t = Integer.parseInt(buf.readLine());
		for(int i=0;i<t;i++){
			String input = buf.readLine();
			token = new StringTokenizer(input," ");
			int size = Integer.parseInt(token.nextToken())+1;
			char tempArray[] = token.nextToken().toCharArray();
			int realArray[] = new int[size];
			int sum=0;
			int ans=0;
			for(int j=0;j<size;j++){
				if(j==0)
				sum=0;
				else
				sum+=Integer.parseInt(tempArray[j-1]+"");
				
				
				if(j>sum){
					int diff=j-sum;
					sum+=diff;
					ans+=diff;
				}
				realArray[j]=sum;
			}
			
			System.out.println("Case #"+(int)(i+1)+": "+ans);
		}
	}
}
