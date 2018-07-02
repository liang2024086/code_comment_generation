package methodEmbedding.Counting_Sheep.S.LYD1444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Trotter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/A-small-attempt0 (1).in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("src/out.txt"));
		
		int testCases = Integer.parseInt(reader.readLine());
		
		for(int i=0;i<testCases;i++)
		{
			String num = reader.readLine();
			String num1 = num;
			
			boolean digits[] = new boolean[10];
			int n = 2;
			
			if(Integer.parseInt(num)!=0)
			while(true)
			{
				int current;
				int length = num1.length();
				
				for(int j=0;j<length;j++)
				{
					current = Integer.parseInt(""+num1.charAt(j));					
					digits[current] = true;
				}
				boolean flag = true;
				for(int k=0;k<10;k++)
				{
					if(digits[k] != true)
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					break;
				}
				else
				{
					num1 = ""+n*Integer.parseInt(num);
					n++;
				}
			}
			else
				num1 = "INSOMNIA";
			writer.write("Case #"+(i+1)+": "+num1);
			if(i!=testCases-1)
				writer.write("\n");
		}
		writer.close();
	}

}
