package methodEmbedding.Magic_Trick.S.LYD2076;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CodeJam
{
	public static final String BAD_MAGICIAN = "Bad magician!";
	public static final String VOLUNTEER_CHEATEAD = "Volunteer cheated!";
	
	public static void main(String[] args)
	{
		File f = new File("/home/george/Desktop/A-small-attempt1.in");
		Scanner input = null;
		try {
			input = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = input.next();
		
		input.useDelimiter("\n");
		int N = Integer.parseInt(line);
		int counter = 0;
		String[] lines = new String[N * 10];
		while (input.hasNext())
			lines[counter++] = input.next();
		
		String out = "/home/george/Desktop/out.txt";
		OutputStream output = null;
		try {
			output = new FileOutputStream(out, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		PrintStream outstream = new PrintStream(output);
		System.setOut(outstream);

		for(int i = 0;i < N;i++)
		{
			int q = i + 1;
			
			int firstLine = Integer.parseInt(lines[i * 10]);
			int secondLine = Integer.parseInt(lines[i * 10 + 5]);
			
			String[] numbersOfFirstLineS = lines[firstLine + i * 10].split(" ");
			String[] numbersOfSecondLineS = lines[secondLine + 5 + i * 10].split(" ");
			
			int[] numbersOfFirstLine = new int[4];
			int[] numbersOfSecondLine = new int[4];

			for(int j = 0;j < 4;j++)
			{
				numbersOfFirstLine[j] = Integer.parseInt(numbersOfFirstLineS[j]);
				numbersOfSecondLine[j] = Integer.parseInt(numbersOfSecondLineS[j]);
			}
			
			int cntr = 0;
			int magicNumber = 0;
			for(int j = 0;j < 4;j++)
				for(int k = 0;k < 4;k++)
					if(numbersOfFirstLine[j] == numbersOfSecondLine[k])
					{
						cntr++;
						magicNumber = numbersOfFirstLine[j];
					}
			
			if(cntr == 0)
				System.out.println("Case #" + q + ": " + CodeJam.VOLUNTEER_CHEATEAD);
			else if(cntr == 1)
				System.out.println("Case #" + q + ": " + magicNumber);
			else 
				System.out.println("Case #" + q + ": " + CodeJam.BAD_MAGICIAN);
		}
	}
}
