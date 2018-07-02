package methodEmbedding.Revenge_of_the_Pancakes.S.LYD570;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class jam2 {
	static int counter;
	public static void main (String[] args) throws IOException	
	{
		Scanner in= new Scanner(new File("LargeA.in"));
		FileWriter fw= new FileWriter("OutputA.out");
		int t= in.nextInt();
		for(int cases=1;cases<=t;cases++)
		{
			String s=in.next();
			StringTokenizer st1=new StringTokenizer(s,"+");
			int i=st1.countTokens();
			StringTokenizer st2=new StringTokenizer(s,"-");
			int j=st1.countTokens();
			if(i==1 && j==0)
				counter=1;
			else if(i==0 && j==1)
				counter=0;
			else if(i==1 && j==1)
			{
				if(s.charAt(0)=='-')
					counter=1;
				else
					counter=2;
			}
			else if(j==i+1)
			{
				counter=i*2;
			}
			else if(i==j)
			{
				if(s.charAt(0)=='-')
					counter=i*2-1;
				else
					counter=i*2;
			}
			else if(i==j+1)
			{
				counter=i*2-1;
			}
			fw.write("Case #" + cases + ": "+counter+"\n");
		}
		
	fw.flush();
	fw.close();
	in.close();
	}
}
