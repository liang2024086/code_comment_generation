package methodEmbedding.Speaking_in_Tongues.S.LYD104;

import java.io.*;
import java.util.LinkedList;
class firstgame11 
{
	BufferedReader br;
	PrintWriter pw;

	
	final String alphabet = "yhesocvxduiglbkrztnwjpfmaq ";
	final String decode = "abcdefghijklmnopqrstuvwxyz "; // give

	String input;
	String answer="";

	public firstgame11()
	{
		try
		{
			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			pw = new PrintWriter(new BufferedWriter(new FileWriter("output1.txt")));		

			
			input = br.readLine();
			int count = Integer.parseInt(input);

			for (int x=1; x<= count; x++)
			{
				input = br.readLine();
				//System.out.println(input);
				for (int len=0;len<input.length() ;len++ )
				{
					for (int check=0;check<27 ;check++ )
					{
						if (input.charAt(len)==decode.charAt(check))
						{
							answer += alphabet.charAt(check);
						}
					}
				}
				System.out.println(answer);
				pw.println("Case #"+x+": "+answer);
				answer = "";
			}
			// after end read
			pw.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}	
	}
	public static void main(String[] args) 
	{
		new firstgame11();
	}
}
