package methodEmbedding.Standing_Ovation.S.LYD496;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Standing_Ovation {

	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("D:/A-small-attempt0.in")));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/output.txt")));
		String line;		
		StringTokenizer tokens;
		line = in.readLine();
		int n = Integer.parseInt(line);			
		for (int i = 0; i < n; i++) 
		{
			line = in.readLine();
			tokens = new StringTokenizer(line);
			
			tokens.nextToken();
			String ovation = tokens.nextToken();				
			
			int sum = 0;
			int need = 0;
			for (int j = 0; j < ovation.length(); j++) 
			{
				int a  = Integer.parseInt(ovation.charAt(j)+"");
				if(a > 0)
				{
					if(sum >= j)
						sum += a;
					else
					{
						need += (j - sum);
						sum = j + a;
					}
				}					
			}
			out.write("Case #"+(i+1)+": "+need+"\n");			
		}
		in.close();
		out.flush();
		out.close();
		System.exit(0);

	}

}
