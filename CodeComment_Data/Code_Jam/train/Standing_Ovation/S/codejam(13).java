package methodEmbedding.Standing_Ovation.S.LYD822;

import java.io.*;

public class codejam
{
	public static void main(String[] args)
	{
		int T,Sm,j=0;
		String s;
		try
		{
			File f = new File("A-small-attempt2.in");	
			File out = new File("out.txt");
			
			FileWriter writer = new FileWriter(out); 
			FileInputStream fis = new FileInputStream(f);
	 		
			//Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 
			String line = null;
			while ((line = br.readLine()) != null) 
			{
				int max;
				int res = 0,count = 0;
				if(j == 0)
				{
					T = Integer.parseInt(line);
					j++;
					continue;
				}
				String[] str = line.split(" ");
				Sm = Integer.parseInt(str[0]);
				s = str[1];
				max = Integer.parseInt(s.charAt(s.length()-1)+"");
				res += Integer.parseInt(s.charAt(0)+"");
				for(int i=1;i<s.length();i++)
				{
					if(s.charAt(i) == '0')
						continue;
					if(res >= i)
						res += Integer.parseInt(s.charAt(i)+"");
					else
					{
						count += i-res;
						res += Integer.parseInt(s.charAt(i)+"")+count;
					}	
				}
				writer.write("Case #"+j+": "+count+"\n");
				writer.flush();
				j++;
			}
		 	writer.close();
			br.close();				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

