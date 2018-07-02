package methodEmbedding.Cookie_Clicker_Alpha.S.LYD706;

import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double ts=sc.nextDouble();
		int z=1;
		while(ts-->0){	
			double c=sc.nextDouble();
			double f=sc.nextDouble();
			double x=sc.nextDouble();
			
			double time=0.0;
			double cost=x/2.0;
			double t=2.0;
			while(true){
				time+=c/t;
				t+=f;

				cost=Math.min(cost, time+x/t);

				if(cost<x/t+time)
					break;
			}
			System.out.printf("Case #%d: %.7f\n",z++,cost);
		}
	}
}
