package methodEmbedding.Cookie_Clicker_Alpha.S.LYD819;

import java.util.Scanner;


public class Main {
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0;i<T;i++){
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			double time =0;
			double count =0;
			double rate = 2;
			while(count != x){
				if(x/rate > c/rate + x/(rate + f)){
					time = time + c/rate;
					rate = rate + f;
				}else{
					time = time + x/rate;
					count = count + x;
				}
			}
			System.out.printf("Case #%d: %.7f\n",i+1,time);
		}
	}

}
