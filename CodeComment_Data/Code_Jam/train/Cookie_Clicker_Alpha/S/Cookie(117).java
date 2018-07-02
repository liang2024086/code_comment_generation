package methodEmbedding.Cookie_Clicker_Alpha.S.LYD631;

import java.io.*;
import java.text.*;

public class Cookie
{
	public static void main(String[] args) throws Exception
	{
		DecimalFormat df = new DecimalFormat("#.0000000");
		PrintWriter writer = new PrintWriter("output.txt","UTF-8");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		int t = Integer.parseInt(br.readLine());
		for(int x = 0;x<t;x++)
		{
			String[] thingies = br.readLine().split(" ");
			double F = Double.parseDouble(thingies[1]);
			double C = Double.parseDouble(thingies[0]);
			double X = Double.parseDouble(thingies[2]);
			double time = 0.0;
			int N = 0;
			while(X/(F*N+2.0)>X/(F*(N+1)+2)+C/(F*N+2.0))
			{
				time += C/(F*N+2.0);
				N++;
			}
			time += X/(F*N+2.0);
			String out = "Case #"+(x+1)+": "+df.format(time);
			writer.println(out);
		}
		writer.close();
	}
}
