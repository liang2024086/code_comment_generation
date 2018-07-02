package methodEmbedding.Cookie_Clicker_Alpha.S.LYD380;

import java.util.Scanner;

public class Main {
	public static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// test cases

		for (int t = 0; t < T; t++) {
			// String S = sc.next();// number of hints
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double s=0;
			double time=X/2;
			int n=1;
			double p1=0;
			while(true){
				p1+=(1/(2+((n-1)*F)));
				s=C*p1+(X/(2+n*F));
				
				if(s>time)
					break;
				else
					time=s;
				
				n++;
					
			}
			System.out.println("Case #"+(t+1)+": "+time);
		}

	}
	


	
}
