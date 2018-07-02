package methodEmbedding.Revenge_of_the_Pancakes.S.LYD483;

import java.io.*;

class CodeJam16QB 
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("D:\\B-small-attempt1 (1).in");
		File outFile = new File("D:\\B-small-attempt1 (1).out");

		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

		int testCases = Integer.parseInt(br.readLine());
		for(int t=1;t<=testCases;t++)
		{
			String pancake = br.readLine();
			int flipCount = 0;
			 for (int index = pancake.length() - 1; index >= 0; index--)
			 {
				//Check right
				if (pancake.charAt(index) == '+')
				{
					continue;
				}
				//check left
				int left;
				for (left = 0; left < index; left++)
				{
					//flip left from + to -
					if (pancake.charAt(left) == '-')
					{
						break;
					}
				}
				if (left > 0)
				{
					flipCount++;
				}
				pancake = pancake.substring(left, pancake.length());
				for (int i = 1; i <= left; i++)
				{
					pancake = "-" + pancake;
				}
				System.out.println(t+" "+left+" "+pancake);

				//build new pancake series
				String newPancake = pancake.substring(index+1,pancake.length());
				System.out.println("newPancake = "+newPancake);
				for (int i = 0; i <= index; i++)
				{
					if (pancake.charAt(i) == '+')
					{
						newPancake = "-" + newPancake;
					}
					else
					{
						newPancake = "+" + newPancake;
					}
				}
				pancake = newPancake;
				flipCount++;
				System.out.println(t+" "+flipCount+": >>> "+pancake);
			 }


			bw.write("Case #" + t +": "+flipCount+"\n");
		}
		br.close();
		bw.close();
	}
}
