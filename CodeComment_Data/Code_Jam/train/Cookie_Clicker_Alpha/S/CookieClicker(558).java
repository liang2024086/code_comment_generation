package methodEmbedding.Cookie_Clicker_Alpha.S.LYD226;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieClicker {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		String line = reader.readLine();
		
		int noOfCases = Integer.parseInt(line);
		for(int i=1;i<=noOfCases;i++){
			line = reader.readLine();
			
			String[] values = line.split(" ");
			double C = Double.parseDouble(values[0]);
			double F = Double.parseDouble(values[1]);
			double X = Double.parseDouble(values[2]);
			
			double timeWithoutFarms =X/2;
			double smallestTime =timeWithoutFarms;
			int noOfFarms=1;
			while(true){
				
				double iterationTime = C/2;
				for(int n=1;n<noOfFarms;n++){
					iterationTime+= C/(F*n+2);
				}
				iterationTime+= X/(noOfFarms*F+2);
				noOfFarms++;
				if(iterationTime< smallestTime){
					smallestTime = iterationTime;
				}
				if(iterationTime>timeWithoutFarms || iterationTime>smallestTime){
					break;
				}
			}
			writer.format("Case #%d: %.7f\n", i, smallestTime);
		}
		reader.close();
		writer.close();
	}
}
