package methodEmbedding.Cookie_Clicker_Alpha.S.LYD418;

import java.util.Scanner;


public class SecProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tt= (int)sc.nextDouble();
		int cou=1;
		while(tt-- > 0){	
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			double time = 0;
			double need = x/2;
			double t = 2;
			while(true){
				time += c/t;
				t += f;
				double d = time+ x/t;
				if(need > d){
					need = time + x/t;
				}
				if(need < time + x/t)
					break;
				
			}
			System.out.printf("Case #%d: %.7f\n", cou++, need);
		}
	}
}
