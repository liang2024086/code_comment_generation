package methodEmbedding.Counting_Sheep.S.LYD118;

import java.io.*;

public class CountingSheep {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
		
		int test_no = Integer.parseInt(br.readLine());
		
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		
		for(int i = 1; i <= test_no; i++)
		{
			Long N = Long.parseLong(br.readLine());
			boolean findit = false;
			if(N == 0)
			{
				out.write("Case #");
				out.write(String.valueOf(i));
				out.write(": ");
				out.write(String.valueOf("INSOMNIA"));
				out.write("\n");
				continue;
			}
			StringBuilder tester = new StringBuilder("0000000000");
			Long original_n = N;
			
			while(N < Integer.MAX_VALUE)
			{
				//Long prev_N = N;
				String str_n = N.toString();
				
				for(int j = 0; j < str_n.length(); j++)
				{
					
					if(tester.charAt(str_n.charAt(j) - '0') == '0')
						tester.setCharAt(str_n.charAt(j) - '0', '1');
					
				}
				if(tester.toString().equals("1111111111"))
				{
					out.write("Case #");
					out.write(String.valueOf(i));
					out.write(": ");
					out.write(String.valueOf(N));
					out.write("\n");					
					findit = true;
					break;
				}
				if(findit) break;
				N += original_n;
			}
			if(N > Integer.MAX_VALUE)
			{
				out.write("Case #");
				out.write(String.valueOf(i));
				out.write(": ");
				out.write(String.valueOf("INSOMNIA"));
				out.write("\n");
			}
			
		}
		br.close();
		out.close();
		
	}

}
