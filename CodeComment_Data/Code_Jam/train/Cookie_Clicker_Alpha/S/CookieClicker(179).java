package methodEmbedding.Cookie_Clicker_Alpha.S.LYD643;


import java.util.Scanner;

public class CookieClicker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		double c,f,x,timetaken,rate;
		boolean flag = true;

		for(int i=1;i<=T;i++){
			c= in.nextDouble();
			f= in.nextDouble();
			x= in.nextDouble();
			timetaken=0;
			rate=0;
			flag = true;
			while(flag)
			{
				if((timetaken+(x)/(2+rate))<((c/(2+rate)+timetaken+(x)/(2+rate+f))))
				{
					flag = false;
					continue;
				}
				timetaken = timetaken + c/(2+rate);
				rate = rate+f;	
			}
			timetaken=timetaken+(x)/(2+rate);
			System.out.println("Case #"+i+": "+timetaken);
		}
		in.close();
	}
}
