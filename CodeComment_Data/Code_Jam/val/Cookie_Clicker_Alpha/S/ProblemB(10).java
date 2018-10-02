package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1269;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		try {
			String fileName;
			String outputName;
			int runType = 1;
			switch(runType) {
			case 0:
				fileName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-sample.in";
				outputName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-sample.out";
				break;
			case 1:
				fileName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-small-attempt0.in";
				outputName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-small-attempt0.out";
				break;
			default:
				fileName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-large-attempt0.in";
				outputName = "/Users/andrescontreras/Development/codeJamIO/qualification/2/B-large-attempt0.out";
			}

			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			Scanner s = new Scanner(bufferedReader);
			final int cases = s.nextInt();
			double c, f, x;
			double result, timeNow, timeMoreFarms, farmBuildTime;
			int farms;
			boolean resultFound;
			String[] caseResults = new String[cases];
			DecimalFormat df = new DecimalFormat("#.0000000");
			for (int T = 1; T<=cases; ++T) {
				c = s.nextDouble();
				f = s.nextDouble();
				x = s.nextDouble();
				
				resultFound = false;
				farms = 0;
				farmBuildTime = 0d;
				result = 0;
				timeNow = x/2d;
				while(!resultFound) {
					farmBuildTime+= c/(2d+(farms*f));
					++farms;
					timeMoreFarms = farmBuildTime + (x/(2d+(farms*f)));
					if(timeNow < timeMoreFarms) {
						result = timeNow;
						resultFound = true;
					}
					else {
						timeNow = timeMoreFarms;
					}
				}
				
				caseResults[T-1] = "Case #" + T + ": " + df.format(result);
				
			}
			
			
			s.close();
			bufferedReader.close();





			File outputFile = new File(outputName);

			if (!outputFile.exists()) {
				System.out.println(outputFile.getName());
				outputFile.createNewFile();
			}

			FileWriter fw = new FileWriter(outputFile.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i<cases;++i) {
				bw.write(caseResults[i] + "\n");				
			}
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
