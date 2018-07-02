package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1305;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClicker {

	public static double f;
	public static double c;
	public static double x;

	public static void main(String[] args) {
		System.out.println();
		Scanner input=new Scanner(System.in);
		int trials=input.nextInt();
		for(int trial=0;trial<trials;trial++){
			c=input.nextDouble();
			f=input.nextDouble();
			x=input.nextDouble();
			double cps=2;
			double a=0;
			double b=0;
			double y=0;
			boolean first=true;
			boolean won=false;
			if(x<=c){
				won=true;
				y=x/cps;
			}
			while(!won){
				double toC=c/cps+a;
				double toX=x/cps+a;
				if(!first){
					if(toX>=b){
						won=true;
						y=b;
						break;
					}
				}else{
					first=false;
				}
				cps+=f;
				b=toX;
				a=toC;
			}
			DecimalFormat format=new DecimalFormat("0.0000000");
			System.out.println("Case #"+(trial+1)+": "+format.format(y));
		}
		input.close();
	}

}
