package methodEmbedding.Cookie_Clicker_Alpha.S.LYD175;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;


public class Cookie {

	public static void main(String[] args) throws IOException {
		double C; // cost of farm
		double F; // cookies/farm/sec
		double X; // goal of cookies in the bank
		
		double speed; //cookies/sec (add F per bought farm)
		
		double timeToC;
		double timeToX;
		double prevTimeToX;
		
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		Writer fw = new FileWriter("Boutput.txt");
		
		int cases = sc.nextInt();
		
		for(int caseNum = 1; caseNum<=cases;caseNum++){
			speed = 2;
			C = Double.parseDouble(sc.next());
			F = Double.parseDouble(sc.next());
			X = Double.parseDouble(sc.next());
			
			prevTimeToX = X/speed;
			timeToC = C/speed;
			speed += F;
			timeToX = timeToC+X/speed;
			timeToC += C/speed;
			
			while(prevTimeToX>timeToX){
				prevTimeToX = timeToX;
				speed+=F;
				timeToX = timeToC+X/speed;
				timeToC += C/speed;
			}
			
			fw.append(String.format(Locale.US,"Case #%d: %.7f",caseNum,prevTimeToX)+System.getProperty("line.separator"));
			
		}
		
		fw.close();
		sc.close();

	}

}
