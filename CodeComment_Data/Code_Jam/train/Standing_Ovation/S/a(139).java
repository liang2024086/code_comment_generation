package methodEmbedding.Standing_Ovation.S.LYD1095;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class a {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream(new FileOutputStream("a_small.out"));
		System.setOut(out);
		System.setIn(new FileInputStream("A-small-attempt0.in"));
		Scanner sc = new Scanner(System.in);
		int tcases = sc.nextInt();
		for(int i=1;i<=tcases;i++)
		{
			out.print("Case #"+i+": ");
			int n = sc.nextInt();
			String s = sc.next();
			int sum = s.charAt(0) - '0';
			int req = 0;
			for(int j=1;j<=n;j++)
			{
				if(sum<j)
				{
					req = req + j - sum;
					sum = j;
				}
				sum = sum + s.charAt(j) - '0';
			}
			out.println(req);	
		}
		out.flush();
		out.close();
		sc.close();
		
	}

}
