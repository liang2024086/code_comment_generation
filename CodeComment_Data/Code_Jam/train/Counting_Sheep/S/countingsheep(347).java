package methodEmbedding.Counting_Sheep.S.LYD1267;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class code_jam_0 {
	
	
	
	public static void main(String[] argv)
	{
		Scanner in = new Scanner(System.in);
		int case_number = in.nextInt();
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i = 0; i<case_number;i++)
		{
			Set store_number = new HashSet();
			int N = in.nextInt();
			String num_string = String.valueOf(N);
			
			if(N==0)
			{
				output.add("INSOMNIA");
				continue;
			}
			
			for(char character:num_string.toCharArray())
			{
				store_number.add(character);
			}
			
			int flag =0;
			for (int j=2;j<1000000;j++) //assume the maximun loop is 100000
			{
				int M = N*j;
				String divide_string = String.valueOf(M);
				
				for(char character : divide_string.toCharArray())
				{
					store_number.add(character);
				}
				
				if(store_number.size()==10)
				{
					flag =1;
					output.add(Integer.toString(M));
					break;
				}
			}
			if(flag==0)
			{
				output.add("INSOMNIA");
			}
		}
		
		int count = 1;
		for(String output_result:output)
		{
			System.out.println("Case #"+count+": "+output_result);
			count++;
		}
	}
}
