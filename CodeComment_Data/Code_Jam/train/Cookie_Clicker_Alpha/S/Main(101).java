package methodEmbedding.Cookie_Clicker_Alpha.S.LYD57;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String inFile = "B-small-attempt0.in";
		String outFile = inFile.replace("in", "out");
		Scanner input = new Scanner(new File(inFile));
		PrintWriter writer = new PrintWriter(new File(outFile));
		int cases = input.nextInt();
		
		for(int i=1; i<=cases; i++){
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double cps = 2.0;
			double time = 0.0;
			double tofarm = c/cps;
			double tofinish = x/cps;
			
			while(tofinish>(tofarm + x/(cps+f))){
				cps = cps + f;
				time = time + tofarm;
				tofarm = c/cps;
				tofinish = x/cps;
			}
			time = time + tofinish;
			writer.println("Case #" + i + ": " + time);
		}
		
		input.close();
		writer.close();
	}

}
