package methodEmbedding.Standing_Ovation.S.LYD450;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner (new File("A-small-attempt2.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

		
		int T = sc.nextInt();
		
		for (int i=1;i<=T;i++)
		{

				int Sm = sc.nextInt();
				String S = sc.nextLine();
				
				int diff = 0;
				int sum = 0;
				
				if (Sm==0)//Case for nothing
				{
					writer.println("Case #"+i+": 0");
					continue;
				}
				
				for (int k=0;k<S.length();k++)
				{
					char current = S.charAt(k);
					int num = (int)current-48;
					
					int currDiff = k-sum-1;
					
					if (currDiff>0)
					{
						diff+=currDiff;
						sum+=currDiff;
					}
					
					if (num>0)
					{
						sum+=num;
					}
				}
				
				writer.println("Case #"+i+": "+diff);
				
			
			//end of T
		}

		writer.close();

	}

}
