package methodEmbedding.Magic_Trick.S.LYD219;

import java.util.*;
import java.io.*;
public class MagicTrick {
	public static void main(String args[])
	{
		File file = new File("input.in");
		try
		{
			InputStream input=new FileInputStream(file);
			Scanner scan=new Scanner(input);
			int index=Integer.parseInt(scan.nextLine());
			for(int i=0; i<index; i++)
			{
				int counter=0;
				int fans=0;
				int ans1=Integer.parseInt(scan.nextLine());
				int[][] set1=new int[4][4];
				for(int j=0; j<4; j++)
				{
					String line=scan.nextLine();
					for(int k=0; k<4; k++)
					{
						set1[j][k]=Integer.parseInt(line.split(" ")[k]);
					}
				}
				int ans2=Integer.parseInt(scan.nextLine());
				int set2[][]=new int[4][4];
				for(int j=0; j<4; j++)
				{
					String line=scan.nextLine();
					for(int k=0; k<4; k++)
					{
						set2[j][k]=Integer.parseInt(line.split(" ")[k]);
					}
				}
				//check for answer
				for(int j=0; j<4; j++)
				{
					for(int k=0; k<4; k++)
					{
						if(set1[ans1-1][j]==set2[ans2-1][k])
						{
							if(counter==0)
							{
								fans=set2[ans2-1][k];
							}
							counter++;
						}
					}
					//System.out.println(set1[ans1-1][j]+","+set2[ans2-1][j]);
					
				}
				if(counter==1)
				{
					System.out.println("Case #"+(i+1)+": "+fans);
				}
				else if(counter>1)
				{
					System.out.println("Case #"+(i+1)+": "+"Bad magician!");
				}
				else
				{
					System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
