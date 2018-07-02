package methodEmbedding.Counting_Sheep.S.LYD153;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{
	
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = input.nextInt();
		for (int i = 0; i<N; i ++)
		{
			List<Integer> out= new ArrayList<>(10);
			String start_value = input.next();
			int old = Integer.parseInt(start_value);
			int new_val = old;
			if(Integer.parseInt(start_value)==0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else
			{
			while (out.size()!=10)
			{
			for( int l = 0 ; l< start_value.length(); l++)
			{
				int val = Integer.parseInt(String.valueOf(start_value.charAt(l)));
				
				if(!out.contains(val))
				{
					out.add(val);
				}
			}
			if(out.size()<10)
			{new_val += old;
			start_value = String.valueOf(new_val);
			}
			}
			System.out.println("Case #"+(i+1)+": "+Integer.parseInt(start_value));
			}
		}
	}	
}
