package methodEmbedding.Cookie_Clicker_Alpha.S.LYD686;

// x/2
// x/(2+f) + c/2
// x/(2+f+f) + c/(2+f) + c/2
// x/(2+f+f+f) + c/(2+f+f) + c/(2+f) + c/2

import java.util.Scanner;
import java.io.*;

public class cookie{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int cs = 1;
		int n = sc.nextInt();
		
		while(cs<=n){
			
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();

			double b = x/2.0;
			double r = 2.0+f;
			double rr = c/(r-f);
			double a = x/r + rr;
			while(a < b){
				b = a;
				r += f;
				rr += c/(r-f);
				a = x/r + rr;
				//System.out.println(a);
			}

			
			System.out.print("Case #" + cs + ": ");
			System.out.printf("%.7f\n", b);

			cs++;
		}
		
		sc.close();

	}

}
