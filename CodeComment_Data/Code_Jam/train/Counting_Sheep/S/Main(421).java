package methodEmbedding.Counting_Sheep.S.LYD1397;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){


		Scanner input=new Scanner(System.in);

		int T=input.nextInt();
		long N;
		boolean sleep;
		for(int t=1;t<=T;t++){
			N=input.nextInt();
			long n=N;
			sleep=false;
			boolean[] digits=new boolean[10];
			System.out.printf("Case #%d: ",t);
			if(n==0)
				System.out.println("INSOMNIA");
			else{
				while(!sleep){
					String s=n+"";
					for(int i=0;i<s.length();i++)
						digits[s.charAt(i)-'0']=true;

					n+=N;
					sleep=true;
					for(int i=0;i<10 && sleep;i++)
						sleep=digits[i];
				}

				System.out.println(n-N);
			}


		}

	}
}
