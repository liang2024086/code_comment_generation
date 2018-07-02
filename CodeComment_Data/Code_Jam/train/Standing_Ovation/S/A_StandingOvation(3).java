package methodEmbedding.Standing_Ovation.S.LYD293;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A_StandingOvation {
	public static void main(String[] args) throws Exception
	{
		File f = new File("src\\_2015_Qual\\A-small-attempt1.in");
		File out = new File("src\\_2015_Qual\\A.txt");
		Scanner s = new Scanner(f);
		PrintWriter pw = new PrintWriter(out);
		
		int numTests = s.nextInt();
		for (int i = 0; i < numTests; i++)
		{
			int sMax = s.nextInt();
			String str = s.next();
			pw.print("Case #"+(i+1)+": ");
			new A_StandingOvation(sMax, str, pw);
		}
		pw.flush();
	}
	
	public A_StandingOvation(int sMax, String s, PrintWriter pw)
	{
		int clapping = 0;
		int extra = 0;
		for (int i = 0; i <= sMax; i++)
		{
			if (clapping < i)
			{
				extra += i - clapping;
				clapping = i;
			}
			clapping += s.charAt(i)-'0';
		}
		pw.println(extra);
	}
}
