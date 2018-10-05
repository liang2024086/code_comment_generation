package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1314;

import java.util.Scanner;

public class question2 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i=1;i<=T;i++){
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double time = 0;
			int factories = 0;
			
			while (true){
				if (X/(2+factories*F)<C/(2+factories*F)+X/(2+(1+factories)*F)){
					time=time+X/(2+factories*F);
					break;
				}
				else{
					time=time+C/(2+factories*F);
					factories++;
				}
			}
			
			System.out.print("Case #");
			System.out.print(i);
			System.out.print(": ");
			System.out.print(time);
			System.out.print("\n");
		}
	}
}
