package methodEmbedding.Revenge_of_the_Pancakes.S.LYD448;


import java.util.ArrayList;
import java.util.Scanner;

public class code_jam_02 {

	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);
		int size_pancake_string = 1;
		int case_number = in.nextInt();
		ArrayList<String> output = new ArrayList<String>();

		for (int i = 0; i < case_number; i++) {
			
			String pancake_string = in.next();
			size_pancake_string = pancake_string.length();
			int[] array_pancake_string = new int[size_pancake_string];
			int index =0;
			
			for (char character:pancake_string.toCharArray())
			{
				if(character=='-')
				{
					array_pancake_string[index]=0;
				}
				else
				{
					array_pancake_string[index]=1;
				}
				index++;
			}
			int flip_times = 0;
			for(int j = size_pancake_string-1;j>=0;j--)
			{
				if(array_pancake_string[j]==1)
				{
					continue;
				}
				else
				{
					flip_times++;
					
					for(int flip_index_from = j;flip_index_from>=0;flip_index_from--)
					{
						if(array_pancake_string[flip_index_from]==0)
						{
							array_pancake_string[flip_index_from] = 1;
						}
						else
						{
							array_pancake_string[flip_index_from] = 0;
						}
					}
				}
			}
			
			output.add(Integer.toString(flip_times));
		}
		
		int output_index=1;
		for(String output_string :output)
		{
			System.out.println("Case #"+output_index+": "+output_string);
			output_index++;
		}
	}
}
