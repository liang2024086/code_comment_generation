package methodEmbedding.Cookie_Clicker_Alpha.S.LYD640;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyOfasdf {
	
	static int x=0;
	static String y;

	static double C; //farmcost
	static double F; //farmcookies
	static double X; //end
			
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt2.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output"));
		
		br.readLine();
		String line;
		while((line = br.readLine())!=null){
			String[] figures = line.split(" ");
			C = Float.parseFloat(figures[0]);
			F = Float.parseFloat(figures[1]);
			X = Float.parseFloat(figures[2]);
			
			double curCookies=0;
			double cookieRate = 2;
			double curTime=0;
			while(curCookies<X){
				double timeToNextFarm = C/cookieRate;
				double currentFinishTime = (X-curCookies)/cookieRate;
				double farmFinishTime = timeToNextFarm + (X - curCookies)/(cookieRate+F);
				if (currentFinishTime < farmFinishTime){
					curTime+=currentFinishTime;break;
				}
				else{
					curTime+=timeToNextFarm;
					cookieRate += F;
				}
			}
			y = String.format("%.7f", curTime);
			x++;
			String statement = ("Case #"+x+": "+y + "\r\n");
			System.out.print(statement);
			bw.write(statement);
			bw.flush();
		}
		br.close();
		bw.close();

		
	}
}
