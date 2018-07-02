package methodEmbedding.Counting_Sheep.S.LYD541;

import java.io.*;
import java.util.*;
public class P1 {

	public static void main (String[] args) throws Exception
	{
		int counter =0; 
		BufferedReader in = new BufferedReader(new FileReader("in.in"));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int t = Integer.parseInt(in.readLine());
		for( int i = 1; i <=t;i++)
		{
			ArrayList<String> numbers = new ArrayList<String>(); 
			int n = Integer.parseInt(in.readLine());
			if(n == 0)
				out.println("Case #"+ i +": " +"INSOMNIA");
			else
			{
				counter = 1;
				while(true)
				{
					System.out.println(n);
					String temp = Integer.toString(n*counter);
					for(int z = 0; z<temp.length();z++)
					{
						if(!numbers.contains(temp.substring(z,z+1)))
						{
							numbers.add(temp.substring(z,z+1));
						}
					}
					if(numbers.size() == 10)
					{
						out.println("Case #"+ i +": " + n*counter);
						break;	
					}
					else
					counter++; 
				}

			}
		}
		out.close(); 

	}
}
