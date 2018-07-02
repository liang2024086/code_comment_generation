package methodEmbedding.Standing_Ovation.S.LYD738;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Challeng_A {
	public static void main(String[] args) {
		try{
			System.setOut(new PrintStream("src/output.out"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Scanner in=null;
		try{
			in=new Scanner(new File("src/A-small-attempt0.in"));
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int nb=in.nextInt();
			
			
			String s=in.nextLine();
			int p=0;
			int min=0,k=0;
			for(int j=1;j<s.length();j++)
			{
				
				 p=Integer.parseInt(s.substring(j,j+1));
				
				if(k<j)
				{
					min=j-k+min;
					k=j;
				}
				k=k+p;
				
			}
			System.out.println("Case #"+(i+1)+": "+(min-1));
		}
	}

}
