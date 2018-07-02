package methodEmbedding.Cookie_Clicker_Alpha.S.LYD623;


import java.util.Scanner;

public class QualificationB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int casen = 1; casen <= T; casen++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double Nd = X/C - 2/F;
			int n = (int) Nd;
			if (Nd == n)
				n = n - 1;
			double time = 0;
			double A = 2;
			for (int i = 0; i < n; i++) {
				time += C / A;
				A += F;
			}
			time += X / A;
			System.out.println("Case #" + casen + ": " + time);
		}
	}

}
/*
4
30.0 1.0 2.0
30.0 2.0 100.0
30.50000 3.14159 1999.19990
500.0 4.0 2000.0
*/
