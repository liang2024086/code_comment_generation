package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1443;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Exe2 {
	public static void main (String[] args) throws Exception
	{
		Scanner input = new Scanner(new File("input"));
		BufferedWriter output = new BufferedWriter(new FileWriter(new File("output")));
		int T = input.nextInt();
		for ( int i = 0; i<T ; i++)
		{
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			System.out.println("C = "+C+" F = "+F+" X = "+X);
			double ans = X/2;
			
			for ( int j = 1; j > 0; j++)
			{
				double temp = ans - X/(2+(j-1)*F) + C/(2+(j-1)*F) + X/(2+(j)*F);
				
				if ( temp < ans )
				{
					ans = temp;
				}
				else
				{
					break;
				}
			}
			
			output.write("Case #"+(i+1)+": "+ans);
			
			output.newLine();
			output.flush();
		}
		output.flush();
		input.close();
		output.close();
	}
}


