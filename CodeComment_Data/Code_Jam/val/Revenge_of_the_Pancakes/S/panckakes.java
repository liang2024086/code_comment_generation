package methodEmbedding.Revenge_of_the_Pancakes.S.LYD938;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class panckakes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i,j,T,last=1;
		String [] instr = new String[100];
		char [] ch = new char[100];
		int [] result = new int[100];
		Scanner filein = new Scanner(new File("C:/codejamdata/B-small-attempt0.in"));
		PrintStream fileout = new PrintStream(new FileOutputStream("C:/codejamdata/gcjqbsoutput.txt"));
		T = filein.nextInt();
		
		for(i=0;i<T;i++)
		{
			instr[i] = filein.next();
			result[i] = 0;
			for(j=0;j<instr[i].length();j++)
			{
				ch[j] = instr[i].charAt(j);
			}
			if(ch[0]=='+')
				last=1;
			else
				last=0;
			for(j=1;j<instr[i].length();j++)
			{
				if (ch[j] != ch[j-1])
				{
					result[i]++;
					if(ch[j] == '+')
						last = 1;
					else
						last = 0;
				}
			}
			if(last==0)
				result[i]++;

		}
		filein.close();
		for(i=0;i<T;i++)
		{
			fileout.println("Case #" + (i+1) + ": " + result[i]);
		}
		fileout.close();
	}

}
