package methodEmbedding.Revenge_of_the_Pancakes.S.LYD351;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Scanner sc = new Scanner(new File("input/qr2016/B/B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("output/qr2016/B/B-small-attempt0.out", "UTF-8");
		
		int T = sc.nextInt();
		sc.nextLine();
		for(int j=1; j<= T; j++)
		{
			String s = sc.nextLine() + "+";
			int count =0;
			for(int i=1; i<s.length(); i++)
			{
				if(s.charAt(i) != s.charAt(i-1))
					count++;
			}
			writer.println("Case #" + j + ": " + count);
		}
		
		sc.close();
		writer.close();
	}
}
