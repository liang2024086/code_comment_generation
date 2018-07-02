package methodEmbedding.Counting_Sheep.S.LYD379;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Counting_Sheep {
	
	//public final static Hashtable<String, String> table = new Hashtable<String, String>();

	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("D:/A-small-attempt0.in")));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/OUTPUT.txt")));
				
		String line = in.readLine();				
		int cases = Integer.parseInt(line);	
		int n = 0;
		boolean[] numbers = new boolean[10];
		int total = 0;
		for (int i = 0; i < cases; i++) 
		{
			line = in.readLine();
			n = Integer.parseInt(line);
			total = 0;
			if(n == 0)
				out.write("Case #"+(i+1)+": "+ "INSOMNIA" +"\n");
			else
			{
				numbers = new boolean[10];	
				int k = 1;
				while(true)
				{
					for (int j = 0; j < numbers.length; j++)
					{
						if(line.contains(j+"") && numbers[j] == false)
						{
							numbers[j] = true;
							total++;
						}
					}
					if(total == 10)
						break;
					else
					{
						k++;
						line = (n*k)+"";
					}
				}
				out.write("Case #"+(i+1)+": "+ line +"\n");
			}		
		}
		in.close();
		out.flush();
		out.close();
		System.exit(0);

	}
	
}
