package methodEmbedding.Magic_Trick.S.LYD956;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	public final static String INPUT_FILE_NAME = "A-small-attempt0.in";
	public final static String OUTPUT_FILE_NAME = "MagicOut.txt";
	
	public static void main(String[] args) {
		try(Scanner in = new Scanner(new FileReader(INPUT_FILE_NAME));
				PrintWriter out = new PrintWriter(new FileWriter(OUTPUT_FILE_NAME)))
		{
			int numT = in.nextInt();
			for(int t = 1; t <= numT; t ++)
			{
				int r1 = in.nextInt();
				in.nextLine();
				int res1 = 0;
				for(int i = 1; i <= 4; i ++)
				{
					if(i == r1)
					{
						for(int j = 0; j < 4; j ++)
						{
							res1 |= 1<<in.nextInt();
						}
					}
					in.nextLine();
				}
				int r2 = in.nextInt();
				in.nextLine();
				int res2 = 0;
				for(int i = 1; i <= 4; i ++)
				{
					if(i == r2)
					{
						for(int j = 0; j < 4; j ++)
						{
							res2 |= 1<<in.nextInt();
						}
					}
					in.nextLine();
				}
				
				int finalRes = res1 & res2;
				if(Integer.bitCount(finalRes) == 0)
				{
					out.println("Case #" + t + ": Volunteer cheated!");
				}
				else if(Integer.bitCount(finalRes) > 1)
				{
					out.println("Case #" + t + ": Bad magician!");
				}
				else
				{
					int card = Integer.numberOfTrailingZeros(finalRes);
					out.println("Case #" + t + ": " + card);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
