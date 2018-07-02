package methodEmbedding.Revenge_of_the_Pancakes.S.LYD193;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner (new File ("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter (new FileWriter ("B-small.txt"));
		int T = in.nextInt();
		in.nextLine();
		for (int test = 1; test<=T;test++)
		{
			int count=0;
			String S = in.nextLine();
			for (int i = 0; i<S.length()-1; i++)
			{
				if (S.charAt(i)!=S.charAt(i+1))
				{
					count++;
				}
			}
			if (S.charAt(S.length()-1)=='-')
               count++;
			out.println("Case #"+test+": "+count);
               
		}
		out.close();
        
	}

}
