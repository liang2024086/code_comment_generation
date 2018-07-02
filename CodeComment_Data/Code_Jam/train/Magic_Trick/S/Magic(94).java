package methodEmbedding.Magic_Trick.S.LYD1517;

import java.io.*;

public class Magic
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter writer = new PrintWriter("output.txt","UTF-8");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		int t = Integer.parseInt(br.readLine());
		for(int x = 0;x<t;x++)
		{
			String[] cards1 = new String[4];
			String[] cards2 = new String[4];
			int c = Integer.parseInt(br.readLine());
			for(int y = 0;y<4;y++)
			{
				if(c == (y+1))
				{
					cards1 = br.readLine().split(" ");
				}
				else
				{
					br.readLine();
				}
			}
			c = Integer.parseInt(br.readLine());
			for(int y = 0;y<4;y++)
			{
				if(c == (y+1))
				{
					cards2 = br.readLine().split(" ");
				}
				else
				{
					br.readLine();
				}
			}

			String card = "0";
			int count = 0;
			for(int y = 0;y<4;y++)
			{
				for(int z = 0;z < 4;z++)
				{
					if(cards1[y].equals(cards2[z]))
					{
						card = cards1[y];
						count++;
					}
				}
			}

			String out = "Case #"+(x+1)+": ";
			if(count == 1)
			{
				out += card;
				System.out.println(card);
			}
			else if(count>1)
			{
				out += "Bad magician!";
				System.out.println("Bad magician!");
			}
			else
			{
				out += "Volunteer cheated!";
				System.out.println("Volunteer cheated!");
			}
			writer.println(out);
		}
		writer.close();
	}
}
