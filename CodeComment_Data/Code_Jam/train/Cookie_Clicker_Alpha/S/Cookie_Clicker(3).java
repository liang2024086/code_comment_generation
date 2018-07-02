package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1384;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Cookie_Clicker {
	public static void main(String s[]) throws IOException
	{
		System.setIn(new FileInputStream("B-small-attempt0.in"));
		System.setOut(new PrintStream(new FileOutputStream("B-small-attempt0.out")) );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream output = new BufferedOutputStream(System.out);
		StringBuilder strbldr = new StringBuilder(15000);
		int tcases = Integer.parseInt(br.readLine());
		DecimalFormat df = new DecimalFormat("#.0000000");
		int k=0;
		while (k++!=tcases) 
		{
			StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());
			double C=Double.parseDouble(stringTokenizer.nextToken());
			double F=Double.parseDouble(stringTokenizer.nextToken());
			double X=Double.parseDouble(stringTokenizer.nextToken());
			double r=2,t=0;
			while(X/r>X/(r+F)+C/r)
			{
				t=t+C/r;
				r=r+F;
			}
			strbldr.append("Case #").append(k).append(": ").append(df.format(t+(X/r))).append("\n");
		}
		output.write(strbldr.toString().getBytes());
		output.flush();
		output.close();
	}
	
}
