package methodEmbedding.Cookie_Clicker_Alpha.S.LYD272;

import java.io.*;
import java.util.*;

public class cookie {

	public static void main(String[] args) throws IOException {
		
		Scanner in=new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("cookie.out")));
		int sets=in.nextInt(), s;
		double cost, gain, win, rate, amount, time;
		
		for(s=1; s<=sets; s++){
			cost=in.nextDouble();
			gain=in.nextDouble();
			win=in.nextDouble();
			amount=0;
			time=0;
			rate=2;
			
			while(amount<win){
				if(win/rate>cost/rate+win/(rate+gain)){
					time+=cost/rate;
					rate+=gain;
				}
				else{
					time+=win/rate;
					amount+=win;
				}
			}
			
			out.printf("Case #"+s+": %.7f\n", time);
		}
		
		in.close();
		out.close();
		
	}
}
