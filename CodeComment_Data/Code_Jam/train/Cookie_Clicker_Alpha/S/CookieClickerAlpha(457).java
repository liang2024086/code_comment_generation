package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1234;


import java.util.*;
import java.io.*;

public class CookieClickerAlpha {
	private static Scanner reader = new Scanner(System.in);
	private static String inputFolder;

	public static void main(String[] args) throws Exception {
		inputFolder = reader.nextLine();
		
		BufferedReader br = new BufferedReader(new FileReader(inputFolder
				+ "\\input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFolder
				+ "\\output.txt"));

		int howManyRounds;
		double C;
		double F;
		double X;
		double time;
		String[] helper;
		double currProd;
		double timeToReturnAnotherFarm;
		double prodShouldBeAtLeast;
		int howManyFarmsToBuy;
		
		String currLine;

		howManyRounds = Integer.parseInt(br.readLine());
		// loop for diff rounds
		for (int i = 1; i <= howManyRounds; i++) {
			//get C,F,X
			currLine = br.readLine();
			helper = currLine.split(" ");
			C = Double.parseDouble(helper[0]);
			F = Double.parseDouble(helper[1]);
			X = Double.parseDouble(helper[2]);
			
			time = 0;
			currProd = 2;
			
			timeToReturnAnotherFarm = C / F;
			
			prodShouldBeAtLeast = X / timeToReturnAnotherFarm;
			
			if (currProd < prodShouldBeAtLeast){
				howManyFarmsToBuy = (int) Math.floor((prodShouldBeAtLeast - 2) / F);
				for (int j = 0 ; j<howManyFarmsToBuy ; j++){
					time += 1/(2+j*F);
				}
				time *= C;
				currProd += howManyFarmsToBuy * F;
			}
			time += X / currProd;
			
			
			
			
			if (i == howManyRounds) {
				bw.write("Case #"+i+": "+time);
			} else {
				bw.write("Case #"+i+": "+time+"\n");
			}
		}

		br.close();
		bw.close();
	}
}
