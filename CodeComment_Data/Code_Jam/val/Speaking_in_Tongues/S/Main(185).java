package methodEmbedding.Speaking_in_Tongues.S.LYD999;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Main
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		//Just some notes for discerning the character mappings.  Retained, just because.
		
		//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		//y n f i c w l _ k u o m x s e v _ p d r j g t h a _
		
		//a cdefghijklmnop rstuvwxy 
		// b              q        z
		
		//These are the potential cipher maps that I've identified
		char[] cipherMap = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
		//char[] cipherMap = {'y','n','f','i','c','w','l','q','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','b'};
		//char[] cipherMap = {'y','n','f','i','c','w','l','z','k','u','o','m','x','s','e','v','b','p','d','r','j','g','t','h','a','q'};
		
		//This is a reference map, with blanks left where no known character mappings were provided (retained, just in case :)
		//char[] cipherMap = {'y','n','f','i','c','w','l','_','k','u','o','m','x','s','e','v','_','p','d','r','j','g','t','h','a','_'};
		
		int testCases = 0;
		Cipher cipher = new Cipher(cipherMap);
		File inputFile = new File("A-small-attempt0.in");
		Scanner input = new Scanner(inputFile);
		FileManager output = new FileManager("output");
		try
		{
		output.newFile();  //clear results from previous runs. >:)
		}
		catch ( Exception x )
		{
			System.out.println("oops");
		}
		String sentence = "bob";
		
		try 
		{
			sentence = input.nextLine();
			testCases = Integer.parseInt( sentence );
			int outputCount = 1;
			
			do
			{
				sentence = "Case #" + outputCount + ": " + cipher.decode( input.nextLine() );
				System.out.println(sentence);
				output.writeLine(sentence);
				outputCount++;
			}
			while ( outputCount <= testCases );
		}
		catch ( Exception x )
		{
			System.out.println( x.getMessage() );
		}
		
	}
}
