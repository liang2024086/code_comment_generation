package methodEmbedding.Magic_Trick.S.LYD1029;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class tester {

	public static void main(String[] args) {
		
		int[][] iArray1 = new int[4][4];
		int[][] iArray2 = new int[4][4];
		int instances = 0;
		int guess1 = 0;
		int guess2 = 0;
		int predict = 0;
		int counter = 1;
		int var = 0;
		
		try
		{
			FileReader file = new FileReader("A-small-attempt1.in");
			Scanner scan = new Scanner(file);
			
			instances = scan.nextInt();
			
			for (int i=0; i < instances; i++)
			{
				
				guess1 = scan.nextInt();
				
				//first array
				for(int j=0; j < iArray1.length; j++)
				{
					for(int k=0; k < iArray1[0].length; k++)
					{
						iArray1[j][k] = scan.nextInt();
					}
				}
				
				guess2 = scan.nextInt();
				
				//second array
				for(int j=0; j < iArray2.length; j++)
				{
					for(int k=0; k < iArray2[0].length; k++)
					{
						iArray2[j][k] = scan.nextInt();
					}
				}
				
				for (int x = 0; x < iArray1.length; x++)
				{
					for (int y = 0; y < iArray1.length; y++)
					{
						if (iArray1[guess1-1][x] == iArray2[guess2-1][y])
						{
							var = iArray1[guess1-1][x];
							predict++;
						}
					}
				}
				
				if (predict == 1)
				{ System.out.print("Case #" + counter + ": " + var + "\n"); }
				else if (predict > 1)
				{ System.out.print("Case #" + counter + ": Bad magician!\n"); }
				else if (predict < 1)
				{ System.out.print("Case #" + counter + ": Volunteer cheated!\n"); }
				counter++;
				predict = 0;
			}
		}
		catch (IOException e) {}
	}

}
