package methodEmbedding.Standing_Ovation.S.LYD2179;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings("resource")
		BufferedReader r = new BufferedReader(new FileReader("A-small-attempt1.in"));
		BufferedWriter o = new BufferedWriter(new FileWriter("out.txt"));
		//o = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer s = new StringTokenizer(r.readLine());
		int T = Integer.parseInt(s.nextToken());
		for (int t = 0; t < T; t++) {
			s = new StringTokenizer(r.readLine());
			int m = Integer.parseInt(s.nextToken());
			String val = s.nextToken();
			int curval = 0;
			int to_add = 0;
			for (int i = 0; i <= m; i++) {
				int v = Integer.parseInt(""+val.charAt(i));
				if(v != 0 && curval < i)
				{
					to_add += i-curval;
					curval += i-curval;
				}
				curval += v;
			}
			o.write("Case #"+(t+1)+": "+to_add+"\n");
			
		}
		o.close();
	}
}
