package methodEmbedding.Magic_Trick.S.LYD2039;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick {
	static Scanner sc;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		int T = Integer.parseInt(in.readLine());
		//int T = 1;
		for(int t = 1; t<=T;t++)
		{
			String line = in.readLine();
			int choice = Integer.parseInt(line);
			String[] possibility = null;
			for(int i=0;i< 4;i++)
			{
				line = in.readLine();
				if(i== choice -1)
				{
					possibility = line.split("\\s");
				}
			}
			line = in.readLine();
			choice = Integer.parseInt(line);
			int found = 0; 
			String theNumber = "";
			for(int i=0;i< 4;i++)
			{
				line = in.readLine();
				if(i== choice - 1)
				{
					String[] newSelec = line.split("\\s");
					for(int j=0;j<4;j++)
					{
						for(int k=0;k<4;k++)
						{
							if(newSelec[j].equals(possibility[k]))
							{
								theNumber = newSelec[j];
								found++;
							}
						}
					}
				}
			}
			String op = "";
			if(found == 1)
			{
				op = theNumber;
			}
			else if(found == 0)
			{
				op = "Volunteer cheated!";				
			}
			else
			{
				op = "Bad magician!";
			}
			System.out.println("Case #"+t+": "+op);
		}
	}
}
