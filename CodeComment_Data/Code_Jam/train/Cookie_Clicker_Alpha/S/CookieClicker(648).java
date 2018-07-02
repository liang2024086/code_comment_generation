package methodEmbedding.Cookie_Clicker_Alpha.S.LYD11;

import java.util.Scanner;


public class CookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=0;j<n;j++) {
			double c = sc.nextDouble(),
				   f = sc.nextDouble(),
				   x = sc.nextDouble();
			if(x<=c) {
				System.out.println("Case #"+(int)(j+1)+": "+String.format( "%.7f", x/2 ));
			}
			else {
				double cook=2,currTime =0,prevTime=x/cook,buildTime=0;
				while(j!=n) {
					buildTime = buildTime + (c/cook);
					cook = cook +f;
					currTime = buildTime + (x/cook);
					if(currTime>prevTime) {
						System.out.println("Case #"+(int)(j+1)+": "+String.format( "%.7f", prevTime ));
						break;
					}
					else {
						prevTime = currTime;
					}
				}
			}
		}
	}

}
