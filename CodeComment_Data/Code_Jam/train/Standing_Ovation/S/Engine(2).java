package methodEmbedding.Standing_Ovation.S.LYD347;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Engine {

	public static void main(String[] args) {
		try
		{
			Scanner in = new Scanner(new File("ProbA_Input.txt"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ProbA_Out.txt")));
			int num = in.nextInt();
			for(int i=0; i<num; i++)
			{
				int max = in.nextInt();
				String temp = in.next();
				char[] array = new char[temp.length()];
				for(int k=0; k<temp.length(); k++)
				{
					array[k]=temp.charAt(k);
				}
				int sum=0;
				int add=0;
				for(int j=1; j<array.length; j++)
				{
					sum+=Integer.parseInt(String.valueOf(array[j-1]));
					if(sum<j)
					{
						add+=(j-sum);
						sum=j;
					}
					
				}
				
				out.println("Case #"+(i+1)+": "+add);
			}
			out.close();
		}
		catch(Exception e) {}
		
		
	}

}
