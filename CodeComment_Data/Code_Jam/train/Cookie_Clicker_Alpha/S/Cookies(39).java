package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1337;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Cookies {
	
	public static final String INPUT_FILE = "/Users/sacastle/Desktop/B-small-attempt0.in";
	public static final String OUTPUT_FILE = "/Users/sacastle/Desktop/output.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner s = new Scanner(new File(INPUT_FILE));) {

			String output = "";
			int t = s.nextInt();
			for (int i=0; i<t; i++){
				double c = s.nextDouble();
				double f = s.nextDouble();
				double x = s.nextDouble();
				//System.out.println(c+" "+f+" "+x+" ");
				double bestTime = Double.MAX_VALUE;
				boolean finished = false;
				int n = 0; //number of farms
				double prevFarmTime = 0;
				while (!finished){
					double newTime = prevFarmTime+(x/(2+n*f));
					//System.out.println(newTime);
					if (newTime < bestTime)
						bestTime = newTime;
					else //results stopped getting better
						finished = true;
					prevFarmTime += c/(2+n*f); //time to get to farm
					n++;
				}
				double y = bestTime;
				System.out.print("Case #"+(i+1)+": "+String.format("%.7f", y)+"\n");
				output += "Case #"+(i+1)+": "+String.format("%.7f", y)+"\n";
			}
			try (PrintWriter out = new PrintWriter(new FileWriter(OUTPUT_FILE))){
				out.print(output.trim());
				out.close();
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
			s.close();
			}
			catch (FileNotFoundException e) {
				System.err.format("FileNotFoundException: %s%n", e);
			}
		}
	

}
