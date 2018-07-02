package methodEmbedding.Speaking_in_Tongues.S.LYD878;

/**
 * 
 * @author slerig
 *
 */

import java.io.*;
import java.util.*;

public class Translator {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File("A-small.in");
		PrintWriter outFile = new PrintWriter("A-small.out");
		Scanner in = new Scanner(inFile);
		
		char[] gog = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] reg = {'y','n','f','i','c','w','l','b','k','u','o','m','x',
				's','e','v','z','p','d','r','j','g','t','h','a','q'};
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 1; i <= cases; i++)
		{
			String lineIn = in.nextLine();
			outFile.print("Case #" + i + ": ");
			for(int j = 0; j < lineIn.length(); j++)
			{
				for(int k = 0; k < 26; k++)
				{
					if(lineIn.charAt(j) == reg[k])
						outFile.print(gog[k]);
					else if(lineIn.charAt(j) == ' ')
					{
						outFile.print(' ');
						break;
					}
				}
			}
			outFile.println();
		}
		outFile.close();
	}

}
