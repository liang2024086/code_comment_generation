package methodEmbedding.Cookie_Clicker_Alpha.S.LYD645;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++){
			double cookies = 2;
			double ans = 0;
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			while(true){
				double a1 = X/cookies;
				double a2 = C/cookies + X/(cookies+F);
				if(a1>a2){
					ans+=C/cookies;
					cookies+=F;
				}else{
					ans+=a1;
					break;
				}
			}
			System.out.printf("Case #%d: %.7f\n", i, ans);
		}
		sc.close();
	}
}
