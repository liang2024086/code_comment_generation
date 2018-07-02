package methodEmbedding.Speaking_in_Tongues.S.LYD1563;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class A_Goglerese
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(new File("./data/A-small-attempt0.in")));
		long casos = Integer.parseInt(br.readLine());

		char[] key = "ynficwlbkuomxsevzpdrjgthaq".toCharArray();
		char[] base = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] key2 = "ynficwlbkuomxsevzpdrjgthaq".toCharArray();

		for (int i = 0; i < key.length; i++)
		{
			char keyL = base[i];
			for (int j = 0; j < key.length; j++)
			{
				if (key[j] == keyL)
				{
					key2[i] = base[j];
				}
			}
		}

		for (long caso = 1; caso <= casos; caso++)
		{
			char[] linea = br.readLine().toCharArray();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < linea.length; i++)
			{
				if (linea[i] == ' ')
				{
					sb.append(" ");
				}
				else
				{
					char letra = linea[i];

					sb.append(key2[letra - 'a']);
				}
			}

			System.out.println("Case #" + caso + ": " + sb.toString());
		}

		br.close();
	}
}
