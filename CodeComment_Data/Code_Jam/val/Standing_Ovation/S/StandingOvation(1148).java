package methodEmbedding.Standing_Ovation.S.LYD2192;


import java.io.FileNotFoundException; 
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StandingOvation 
{
	public static void main(String[] args) 
	{
		int N, x, maxShyLev; 
		int[] shyLev;

		try 
		{
			Scanner s = new Scanner(new FileReader("input.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("output.txt"));
			N = s.nextInt();
			for(x=1; x<=N; x++)
			{
				maxShyLev = s.nextInt();				
				shyLev = new int[maxShyLev + 1];
				String whole = s.next();
				String[] temp = whole.split("");
				for(int i=0; i<temp.length; i++)
					shyLev[i] = Integer.parseInt(temp[i]);
				
				int invite = 0;
				int numStand = 0;
				//you invite the difference between sum of prev people and index
				for(int i=1; i<shyLev.length; i++)
				{
					numStand += shyLev[i-1];
					if((numStand<i) && (shyLev[i]!=0)){
						invite += (i-numStand);
						numStand += invite;
					}
				}
				
				outputStream.println("Case #" + x + ": " + invite);
			}
			outputStream.close();
		} catch (FileNotFoundException e) 
		{	
			System.out.println("File not found");
		}
	}	
}
