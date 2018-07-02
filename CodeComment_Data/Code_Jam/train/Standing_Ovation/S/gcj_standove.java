package methodEmbedding.Standing_Ovation.S.LYD1494;

import java.io.*;
import java.util.*;




public class gcj_standove {

	
	public static void main(String[] args) throws IOException {
		int i,j,T,count;
		int [] smax = new int[100];
		int [] result = new int[100];
		String [] sinput = new String[100];
		Scanner filein = new Scanner(new File("C:/codejamdata/A-small-attempt2.in"));
		PrintStream fileout = new PrintStream(new FileOutputStream("C:/codejamdata/gcj1output.txt"));
		
		T = filein.nextInt();
		for(i=0;i<T;i++)
		{
			smax[i] = filein.nextInt();
			sinput[i] = filein.nextLine();
			result[i] = 0;
			count = 0;
			for(j=1;j<=(smax[i]+1);j++)
			{
				if(count < (j-1))
				{
					result[i] = result[i] + j - 1 - count;
					count = Character.getNumericValue(sinput[i].charAt(j)) + j - 1;
				}
				else
				{
					count = count + Character.getNumericValue(sinput[i].charAt(j));
				}
				//System.out.println((i+1) + "j= " + (j-1) + "count= " +count + "result= " + result[i] + "Char= " + sinput[i].charAt(j));
			}
		}
		filein.close();
		
		for(i=0;i<T;i++)
		{
			fileout.println("Case #" + (i+1) + ": " + result[i]);
		}	
		fileout.close();		
	}

}

