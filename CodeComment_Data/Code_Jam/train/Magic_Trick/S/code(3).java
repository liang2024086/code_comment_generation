package methodEmbedding.Magic_Trick.S.LYD554;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class MagicTrick {
	
	public static void main(String[] args) throws Exception {
		ArrayList<String> result = new ArrayList<>();
		String inputFileName ="C:/Users/Francois/Desktop/input.txt";
		File file = new File(inputFileName);
		 Scanner scanner = new Scanner(file);
		 int numberOfTestCases = new Integer(scanner.nextLine());
		 for (int currentTestIndex=1; currentTestIndex<=numberOfTestCases;currentTestIndex++)
		 {
			 int firstGuess=new Integer(scanner.nextLine());
			 String[] lines = new String[4];
			 lines[0]=scanner.nextLine();
			 lines[1]=scanner.nextLine();
			 lines[2]=scanner.nextLine();
			 lines[3]=scanner.nextLine();
			 String firstLine = lines[firstGuess-1];
			 int secondGuess=new Integer(scanner.nextLine());
			 lines = new String[4];
			 lines[0]=scanner.nextLine();
			 lines[1]=scanner.nextLine();
			 lines[2]=scanner.nextLine();
			 lines[3]=scanner.nextLine();
			 String secondLine = lines[secondGuess-1];
			 String[] split1 = firstLine.split(" ");
			 ArrayList<String> split2 = new ArrayList<String>();
			 split2.addAll(Arrays.asList(secondLine.split(" ")));
			 int count=0;
			 String value="";
			 for (int i=0; i<split1.length; i++)
			 {
				 if (split2.contains(split1[i]))
				 {
					 count++;
					 value=split1[i];
				 }
			 }
			 if (count==0)
			 {
				 result.add("Case #"+currentTestIndex+": Volunteer cheated!");
			 }
			 else if (count==1)
			 {
				 result.add("Case #"+currentTestIndex+": "+value);
			 }
			 else
			 {
				 result.add("Case #"+currentTestIndex+": Bad magician!");
			 }
			 
			 
		 }
		 FileUtils.writeLines(new File("C:/Users/Francois/Desktop/output.txt"), result);
		 scanner.close();
		 
	}

}
