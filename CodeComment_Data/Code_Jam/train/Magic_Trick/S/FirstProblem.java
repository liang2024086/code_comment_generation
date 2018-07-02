package methodEmbedding.Magic_Trick.S.LYD2223;

import java.io.File;
import java.io.PrintWriter;
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

public class FirstProblem {

	public FirstProblem() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String args[]) {

		int i, j;
		try {
			Scanner s = new Scanner(new File("/Users/Sumant/Documents/workspace/Code Jam/src/Untitled1")).useDelimiter(" ");
			PrintWriter out = new PrintWriter("/Users/Sumant/Documents/solution.txt");

			int testCaseNumber = Integer.parseInt(s.nextLine());
			System.out.println(testCaseNumber);

			for(int loop=0; loop<testCaseNumber; loop++)
			{
				int firstOutPut = Integer.parseInt(s.nextLine());
				int firstArrange[][] = new int[4][4];
				for(int row=0; row<4; row++)
				{
					String line = s.nextLine();
					Scanner stringScanner=new Scanner(line);
					for(int column=0; column<4; column++)
					{
						firstArrange[row][column] = stringScanner.nextInt();
					}
				}
				
				int secondOutPut = Integer.parseInt(s.nextLine());	
				int secondArrange[][] = new int[4][4];
				for(int row=0; row<4; row++)
				{
					String line = s.nextLine();
					Scanner stringScanner=new Scanner(line);
					for(int column=0; column<4; column++)
					{
						secondArrange[row][column] = stringScanner.nextInt();
					}
				}
				
				int count = 0, chosenCard=-1;
				
				for(int column1=0; column1<4; column1++)
				{
					for(int column2=0; column2<4; column2++)
					{
						if(firstArrange[firstOutPut-1][column1]==secondArrange[secondOutPut-1][column2])
						{
								chosenCard = firstArrange[firstOutPut-1][column1];
								count++;
						}
					}
					if(count>1)
						break;
				}
				int caseNo = loop+1;
				
				if(count==0)
				{
					out.println("Case #"+caseNo+": Volunteer cheated!");
				}
				else if(count==1)
				{
					out.println("Case #"+caseNo+": "+chosenCard);
				}
				else if(count>1)
				{
					out.println("Case #"+caseNo+": Bad magician!");
				}
				
				for(int row=0; row<4; row++)
				{
					for(int column=0; column<4; column++)
					{
						System.out.println(firstArrange[row][column]);
					}
					System.out.println("");
				}
			}
			out.close();
			
           }
		catch (Exception e) {
					System.out.println("error");
		}
	}
}
