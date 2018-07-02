package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1077;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CookieClickerAlpha {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int caso=1;
		String line[];
		while(n-->0){
			double cookies=2.0,time=0;
			line=in.readLine().split(" ");
			double c=Double.parseDouble(line[0]),f=Double.parseDouble(line[1]),x=Double.parseDouble(line[2]);
			double min=x/cookies,timeacum=0;
			while(true){
				timeacum+=c/cookies;
				cookies+=f;
				time=timeacum+(x/cookies);
				if(time<min)
					min=time;
				else
					break;
			}
			System.out.format("Case #%d: %.7f%n",caso, min); 
			caso++;
		}
	}
}
