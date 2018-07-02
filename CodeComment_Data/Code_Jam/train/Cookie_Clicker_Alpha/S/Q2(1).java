package methodEmbedding.Cookie_Clicker_Alpha.S.LYD687;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Q2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("q2.in"));
		PrintWriter pw = new PrintWriter("q2.out");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for ( int t = 1; t<=n;t++)
		{
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			double current = 2;
			double ct = 0;
			
			boolean done = false;
			while ( done == false)
			{
				double t1 = c/current + x/(current+f);
				double t2 = x/current;
				if ( t2 <= t1 )
				{
					ct+=t2;
					done = true;
				}
				else
				{
					ct+=c/current;
					current+=f;
				}
				
			}
			pw.print("Case #" + t + ": " + ct +"\n");
			
		}
        pw.println();
        pw.flush();
        pw.close();
        sc.close();
		
		
	}

}
