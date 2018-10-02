package methodEmbedding.Cookie_Clicker_Alpha.S.LYD968;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class CookieGame {
	
	public static void main(String[] args) throws Exception {
		ArrayList<String> result = new ArrayList<>();
		String inputFileName ="C:/Users/Francois/Desktop/input.txt";
		File file = new File(inputFileName);
		 Scanner scanner = new Scanner(file);
		 int numberOfTestCases = new Integer(scanner.nextLine());
		 for (int currentTestIndex=1; currentTestIndex<=numberOfTestCases;currentTestIndex++)
		 {
			 String[] split = scanner.nextLine().split(" ");
			 Double c = new Double(split[0]);
			 Double f = new Double(split[1]);
			 Double x = new Double(split[2]);
			 
			 Double bestTime=x/2;
			 Double lastFarmTime=0D;
			 Double currentProd=2D;
			 for (int i=1;i<2000;i++)
			 {
				 Double creationTime = c/currentProd;
				 currentProd=currentProd+f;
				 lastFarmTime = lastFarmTime+creationTime;
				 Double xTime = x/currentProd+lastFarmTime;
				 if (xTime<=bestTime)
				 {
					 bestTime = xTime;
				 }
				 else
				 {
					 result.add("Case #"+currentTestIndex+": "+bestTime); 
					 break;
				 }
			 }
		 }
		 FileUtils.writeLines(new File("C:/Users/Francois/Desktop/output.txt"), result);
		 scanner.close();
		 
	}

}
