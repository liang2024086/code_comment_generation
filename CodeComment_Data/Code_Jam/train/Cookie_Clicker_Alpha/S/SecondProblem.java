package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1546;

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class SecondProblem {

	public SecondProblem() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {	
	try {
		Scanner s = new Scanner(new File("/Users/Sumant/Documents/workspace/Code Jam/src/Untitled2")).useDelimiter(" ");
		PrintWriter out = new PrintWriter("/Users/Sumant/Documents/solution2.txt");

		int testCaseNumber = Integer.parseInt(s.nextLine());
		System.out.println(testCaseNumber);
		
		for(int loop=0; loop<testCaseNumber; loop++)
		{
			String line = s.nextLine();
			Scanner stringScanner=new Scanner(line);
			
			 double C = stringScanner.nextDouble();
			 double F = stringScanner.nextDouble();
			 double X = stringScanner.nextDouble();
			 double totalTime = 0;
			 double cookiePerSec = 2;

			 if(C > X)
			 {
				 totalTime = X/cookiePerSec;
			 }
			 else if(X >= C)
			 {
				double currentTime, nextTime;
				
				while(1 == 1)
				{
				currentTime = X/cookiePerSec;
				
				nextTime = (C/cookiePerSec) + (X/(cookiePerSec+F));
				
				if(currentTime <= nextTime)
				{
					totalTime = totalTime + currentTime;
					break;
				}
				else if(currentTime > nextTime)
				{
					totalTime = totalTime + (C/cookiePerSec);
					cookiePerSec = cookiePerSec + F;
				}
				}
			 }
			 DecimalFormat df = new DecimalFormat("#.0000000");
			 //System.out.print(df.format(totalTime));
			 
			 int caseNo = loop + 1;
				out.println("Case #"+caseNo+": "+df.format(totalTime));
		}
		out.close();

	}
	
	catch (Exception e) {
		System.out.println("error");
	}
	}
}
