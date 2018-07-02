package methodEmbedding.Counting_Sheep.S.LYD1457;


import java.util.*;
import java.io.*;
public class codejam1 
{





	public static Set<Integer> valueStore;

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int Cases = input.nextInt();

		for (int i = 1; i <= Cases; i++) 
		{
			
			int value = input.nextInt();
			
			int m = 1;
			int finalResult=value;
			valueStore = new HashSet<Integer>();
			if (value == 0) 
			{
				System.out.println("case #" + i + ": INSOMNIA");
			} 
			
			else
			{

				do                       
				{

					int increment = value*m;
					finalResult=increment;
					int storeValue;
					do
					{
						storeValue = increment % 10;
						valueStore.add(storeValue);
						increment = increment / 10;
					}while(increment!=0);
					
					
				m++;}while(valueStore.size()!=10);
				
				System.out.println("case #" + i + ": "+finalResult);
				
				
				
			}
		}
	}






}
