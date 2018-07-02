package methodEmbedding.Standing_Ovation.S.LYD506;

/**
 * @(#)StandingOvation.java
 *
 *
 * @author
 * @version 1.00 2015/4/11
 */
import java.util.*;
import java.io.*;

public class StandingOvation
{



    public static void main(String[] args) throws IOException
    {
    	Scanner file = new Scanner(new File("A-small-attempt1.in"));
    	int t = file.nextInt();
    	PrintWriter writer = new PrintWriter("ovation.dat", "UTF-8");

        for(int i = 1; i<=t; i++)
        {
        	writer.print("Case #" + i + ": ");
        	int n = file.nextInt();
			String l = file.nextLine();
			if(l.length() == 0)
			{
				writer.println(0);

			}
			else
			{


			l=l.substring(1);
			int friends = 0;
			int stand = Character.getNumericValue(l.charAt(0));

			int val = 0;
			for(int j = 1; j<= n; j++)
			{
				val = Character.getNumericValue(l.charAt(j));
				if(stand<j && val!=0)
					friends+= (j-stand);

				stand += val + friends;
			}
			writer.println(friends);

			}

        }
        writer.close();

    }
}
