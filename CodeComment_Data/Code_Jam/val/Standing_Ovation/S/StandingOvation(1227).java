package methodEmbedding.Standing_Ovation.S.LYD1851;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;



public class StandingOvation 

{
	public static void main( String args[] ) throws IOException 
	{		
		Scanner in = new Scanner(new File("in.txt"));
		
		PrintStream out = new PrintStream(new File("out.txt"));
		int cases = in.nextInt();


		for(int i = 0; i < cases; i++)
		{
			//read the max shyness
			int max = in.nextInt();
			int count=0;
			int clapping =0;

			BigInteger temp = in.nextBigInteger();

			int[] crowd = new int [max+1];
			for(int j = max;j>=0;j--)
			{
				BigInteger digit = temp.mod(BigInteger.TEN);
				temp = temp.divide(BigInteger.TEN);
				crowd[j] = digit.intValue();
			}

			for(int j = 0; j < crowd.length; j++)
			{
				clapping += crowd[j];
				if(j >= clapping)
				{
					count++;
					clapping++;
				}
			}
			out.println("Case #"+(i+1)+": "+count+"\n");	
			//System.out.print("Case #"+(i+1)+": "+count+"\n");
		}
		out.close();
	}
}
