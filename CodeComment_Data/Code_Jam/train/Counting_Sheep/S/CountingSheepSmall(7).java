package methodEmbedding.Counting_Sheep.S.LYD406;


import java.util.ArrayList;
import java.util.Scanner;

public class CountingSheepSmall
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i = 1; i <= t; i++)
		{
			ArrayList<String> arr = new ArrayList<String>();
			
			int n = input.nextInt();
			
			if(n != 0)
			{				
				int m = 0;
				
				while(!(arr.contains("1") && arr.contains("2") && arr.contains("3") && arr.contains("4") && arr.contains("5") &&
						arr.contains("6") && arr.contains("7") && arr.contains("8") && arr.contains("9") && arr.contains("0")))
				{
					m += n;
					String ms = Integer.toString(m);
					
					for(int j = 0; j < ms.length(); j++)
					{
						arr.add(ms.substring(j, j+1));			
					}
				}
				
				System.out.println("Case #" + i + ": " + m);
			}
			else
			{
				System.out.println("Case #" + i + ": " + "INSOMNIA");
			}
		}
		input.close();
	}
}
