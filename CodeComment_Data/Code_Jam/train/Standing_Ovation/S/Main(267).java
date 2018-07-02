package methodEmbedding.Standing_Ovation.S.LYD1602;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try
		{
		FileReader f=new FileReader("temp.txt");
		BufferedReader b=new BufferedReader(f);
		int count,add=0;
		
		int t=Integer.parseInt(b.readLine().trim());
		
		for(int i=0;i<t;i++)
		{
			count=0;
			add=0;
			String line=b.readLine().trim();
			String aa[]=line.split(" ");
			
			int n1=Integer.parseInt(aa[0]);
			for(int j=0;j<=n1;j++)
			{
				int num=(Integer.parseInt(String.valueOf(aa[1].charAt(j))));
				count+=num;
				
				if(count<(j+1))
				{	add+=(j+1-count);
						count+=(j+1-count);
				}
				
			}
			System.out.println("Case #"+(i+1)+": "+add);
		}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("ERROR");
		}
	}

}
