package methodEmbedding.Standing_Ovation.S.LYD1641;

import java.io.*;
import java.util.*;
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out,true); 
	
	public static void main(String[] args)throws IOException{
		int T=Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++){
			String input[]=br.readLine().split(" ");
			int sMax=Integer.parseInt(input[0]);
			int nOAudience[]=new int[sMax+1];
			int allAudience=Integer.parseInt(input[1]);
			for(int j=sMax,index=0;j>=0;j--,index++){
				int divideBy=(int)Math.pow(10, j);
				nOAudience[index]=allAudience/divideBy;
				allAudience%=divideBy;
			}
			//System.out.println(Arrays.toString(nOAudience));
			int reqAudience=0,standingCurrently=0,sLevel=0;
			for(int k=0;k<=sMax;k++){
				if(standingCurrently>=k){
					standingCurrently+=nOAudience[k];
				}
				else{
					reqAudience++;
					standingCurrently+=nOAudience[k]+1;
				}
			}
			out.println("Case #"+i+": "+reqAudience);
		}
		
		out.close();			
	}
	
}
