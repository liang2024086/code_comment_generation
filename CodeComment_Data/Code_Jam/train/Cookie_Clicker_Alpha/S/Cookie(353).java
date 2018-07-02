package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1235;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Cookie {
	public static void main(String[] args) throws IOException{
		BufferedReader buf =  new BufferedReader(new FileReader("Cookies.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("CookiesOut.txt"));
		int t = Integer.parseInt(buf.readLine());
		for(int i = 0; i < t; i++){
			String[] s = buf.readLine().split(" ");
			double c = Double.parseDouble(s[0]);
			double f = Double.parseDouble(s[1]);
			double x = Double.parseDouble(s[2]);
			double p = 2;
			double time = 0;
			while(x/p > c/p + x/(p+f)){
				//System.out.println(c/p);
				time = time + c/p;
				p = p + f;
			}
			time = time + x/p;
			out.println("Case #" + (i + 1) + ": " + time);
		}
		out.close();
	}
}
