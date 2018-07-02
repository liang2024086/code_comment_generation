package methodEmbedding.Magic_Trick.S.LYD796;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;


public class MagicMagician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
		try {
			scan = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int testCases = scan.nextInt();
		int guessOne = 0;
		int guessTwo = 0;
		boolean match = false;
		boolean badMagic = false;
		int mat = 0;
		int potMat= 0;
		for(int i = 1; i <= testCases;i++)
		{
			HashSet<Integer> hsh = new HashSet<Integer>();
			match = false;
			badMagic = false;
			mat=0;
			potMat=0;
			System.out.print("Case #" + i+": ");
			guessOne = scan.nextInt();
			for(int x = 1; x < 5; x++)
			{
				
				if(x == guessOne)
				{
					for(int y = 0; y < 4; y++)
					{
						hsh.add(scan.nextInt());
					}
				}
				else
				{
					for(int y = 0; y < 4; y++)
					{
						scan.nextInt();
					}
				}
			}
			//hsh has all potential ones
			guessTwo = scan.nextInt();
			for(int x = 1; x < 5; x++)
			{
				if(x == guessTwo)
				{
					for(int y = 0; y < 4; y++)
					{
						potMat = scan.nextInt();
						if(hsh.contains(potMat))
						{
							if(match)
							{
								badMagic=true;
							}
							else
							{
								match = true;
								mat = potMat;
							}
						}
					}
				}
				else
				{
					for(int y = 0; y < 4; y++)
					{
						scan.nextInt();
					}
				}
			}
			if(badMagic)
			{
				System.out.println("Bad magician!");
			}
			else if (match)
			{
				System.out.println(mat);
			}
			else
			{
				System.out.println("Volunteer cheated!");
			}
			
		}
		
	}

}
