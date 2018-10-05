package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1293;


import java.lang.String;
import java.util.Scanner;


public class ProblemBB {
	static double C;
	static double F;
	static double X;
	static int farms=-1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		
		for (int i = 1; i < T+1; i++){
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();
			
			double currentTime;
			double nextTime;
			double timeToNext = 0;
			double rate = 2.0;
			
			
			do{
				
				currentTime = timeToNext+X/rate;
				timeToNext += C/rate;
				rate += F;
				nextTime = timeToNext + X/rate;
				
			}while(nextTime < currentTime);
			
			
			System.out.println("Case #"+ i+ ": " + String.format("%.7f", currentTime));
			
		}
	}

}
