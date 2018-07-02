package methodEmbedding.Counting_Sheep.S.LYD900;

import java.io.*;
import java.util.*;

public class CountingSheep {
	
	public static void main(String[]args)
	{
		try
		{
			Scanner sc = new Scanner(new FileReader("A-small-attempt.in"));
			FileWriter fw = new FileWriter(new File("Output.txt"));
			PrintWriter pw = new PrintWriter(fw);
			
			int t = sc.nextInt();
			
			for(int r = 1; r <= t; r++)
			{
				int n = sc.nextInt();
				if (n == 0)
				{
					pw.println("Case #" + r + ": INSOMNIA");
					continue;
				}
				boolean zero = false;
				boolean one = false;
				boolean two = false;
				boolean three = false;
				boolean four = false;
				boolean five = false;
				boolean six = false;
				boolean seven = false;
				boolean eight = false;
				boolean nine = false;
				int i = 0;
				while(!(zero&&one&&two&&three&&four&&five&&six&&seven&&eight&&nine))
				{
					i++;
					int k = n * i;
					
					while(k != 0)
					{
						switch(k%10)
						{
						case 0: zero = true;
							break;
						case 1: one = true;
							break;
						case 2: two = true;
							break;
						case 3: three = true;
							break;
						case 4: four = true;
							break;
						case 5: five = true;
							break;
						case 6: six = true;
							break;
						case 7: seven = true;
							break;
						case 8: eight = true;
							break;
						case 9: nine = true;
							break;
						}
						k = k / 10;
					}
					
				}
				pw.println("Case #" + r + ": " + n * i);		
			}
			pw.flush();	
		}
		catch(IOException ioe)
		{
			System.out.print(ioe);
		}

	}

}
