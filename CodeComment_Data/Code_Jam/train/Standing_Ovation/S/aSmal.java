package methodEmbedding.Standing_Ovation.S.LYD57;


import java.util.Scanner;
import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class Cakeminator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer=0;
		int skoko=0;
		int cnt=0;
		String s="";
		int T=sc.nextInt();
		int nMAX=0;
		String output="";
		
		for(int t=1;t<=T;t++){
			answer=0;
			cnt=0;
			skoko=0;
			nMAX=sc.next().charAt(0)-'0';			
			s=sc.next();
			
			while(cnt<nMAX){
				answer+=(s.charAt(cnt)-'0');
				cnt++;
				if(answer<cnt){
					skoko+=(cnt-answer);
					answer=cnt;
				}
			}
			output+=("Case #"+t+": "+skoko+"\n");
		}
		System.out.print(output);
	}	
}
