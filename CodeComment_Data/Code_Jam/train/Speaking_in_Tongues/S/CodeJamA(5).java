package methodEmbedding.Speaking_in_Tongues.S.LYD1467;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CodeJamA
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(new File("in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		int cases = in.nextInt();

		String input = "abcdefghijklmnopqrstuvwxyz";
		String output = "yhesocvxduiglbkrztnwjpfmaq";
		in.nextLine();

		for(int casenum = 1;casenum <= cases;casenum++)
		{
			String a = in.nextLine();
			System.out.println(a);
			String b = "";
			for(int n = 0;n < a.length();n++)
			{
				if(a.charAt(n) == ' ')
				{
					b+=' ';
				}
				else
				{
					b += output.charAt(input.indexOf(a.charAt(n)));
				}
				System.out.println(b);
			}

			out.write("Case #" + casenum + ": " + b+"\n");
		}
		in.close();
		out.close();
	}
}
