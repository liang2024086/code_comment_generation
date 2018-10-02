package methodEmbedding.Counting_Sheep.S.LYD1571;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingSheep {
	static BufferedReader bufferedReader;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException
	{
		int T,y,N,j,bi;
		String filename= "A-small-attempt5.in";
		String writerfile = "Output.txt";
		 bw = new BufferedWriter(new FileWriter(writerfile));
		bufferedReader = new BufferedReader(new FileReader(filename));
		T = Integer.parseInt(bufferedReader.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean check=false;
		for(int i=1; i<=T;i++)
		{	
			
			arr.clear();
			N=Integer.parseInt(bufferedReader.readLine());
				check=false;
			if(N==0||N>200)
			{
				check=true;
			}
			
			j=2;
			int Nb= N;
			while(!check)
			{
				
				int x=N;
				while(x>0)
					{
						y=x%10;
						x=x/10;
						if(!arr.contains(y))
						{
							arr.add(y);
						}
						
					}
				if(arr.size()==10)
				{
					check=true;
				}
				
				else{
					N=Nb*j;
					j++;
					}
				
			}
			if(Nb==0)
			{
				bw.write("Case #" +i+": INSOMNIA");
				bw.newLine();
				bw.flush();
			}
			else if(Nb>200)
			{
				bw.write("Case #" +i+": ");
				bw.newLine();
				bw.flush();
			}
			else {
				bw.write("Case #" +i+": "+N);
				bw.newLine();
				bw.flush();
			}
			
		}
	}
	
}
