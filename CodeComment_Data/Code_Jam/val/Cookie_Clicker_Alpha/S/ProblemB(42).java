package methodEmbedding.Cookie_Clicker_Alpha.S.LYD65;

// Cookie Clicker Alpha
import java.util.Scanner;
import java.io.*;

public class ProblemB {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inB.txt"));
		PrintWriter pr = new PrintWriter("outB.txt");
		
		int T = sc.nextInt();
		
		for (int t=1; t<=T; t++) {
			double out = 0.0;
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double rate = 2;
			double tWait = 0;
			double tFarm = 0;
			double tWaitAfter = 0;
			
			while (true) {
				tWait = (X)/rate;
				tFarm = (C)/rate;
				tWaitAfter = X/(rate+F);
				//System.out.print("rate is " + rate + ", time for move is " );
				if (tWait <= tFarm + tWaitAfter) {
					//System.out.println(tWait);
					out += tWait;
					break;
				} else {
					//System.out.println(tFarm);
					out += tFarm;
					rate += F;
				}
			}
			System.out.println("Case #" + t + ": " + out);
			pr.println("Case #" + t + ": " + out);
		}
		
		sc.close();
		pr.close();
	}
}
