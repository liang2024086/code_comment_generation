package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1148;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJP2 {
	public static void main(String[] args) throws IOException {
		Scanner sc;
		try{
			sc = new Scanner(new FileReader("B-small-attempt0.in"));
		}
		catch(Exception e)
		{
			sc = new Scanner(System.in);
		}
		int T = sc.nextInt();
		PrintWriter out = new PrintWriter(new FileWriter("gcj.out"));
//		PrintWriter out = new PrintWriter(System.out);
		sc.nextLine();
		for(int t = 1; t<=T; t++)
		{
			String s = sc.nextLine();
			int c = 1;
			int total = 0;
			boolean counted = false;
			boolean added = false;
			boolean pos = false;
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '-' && !counted){
					if(pos)
						total+=2;
					else
						total++;
					
					counted = true;
//					added = false;
				}
				else if(s.charAt(i) == '+' && !added)
				{
					pos = true;
					c++;
//					added = true;
					counted = false;
				}
				
				
			}
			out.printf("Case #%d: %d\n",t,total);
		}
		out.flush();
		out.close();
	}
}
