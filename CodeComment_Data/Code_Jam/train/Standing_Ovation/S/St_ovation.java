package methodEmbedding.Standing_Ovation.S.LYD1257;

import java.io.*;



public class St_ovation {
	public static void main(String[] args) throws Exception
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(b.readLine());
		int x = 1;
		File file = new File("St_ovation.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		while(t>0)
		{
			String s = b.readLine();
			String s1[] = s.split("\\s+");
			int num=0,ans=0;
			for(int i=0;i<s1[1].length();i++)
			{
				int tmp = Integer.parseInt(s1[1].substring(i, i+1));
				if(i==0)
					num+=tmp;
				else
				{
					if(tmp!=0)
					{
						if(num-i < 0)
						{
							ans += (i-num);
							num += (i-num);
						}
						num+=tmp;
					}
				}
			}
			String s2 = "Case #"+x+": "+ans;
			writer.write(s2+"\n");
			x++;
			t--;
		}
		writer.flush();
	    writer.close();
	}

}
