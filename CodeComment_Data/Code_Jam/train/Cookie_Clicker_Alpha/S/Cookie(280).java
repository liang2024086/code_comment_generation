package methodEmbedding.Cookie_Clicker_Alpha.S.LYD950;


import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate=2,current,total,time=0,F ;
		Scanner s = new Scanner(System.in);
		int t;
		t = s.nextInt();
		int i;
		for(i=0;i<t;i++){
			current = s.nextDouble();
			F = s.nextDouble();
			total = s.nextDouble();
			while(total/rate>(current/rate)+(total/(rate+F))){
				time = time + current/rate;
				rate = rate+F;
			}
			time = time +total/rate;
			int p=i+1;
			System.out.println("Case #"+p+": "+time);
			rate = 2;
			time = 0;
		}
		

	}

}
