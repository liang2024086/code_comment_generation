package methodEmbedding.Cookie_Clicker_Alpha.S.LYD917;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int numCases;
		ArrayList<Double> fileContent = new ArrayList<Double>();
		FileReader file = new FileReader("input.txt");
		BufferedWriter buffW = new BufferedWriter(new FileWriter("output.txt"));
		Scanner scan = new Scanner(file);
		
		numCases = scan.nextInt();
		scan.useLocale(Locale.ENGLISH);
		while(scan.hasNextDouble()){
			fileContent.add(scan.nextDouble());
		}
		
		int i = 0;
		for(int j = 0; j < numCases; j++){
			double numCookies = 0;
			double perSecond = 2.0;
			double time = 0;
			double C = fileContent.get(i); i++;
			double F = fileContent.get(i); i++;
			double X = fileContent.get(i); i++;
			
			while((time + X/(perSecond)) > ((time + C/(perSecond)) + (X/(perSecond + F)))){
				time += C/perSecond;
				perSecond += F;
			}
			time += X/perSecond;

			buffW.write("Case #" + (j + 1) + ": " + time + "\n");
		}
		buffW.close();
	}

}
