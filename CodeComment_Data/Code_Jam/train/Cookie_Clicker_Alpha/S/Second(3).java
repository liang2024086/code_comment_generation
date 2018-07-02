package methodEmbedding.Cookie_Clicker_Alpha.S.LYD560;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Second 
{
	public static void main(String Args[]) throws FileNotFoundException
	{
		Scanner fin = new Scanner(new File("sample.in"));
		PrintWriter fout = new PrintWriter(new File("ans2.out"));
		int cases = fin.nextInt();
		for(int i=1;i<=cases;i++)
		{
			double C = fin.nextDouble();
			double F = fin.nextDouble();
			double X = fin.nextDouble();
			double V1 = X/2;
			double V2 = 0;
			double F1 = 2;
			int c = 1;
			for(int ii=0;ii<c;ii++)
	        {
	            V2=V2+(C/F1);
	            F1=F1+F;
	        }
	        V2=V2+(X/F1);

	        while( V1 > V2)
	        {
	            c++;
	        V1=V2;
	        V2=0;
	        F1=2;
	        for(int ii=0;ii<c;ii++)
	        {
	            V2=V2+(C/F1);
	            F1=F1+F;
	        }
	        V2=V2+(X/F1);

	        }
	        fout.printf("Case #%d: %.7f",i,V1);
	        fout.println();
		}
		fout.close();
	}

}
