package methodEmbedding.Cookie_Clicker_Alpha.S.LYD289;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cookie {
	public static void main(String rags[])throws IOException
	{
		File in = new File("A-small-attempt0.in");
		Scanner sc = new Scanner(in);
		File out = new File("answers-small.out");
		PrintWriter pw = new PrintWriter(out);
		
		//double cps = 2.0;
		
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			double c = sc.nextDouble();//cost of farm
			double f = sc.nextDouble();//increase in speed
			double x = sc.nextDouble();//max cookies
			double s = 2.0;
			double tsum = 0.0;
			
			boolean flag = true;
			
			while(flag)
			{
				double t1 = x/s;
				double t2 = c/s + x/(s+f);
				if(t2<t1)
				{
					tsum+=c/s;
					s+=f;
				}
				else
				{
					tsum+=x/s;
					flag=false;
				}				
			}
			pw.print("Case #"+(i+1)+": ");
			pw.println(tsum);
		}
		sc.close();
		pw.flush();
		pw.close();
	}
}
