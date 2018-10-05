package methodEmbedding.Standing_Ovation.S.LYD1566;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws Exception
	{
		String path = "C:\\Users\\Ziming\\Downloads\\";
		String input = path + "A-small-attempt0.in";
		String output = path + "A-small-attempt0.out";
		
		Scanner scanner = new Scanner(new FileReader(input));
		PrintWriter writer = new PrintWriter(output);
		int t = scanner.nextInt();
		scanner.nextLine();
		for (int i=0;i<t;i++)
		{
			writer.print("Case #" + (i+1) + ": ");
			int smax = scanner.nextInt();
			String shyness = scanner.next();
				
			int r = 0;
			int standing = 0;
			for (int j=0;j<shyness.length();j++)
			{
				int cnt = Character.getNumericValue(shyness.charAt(j));
				if (cnt==0)	continue;
				if (standing>=j)
					standing += cnt;
				else {
					r += j-standing;
					standing += r+cnt;
				}
			}
			writer.println(r);
		}
		writer.flush();
		writer.close();
		scanner.close();
		System.out.println("program finished :)");
	}
}
