package methodEmbedding.Speaking_in_Tongues.S.LYD97;

import java.util.*;
import java.io.*;

public class SpeakinginTongues
{
	public static void main(String[] args) throws IOException
	{
		int N;
		String originalString, convertedString = "";
		char originalChar, convertedChar;
		String standardString = "yhesocvxduiglbkrztnwjpfmaq";
		String GooglereseString = "abcdefghijklmnopqrstuvwxyz";

		File inputFile = new File(".in");
		FileInputStream fin = new FileInputStream(inputFile);
		InputStreamReader isr = new InputStreamReader(fin);
		BufferedReader in = new BufferedReader(isr);

		PrintWriter out = new PrintWriter(new FileWriter(".out", true));

		N = Integer.parseInt(in.readLine());

		for( int i = 0; i < N; i++ )
		{
			originalString = in.readLine();
			convertedString += "Case #"+(i+1)+": ";
			for( int j = 0; j < originalString.length(); j++ )
			{
				int pos;
				originalChar = originalString.charAt(j);
				pos = GooglereseString.indexOf(originalChar);
				if( pos >= 0 )
				{
					convertedString += ""+ standardString.charAt(pos);
				}
				else
				{
					convertedString += ""+originalChar;
				}
			}
			out.println(convertedString);

			convertedString = "";
			originalString = "";
		}

		in.close();
		out.close();

	}
}
