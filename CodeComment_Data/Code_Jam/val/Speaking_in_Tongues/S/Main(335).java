package methodEmbedding.Speaking_in_Tongues.S.LYD798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.HashMap;


public class Main 
{
	
	public static HashMap<Character,Character> mapp = new HashMap<Character,Character>();
	
	public static void main(String[] args) throws Exception
	{
		String str1;
		String str2;
		PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
		str1 = "ourlanguageisimpossibletounderstand";
		str2 = "ejpmysljylckdkxveddknmcrejsicpdrysi";
		for(int i=0; i<str1.length(); i++)
		{
			mapp.put(str2.charAt(i),str1.charAt(i));
		}
		str1 = "therearetwentysixfactorialpossibilities";
		str2 = "rbcpcypcrtcsradkhwyfrepkymveddknkmkrkcd";
		for(int i=0; i<str1.length(); i++)
		{
			mapp.put(str2.charAt(i),str1.charAt(i));
		}
		str1 = "soitisokayifyouwanttojustgiveupqz ";
		str2 = "dekrkdeoyakwaejtysrreujdrlkgcjvzq ";
		for(int i=0; i<str1.length(); i++)
		{
			mapp.put(str2.charAt(i),str1.charAt(i));
		}
		
		BufferedReader input = new BufferedReader(new FileReader("A-small-attempt5.in"));
		int size=Integer.parseInt(input.readLine());
		for(int i=0; i<size; i++)
		{
			writer.print("Case #"+(i+1)+": ");
			String temp = input.readLine();
			String sol = "";
			for(int j=0; j<temp.length(); j++)
			{
				sol = sol + mapp.get(temp.charAt(j));
			}
			writer.println(sol);
		}
		writer.close();
		input.close();
	}

}
