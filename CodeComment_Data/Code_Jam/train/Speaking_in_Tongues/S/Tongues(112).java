package methodEmbedding.Speaking_in_Tongues.S.LYD423;

import java.io.*;
public class Tongues {
	static String cod = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
	static String src = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
	public static void main(String[] args) throws IOException	
	{
		BufferedReader in = new BufferedReader(new FileReader("input.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		int nc = Integer.parseInt(in.readLine().trim());
		String line = "";		
		for (int z=1; z<=nc; z++)
		{
			line = in.readLine();
			int L = line.length();
			char[] arr = new char[L];
			for (int i =0 ; i< L; i++)
			{
				
				if (!Character.isLetter(line.charAt(i))) arr[i] = line.charAt(i);
				else
				{
					if (line.charAt(i)=='q')arr[i] = 'z';					
					else if (line.charAt(i)=='z')arr[i] = 'q';					
					else arr[i] = src.charAt(cod.indexOf(line.charAt(i)));					
				}				
			}
			out.println(String.format("Case #%d: %s", z,new String(arr)));
		}
		out.close();
	}
}
