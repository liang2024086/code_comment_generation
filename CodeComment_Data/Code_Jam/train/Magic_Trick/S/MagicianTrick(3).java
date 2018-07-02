package methodEmbedding.Magic_Trick.S.LYD1591;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicianTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/input4.txt"));
			int numTestCase = Integer.valueOf(br.readLine());
			String[] firstSet = null;
			String[] secondSet = null;
			String ans = "Volunteer cheated!";
			boolean found = false;
 
			for(int i=1; i<=numTestCase; i++)
			{
				int firstAns = Integer.valueOf(br.readLine());
				for(int j=1; j<5; j++)
				{
					if(j == firstAns)
					{
						firstSet = br.readLine().split(" ");
					}
					else
					{
						br.readLine();
					}
				}
				
				int secondAns = Integer.valueOf(br.readLine());
				for(int j=1; j<5; j++)
				{
					if(j == secondAns)
					{
						secondSet = br.readLine().split(" ");
					}
					else
					{
						br.readLine();
					}
				}
				
				for(int k=0; k<firstSet.length; k++)
				{
					for(int l=0; l<secondSet.length; l++)
					{
						if(firstSet[k].equalsIgnoreCase(secondSet[l]))
						{
							if(found)
							{
								ans = "Bad magician!";
							}
							else
							{
								found = true;
								ans = firstSet[k];								
							}
						}
					}
				}
				//Case #1: 7
				System.out.println("Case #" + i + ": " + ans);
				
				ans = "Volunteer cheated!";
				found = false;
				
				
				 
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
