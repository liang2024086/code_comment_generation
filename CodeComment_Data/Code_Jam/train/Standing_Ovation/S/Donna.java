package methodEmbedding.Standing_Ovation.S.LYD1904;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Donna {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int smax = sc.nextInt();
			String s;
			
			s=sc.nextLine();
			//System.out.println(s);
			int[] sum = new int[s.length()-1];
			sum[0]=(int)(s.charAt(1))-48;
			//System.out.println("char+"+s.charAt(0));
			for(int i=1;i<=sum.length-1;i++){
				sum[i] = sum[i-1] + (int)(s.charAt(i+1)-(int)'0');
				//System.out.println((int)(s.charAt(i)-(int)'0'));
				//System.out.println(sum[i]);
			}
			
			int nreq = 0;
			if(sum[0]==0){
				nreq++;
			}
			for(int i=1;i<=sum.length;i++){
				if(sum[i-1]+nreq<i){
					nreq += i-(sum[i-1]+nreq);
				}
			}
			System.out.println("Case #"+t+": "+nreq);
		}
	}
}
