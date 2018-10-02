package methodEmbedding.Standing_Ovation.S.LYD373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StandingOvation 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
		String header = br.readLine();
		System.out.println("Found "+(Integer.parseInt(header) + " instances."));
		String line = br.readLine();
		int cas = 1;
		while(line != null)
		{
			String[] array = line.split(" ");
			if(array.length == 2)
			{
				bw.write("Case #"+cas+ ": ");
				String people = array[1];
				int sum = 0;
				int recruited = 0;
				for (int i = 0; i < people.length(); i++) 
				{
					int numberShy = Character.getNumericValue(people.charAt(i));
					if(i != 0)
					{
						if(i > sum) 
						{
							int toRecruit = i - sum;
							recruited += toRecruit;
							sum += toRecruit;
						}
					}
					sum += numberShy;
				}
				bw.write(recruited+"\n");
				cas++;
			}
			line = br.readLine();
		}
		bw.close();
		br.close();
	}
}
