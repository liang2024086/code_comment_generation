package methodEmbedding.Magic_Trick.S.LYD597;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Integer;

public class Q1 {
	public static void main(String []args)
	{
		List<Integer> integers = new ArrayList<Integer>();  
		Scanner scan;
		int whereWeAre = 0;
		try {
			scan = new Scanner(new File("C:\\Users\\Joseph\\Downloads\\A-small-attempt1.in"));
			while (scan.hasNextInt()){
				   integers.add(scan.nextInt());
				}
			int numberOfTestCases = integers.get(whereWeAre);
			whereWeAre++;
			
			for(int i=0;i<numberOfTestCases;i++)
			{
				int firstAns = integers.get(whereWeAre);
				whereWeAre++;
				int[][] firstSet = new int[4][4];
				for(int k=0;k<4;k++)
				{
					for(int j=0;j<4;j++)
					{
						firstSet[k][j] = integers.get(whereWeAre);
						whereWeAre++;
					}
				}
				int secondAns = integers.get(whereWeAre);
				whereWeAre++;
				int[][] secondSet = new int[4][4];
				for(int l=0;l<4;l++)
				{
					for(int m=0;m<4;m++)
					{
						secondSet[l][m] = integers.get(whereWeAre);
						whereWeAre++;
					}
				}
				boolean found = false;
				int numberfound = 0;
				int keepnum = 0;
				for(int n=0;n<4;n++)
				{
					for(int o=0;o<4;o++)
					{
						if(firstSet[firstAns-1][n]==secondSet[secondAns-1][o])
						{
							found = true;
							numberfound++;
							keepnum = firstSet[firstAns-1][n];
						}
					}
				}
				int temp = i+1;
				if(found)
				{
					
					if(numberfound==1)
					{
						System.out.println("Case #"+ temp + ": "+keepnum);
					}
					else
					{
						System.out.println("Case #"+ temp + ": Bad magician!");
					}
				}
				else
				{
					System.out.println("Case #" + temp + ": Volunteer cheated!");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
