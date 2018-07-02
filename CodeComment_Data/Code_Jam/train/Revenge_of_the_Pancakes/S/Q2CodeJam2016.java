package methodEmbedding.Revenge_of_the_Pancakes.S.LYD79;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q2CodeJam2016
{

	public static void main(String[] args) throws Exception
	{

		 BufferedReader br = new BufferedReader(new FileReader(new File(
		 "C:\\Users\\Chintan Trivedi\\Downloads\\B-small-attempt0.in")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int j = 1; j <= T; j++)
		{

			String line = br.readLine();
			int count = 0;
			char previous = line.charAt(0);
			int index = 1;
			for (char c : line.toCharArray())
			{
				if (index == 1)
				{
					index++;
					continue;
				}
				
				if (previous != c)
					count++;

				previous = c;
				index++;
			}

			if (previous == '-')
				count++;

			System.out.println("Case #" + j + ": " + count);
		}

	}
}
