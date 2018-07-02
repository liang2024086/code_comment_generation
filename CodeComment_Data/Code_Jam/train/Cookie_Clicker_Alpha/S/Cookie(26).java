package methodEmbedding.Cookie_Clicker_Alpha.S.LYD741;

import java.util.Scanner;


public class Cookie {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t;
		double c,f,x,cookierate,time,currenttime,futuretime;
		t=in.nextInt();
		for(int i=1;i<=t;i++){
			cookierate=2.0;
			time=0.0;
			c=in.nextFloat();
			f=in.nextFloat();
			x=in.nextFloat();
			while(true){
				currenttime=(time+(x/cookierate));
				futuretime=(time+(c/cookierate)+(x/(cookierate+f)));
				if(currenttime<futuretime){
					System.out.printf("Case #%d: %.7f \n",i,currenttime);
					break;
				}else{
					time+=(c/cookierate);
					cookierate+=f;
				}	
			}
			
			
		}
	}
	
}
