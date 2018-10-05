package methodEmbedding.Cookie_Clicker_Alpha.S.LYD782;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class cookie_clicker {
	public static void main(String[] args) {

	String line="";
	int totaltestCases=0;
	StringTokenizer tk1;
	double c;
	double f;
	double x;

	try {
		//BufferedReader inputStream = new BufferedReader(new FileReader("A-large.in"));
		BufferedReader inputStream = new BufferedReader(new FileReader("input"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		
		totaltestCases = Integer.parseInt(inputStream.readLine());

		for(int testcases = 0; testcases < totaltestCases; testcases ++){
			line = inputStream.readLine();
			tk1 = new StringTokenizer(line," ");
			c = Double.parseDouble(tk1.nextToken());
			f = Double.parseDouble(tk1.nextToken());
			x = Double.parseDouble(tk1.nextToken());
			
			double cps = 2;
			
			double farmBuildingTime = 0;
			double currentBestTimeToComplete = x/cps + farmBuildingTime;
			boolean best = false;

			while(!best){
				double costOfNewFarmTime = c/cps;
				double newCPS = (cps + f);
				double challenger = x/newCPS + farmBuildingTime + costOfNewFarmTime;

				if(challenger < currentBestTimeToComplete){
					currentBestTimeToComplete = challenger;
					cps = newCPS;
					farmBuildingTime += costOfNewFarmTime;
				}
				else{
					best = true;
				}
			}

			writer.write("Case #" + (testcases+1) + ": " + currentBestTimeToComplete);
			writer.newLine();
			
		}//read new testcases
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}//main
}

