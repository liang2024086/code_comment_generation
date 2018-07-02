package methodEmbedding.Standing_Ovation.S.LYD266;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class a {
	public static void main(String[]args) throws IOException {
		
		File file = new File("output.out");
		FileOutputStream fis = new FileOutputStream(file);
		PrintStream out = new PrintStream(fis);
		System.setOut(out);
		Scanner in = new Scanner(new File("A-small-attempt3.in"));
		//Scanner in = new Scanner(new File("practice.in"));
		int nCases=in.nextInt();		
		for (int i=0; i<nCases; i++)
		{
			int maxShy = in.nextInt();
			int count=0;			
			int shyarray = in.nextInt();
			int a=shyarray;
			int currentlvl;			
			for (int j=maxShy; j>0 ;j--)
			{
				int x=0;
				int sumofdigit=0;
				currentlvl=a%10;
				a=a/10;
				int b=a;
				if (currentlvl>0)
				{					
					while ( b != 0)
					{
						sumofdigit += b%10;
						b/=10;
					}
					x=sumofdigit + count;
					if (x<j)
					{
						count = count + (j-x);
					}
				}				
			}			
			System.out.println("Case #"+(i+1)+": "+count);			
		}		
		}
	}
