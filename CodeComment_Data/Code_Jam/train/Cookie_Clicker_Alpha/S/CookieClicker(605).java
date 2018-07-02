package methodEmbedding.Cookie_Clicker_Alpha.S.LYD493;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CookieClicker {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scn=new Scanner(new File("B-small-attempt0.in"));
		int t=Integer.parseInt(scn.nextLine());
		double c, f, x, rate;
		String[] temp;
		double time;
		double cookies;
		boolean enoughCookies;
		for (int numCases=0; numCases<t; numCases++){
			rate=2;
			time=0;
			cookies=0;
			enoughCookies=false;
			temp=scn.nextLine().split("[ ]+");
			c=Double.parseDouble(temp[0]);
			f=Double.parseDouble(temp[1]);
			x=Double.parseDouble(temp[2]);
			while (!enoughCookies){
				if (cookies+c<x){
					time+=c/rate;
					cookies+=c;
					if ((x-cookies)/rate>(x/(rate+f))){
						cookies=0;
						rate+=f;
					}
				}
				else{
					time+=(x-cookies)/rate;
					cookies=x;
					enoughCookies=true;
				}
			}
			System.out.println("Case #"+(numCases+1)+": "+time);
		}
	}

}
