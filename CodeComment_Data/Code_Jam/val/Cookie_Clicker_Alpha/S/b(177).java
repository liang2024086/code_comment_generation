package methodEmbedding.Cookie_Clicker_Alpha.S.LYD296;

import java.util.*;

public class b {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		for(int k = 0; k<K;k++){
			System.out.print("Case #"+(k+1)+": ");
			double persec = 2.0;
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();

			double ttime = 0.0;
			while(true){
				//time to get next farm
				double ftime = c / persec;
				double f2time = ftime + (x  / (persec + f));
				//time to get x
				double xtime = x / persec;
				if(f2time < xtime){
					persec += f;
					ttime += ftime;
				} else {
					ttime += xtime;
					break;
				}
			}
			System.out.println(ttime);
		}

	}
}
