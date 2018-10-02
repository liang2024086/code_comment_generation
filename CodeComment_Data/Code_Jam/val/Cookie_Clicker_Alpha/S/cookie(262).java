package methodEmbedding.Cookie_Clicker_Alpha.S.LYD975;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
public class cookie {
public static void main(String args[])throws IOException
{
	BufferedReader obj = new BufferedReader(new FileReader("D:\\B-small-attempt0 (1).in"));
	PrintWriter prt = new PrintWriter(new FileWriter("D:\\output.txt"));
	String line = obj.readLine();
	int t = Integer.parseInt(line);
	for (int i=1;i<=t;i++)
	{
		prt.print("Case #"+ i+": ");
		//double time =0.0;
		double r=2.0;
		line= obj.readLine();
		String str[] = line.split(" ");
		double c = Double.parseDouble(str[0]);
		double f = Double.parseDouble(str[1]);
		double x = Double.parseDouble(str[2]);
		double ans=0.0;
		DecimalFormat twoDForm = new DecimalFormat("#.0000000");
		while(true)
		{
			double t1 = x/r;
			double t2 = c/r + x/(r+f);
			//System.out.println(r+" "+ans +" "+t1+" "+t2 );
			if (t2<=t1+0.0000001)
			{
				ans+=c/r;
				r+=f;
			}
			else
				{
				ans+=t1;
				break;
				}
				
			
		}
		prt.println(twoDForm.format(ans));
		//System.out.println();
		
		
	  
}
	 obj.close();
	   prt.close();
}
}
