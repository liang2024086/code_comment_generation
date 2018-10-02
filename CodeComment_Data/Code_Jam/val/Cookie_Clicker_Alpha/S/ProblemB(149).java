package methodEmbedding.Cookie_Clicker_Alpha.S.LYD440;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class ProblemB {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
		FileWriter writer = new FileWriter("B-small-attempt0.out");
		DecimalFormat df = new DecimalFormat("#.0000000");
		
		int numberOfCases = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < numberOfCases; i++) {
			String line = reader.readLine();
			String[] split = line.split(" ");
			
			double secs = 0;
			double cps = 2; // cookies per second
			double c = Double.parseDouble(split[0]);
			double f = Double.parseDouble(split[1]);
			double x = Double.parseDouble(split[2]);
			
			while(true) {
				double cal1 = c / cps + c / f;
				double cal2 = x / cps;
				
				if(cal1 < cal2) {
					// buy 
					secs += c / cps;
					cps += f;
				} else {
					// dont buy
					secs += cal2; 
					break;
				}
			}
			writer.write("Case #" + (i+1) + ": " + df.format(secs) + "\n");
		}
		writer.close();
	}
}
