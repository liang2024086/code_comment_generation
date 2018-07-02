package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1347;

import java.util.*;
import java.io.*;
class Cookie_clicker
{
	public static void main(String args[]) throws IOException
	{
		File  fileName =new File( "B-small-attempt0.in");
		Scanner in = new Scanner(fileName);
		
		File file = new File("Cookie_Clicker_output.txt");
		
		if (!file.exists()) {
				file.createNewFile();
			}
		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fwriter);
		
		
		Scanner sc= new Scanner(System.in);
		int test_case;
		double tm=0,tc,tf,tx;
		test_case=in.nextInt();
		double n=2.0;
		double c[]=new double[test_case+1];
		double f[]=new double[test_case+1];
		double x[]=new double[test_case+1];
		double answer[]=new double[test_case+1];
		for(int i=1;i<=test_case;i++)
		{
			c[i]=in.nextDouble();
			f[i]=in.nextDouble();
			x[i]=in.nextDouble();
		}
		
		
		for(int i=1;i<=test_case;i++)
		{
			n=2;tm=0;tc=0;tf=0;tx=0;
			
			do
			{
				tc=c[i]/n;
				tf=x[i]/(n+f[i]);
				tx=x[i]/n;
				if(tx>tc+tf)
				{
					tm=tm+tc;
					n=n+f[i];
				}
				else
				{
					tm=tm+tx;
					break;
				}
			}while(tx>tc+tf);
			answer[i]=tm;
		}
		for(int i=1;i<=test_case;i++)
			bw.write("Case #"+i+": "+answer[i]+"\n");
		bw.close();
	}
}
