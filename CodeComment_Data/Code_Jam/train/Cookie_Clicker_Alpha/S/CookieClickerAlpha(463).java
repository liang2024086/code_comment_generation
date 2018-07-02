package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1553;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CookieClickerAlpha {
	
	static BufferedReader in;
	static BufferedWriter out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("B-small-attempt1.in"));
		out = new BufferedWriter(new FileWriter("out.txt"));
		String line= in.readLine();
		int T = Integer.parseInt(line);
		
		for(int t=0; t<T; t++){
			line = in.readLine();
			
			String splitter[] = line.split(" ");
			
			double C, F, X; //C = coste, F = cokies extra x segundo, x = para ganar
			C=Float.parseFloat(splitter[0]);
			F=Float.parseFloat(splitter[1]);
			X=Float.parseFloat(splitter[2]);
			
			//boolean empiezaABajar = false;
			
			double cookies = 0, cookiesXsec = 2, time = 0, tiempoRecord = Integer.MAX_VALUE;
			for(int topeGranjas=0; topeGranjas < X && time <= tiempoRecord; topeGranjas++){
				cookies = 0;
				int granjas = 0;
				cookiesXsec = 2;
				time = 0;
				while(cookies < X){
					cookies+=cookiesXsec;
					time++;
					if(	granjas < topeGranjas && cookies+cookiesXsec >= C){
						//double totalCookies = cookies+cookiesXsec;
						//double restCookies = totalCookies - C;
						time += (C- cookies) / cookiesXsec;
						//cookies += cookiesXsec;
						cookies = 0;
						//cookies -= C;
						cookiesXsec += F;
						granjas++;
						
					}
				}
				//double x = X-cookies;
				//time += x / (cookiesXsec);
				
				cookies -= X;
				if(cookies > 0){
					double lastLessThanASecondCookies = cookiesXsec - cookies; //cookies hechas en el ultimo segundo
					time -=1;
					time += lastLessThanASecondCookies / (cookiesXsec);
				}
				//	time -= (cookies-cookiesXsec)/cookiesXsec;
				if (time < tiempoRecord)
					tiempoRecord = time;
				//else empiezaABajar = true;
				
			}
			
			out.write("Case #"+(t+1)+": "+tiempoRecord+"\n");
			
			
		}
		in.close();out.close();
	}

}
