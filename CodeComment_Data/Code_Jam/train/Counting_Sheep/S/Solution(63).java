package methodEmbedding.Counting_Sheep.S.LYD608;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		
		
		String []res=new String[t];
		
		for(int a0=0;a0<t;a0++){
			Set<Integer> set=new HashSet<Integer>();
			int k=in.nextInt();
			int n=k;
			if(n==0){
				res[a0]="Case #"+(a0+1)+": INSOMNIA";
			}
			else
			{
				while(set.size()<10){
					String s=String.valueOf(n);
					for(int b0=0;b0<s.length();b0++){
						set.add((int) s.charAt(b0));
					}
					n=n+k;
				}
				
				res[a0]="Case #"+(a0+1)+": "+String.valueOf(n-k);
				
			}
			
		}
		for(int a0=0;a0<t;a0++){
			System.out.println(res[a0]);
		}
		
	}
}
