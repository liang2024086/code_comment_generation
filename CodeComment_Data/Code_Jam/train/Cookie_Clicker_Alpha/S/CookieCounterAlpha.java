package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1219;

import java.nio.file.*;
import java.nio.charset.*;
import java.util.ArrayList;
public class CookieCounterAlpha{
	public static void main(String[] args){
		Path path = FileSystems.getDefault().getPath("input.txt");
		ArrayList<String> strings = new ArrayList<String>();
		try{
			strings = (ArrayList<String>)Files.readAllLines(path,Charset.forName("US-ASCII"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		int numOfItems = Integer.parseInt(strings.get(0));
		double inc = 0;
		double end = 0;
		double farm = 0;
		strings.remove(0);
		int round = 1;
		for(String s: strings){
			String[] roundInfo = s.split(" ");
			double rate = 2.0;
			farm = Double.parseDouble(roundInfo[0]);
			inc = Double.parseDouble(roundInfo[1]);
			end = Double.parseDouble(roundInfo[2]);
			double totalTime = 0;
			//if current rate will get you slower than new farm and ending at new rate
			while(end/rate > (farm/rate + end/(rate+inc))){
				totalTime+= farm/rate;
				rate += inc;
			}
			totalTime += end/rate;
			totalTime = (double)Math.round(totalTime * 10000000) / 10000000;
			System.out.println("Case #" + round + ": " + totalTime);
			round++;
		}
	}
}
