package methodEmbedding.Standing_Ovation.S.LYD1174;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.in"));
		StringBuilder out = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		Long start = System.currentTimeMillis();
		for(int t=0; t<T; t++)
		{
			String[] line = in.readLine().split(" ");
			int Smax = Integer.parseInt(line[0]);
			char[] chars = line[1].toCharArray();
			int[] Svalues = new int[Smax+1];
			int[] DPsum = new int[Smax+1];
			int[] DPdif = new int[Smax+1];
			int sum = 0;
			for(int i=0; i<=Smax; i++)
			{
				Svalues[i] = Integer.parseInt(Character.toString(chars[i]));
				sum+= Svalues[i];
				DPsum[i] = sum;
			}
			
			for(int i=1; i<=Smax; i++)
			{
				DPdif[i] = Math.max(0, i-DPsum[i-1]);
			}
			int total = 0;
			for(int i=1; i<=Smax; i++)
			{
				if(DPdif[i]-total>0)
				{
					total+=DPdif[i]-total;					
				}
			}
			
			out.append("Case #");
			out.append((t+1));
			out.append(": ");
			out.append(total);
			out.append("\r\n");
		}
		BufferedWriter fOut = new BufferedWriter(new FileWriter("output.txt"));
		fOut.write(out.toString());
		fOut.close();
		Long end = System.currentTimeMillis();
		System.out.println("Time: " + (end-start));
		
	}

}
