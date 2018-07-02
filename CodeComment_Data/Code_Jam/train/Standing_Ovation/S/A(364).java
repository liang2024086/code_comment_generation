package methodEmbedding.Standing_Ovation.S.LYD1447;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;


public class A
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File("./input/A.txt")));
		PrintWriter writer = new PrintWriter("./output/A.txt");
		int casos = Integer.parseInt(reader.readLine());
		for(int i=1;i<=casos;i++)
		{
			String[] cont = reader.readLine().split(" ");
			int rta =0, max=Integer.parseInt(cont[0]), parados=0;
			char[] audiencia = cont[1].toCharArray();
			for(int si=0;si<audiencia.length;si++)
			{
				int temp = Math.min(si,max);
				if(parados<temp)
				{
					rta+=temp-parados;
					parados+=temp-parados;
				}
				parados+=Integer.parseInt(""+audiencia[si]);
			}
			writer.write(String.format("Case #%d: %d\n", i,rta));
			System.out.println(String.format("Case #%d: %d", i,rta));
			
		}
		reader.close();
		writer.close();
	}
}
