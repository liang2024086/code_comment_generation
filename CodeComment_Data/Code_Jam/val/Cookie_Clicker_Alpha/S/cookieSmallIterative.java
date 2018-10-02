package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1148;


import java.io.IOException;
import java.util.Scanner;

public class cookieSmallIterative {
	public static void main(String [] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		int numCases = in.nextInt();
		for(int nc = 1; nc <= numCases; nc++){
			double curRate = 2.0;
			double needCookies = in.nextDouble();
			double increaseCookies = in.nextDouble();
			double targetCookies = in.nextDouble();
			
			double totalCookies = 0.0;
			
			double minTime = targetCookies / curRate;
			
			//can't even upgrade before hitting our target
			if(needCookies > targetCookies) System.out.printf("Case #%d: %7f\n", nc, minTime);
			else{
				totalCookies = needCookies;
				
				int inc = 1;
				for(; totalCookies < targetCookies; inc++, totalCookies = needCookies * (double) inc){
					double timeEnd = (targetCookies - totalCookies) / curRate;
					double timeHere = minTime - timeEnd;
					
					double tmpRate = curRate + increaseCookies;
					double tmpTime = (targetCookies - (totalCookies - needCookies)) / tmpRate;
					
					if(tmpTime < timeEnd){
						curRate = tmpRate;
						minTime = timeHere + tmpTime;
						inc--;
					}
					
					//no point in continuing if even the next time isn't as good
					double timeNext = needCookies / curRate;
					if(minTime < timeNext) break;
				}
				
				System.out.printf("Case #%d: %.7f\n", nc, minTime);
			}			
		}
	}
}


/*

1
500.0 4.0 2000.0

4
30.0 1.0 2.0
30.0 2.0 100.0
30.50000 3.14159 1999.19990
500.0 4.0 2000.0


*/
