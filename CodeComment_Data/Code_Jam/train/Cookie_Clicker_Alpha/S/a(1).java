package methodEmbedding.Cookie_Clicker_Alpha.S.LYD486;

import java.util.Scanner;

public class Scalar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			double c, v, x, i;
			i = 2.0000000f;
			c = sc.nextDouble();
			v = sc.nextDouble();
			x = sc.nextDouble();
			double totaltime = 0;
			while(true){
				double extratime = c/i;
				if ((x/i) > (extratime + x/(i+v))){
					i+=v;
					totaltime+=extratime;
				}
				else {
					totaltime += x/i;
					System.out.println("Case #"+(a+1)+" "+totaltime);
					break;
				}
			}
		}
	}

}
