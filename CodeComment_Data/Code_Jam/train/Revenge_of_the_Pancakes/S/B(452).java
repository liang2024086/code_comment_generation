package methodEmbedding.Revenge_of_the_Pancakes.S.LYD343;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class B {

	public final static String input = "F:\\GoogleCodeJam\\B-small-attempt0.in";
	public final static String output = "F:\\workspace\\GoggleCodeJam\\src\\output.txt";
	
	//public final static String input = "F:\\workspace\\GoggleCodeJam\\src\\test.txt";
	
	
	public static void main(String[] args) throws IOException
	{
		try
		(
			InputStream fis = new FileInputStream(input);
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
				
			OutputStream fos = new FileOutputStream(output);
			OutputStreamWriter osr = new OutputStreamWriter(fos, Charset.forName("UTF-8"));
		    BufferedWriter bw = new BufferedWriter(osr);
		)
		{
			int T = Integer.parseInt(br.readLine());
			
			for (int t = 1; t <= T; t++)
			{
				char[] str = br.readLine().toCharArray();
				
				char curr = str[0];
				int cnt = 1;
				for (int i = 1; i < str.length; i++)
				{
					if (str[i] == curr)
						continue;
					
					curr = str[i];
					cnt++;
				}
				if (curr == '+')
					cnt--;
				
				bw.write("Case #" + t + ":");
				bw.write(" " + cnt);
				bw.write("\n");
			}
			
			
		}
	}
}
