package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1031;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class Cookies {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter("smallOutputB.out");
		int N = Integer.parseInt(in.readLine());
		int i=1;
		while(i <= N)
		{
			String line = in.readLine();
			String [] vals = line.split(" ");
			double C = Double.parseDouble(vals[0]);
			double F = Double.parseDouble(vals[1]);
			double X = Double.parseDouble(vals[2]);
			double div = 2;
			double totalTime=0;
			//if X/div <= C/div+X/(div+F) break .. --> (X-C)/X <= div/(div+F)
			double leftval = (X-C)/X;
			while(leftval > (div/(div+F))){
				totalTime += C/div;
				div += F;
			}
			totalTime += X/div;
			out.println("Case #"+i+": "+totalTime);
			i++;
		}
		in.close();
		out.close();
	}

}
