package methodEmbedding.Revenge_of_the_Pancakes.S.LYD8;


import java.io.*;

public class App
{
	public static void main(String args[])throws IOException
	{
		FileReader fr = new FileReader("B-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("B-Small-Output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		
		int noOfTestCases = Integer.parseInt(br.readLine());
		
		
		RevengeOfPanCakes obj = new RevengeOfPanCakes();
		
		for(int i = 0; i < noOfTestCases; i++)
		{
			String g = br.readLine();
			out.println("Case #"+(i+1)+": "+obj.flip(g));
		}
		br.close();
		out.close();
		bw.close();
	}

}
