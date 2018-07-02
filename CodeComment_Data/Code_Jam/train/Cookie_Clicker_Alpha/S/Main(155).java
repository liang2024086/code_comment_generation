package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1059;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main Class
 * Solves all Google Code Jam Tasks.
 * @author Jones
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// read input file and prepare buffered writer
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		BufferedWriter wr = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
		
		// get the number of test cases
		int noCases = sc.nextInt();

		for(int i=0; i<noCases; i++) {
			// input
			double C = Double.parseDouble(sc.next());
			double F = Double.parseDouble(sc.next());
			double X = Double.parseDouble(sc.next());
			
			// helper
			double G = 2; // gain per second
			
			// result
			double rsec = 0;
			
			boolean contFarmBuying = true;
			while(contFarmBuying){
				// calculation
				double nR = C / G;
				double wR = X / G;
				// simulate next round
				double simNR = C / (G + F);
				double simWR = X / (G + F);
				
				// go wait decision
				double go = rsec + simWR + nR;
				double wait = rsec + wR;
				
				if(go > wait){
					contFarmBuying = false;
					rsec += wR;
				}else{
					rsec += nR;
					G += F;
				}
			};
			
			double result = (Math.round(rsec * 10000000.0))/10000000.0;
			//System.out.println("rsec: " + rsec);
			//System.out.println("Case #" + (i+1) + ": " + result);
			wr.write("Case #" + (i+1) + ": " + result);
			wr.newLine();
		}
		wr.close();
	}

}
