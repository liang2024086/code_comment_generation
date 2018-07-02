package methodEmbedding.Speaking_in_Tongues.S.LYD1524;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class codeg {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("A-small-attempt0.IN"); //F:\\SJSU\\Sem-2\\275\\Project-1\\mesowest.tbl\\
		BufferedReader reader = new BufferedReader(file);
		
		FileWriter fout = new FileWriter("data.out");
		BufferedWriter writer = new BufferedWriter(fout);
				
		int T = Integer.parseInt(reader.readLine());
		
		char [] char_mapping = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		
		for(int t=0; t<T; t++)
		{	
			String s = reader.readLine();//new String("y qee");
		
			String output = "";
			String [] tokens = s.split(" ");
			for(String str : tokens)
			{
				for(int i=0; i<str.length(); i++)
				{
					output += char_mapping[(int)str.charAt(i)-97];
				}
				output+=" ";
			}
			writer.write("Case #"+(t+1)+": "+output);
			writer.newLine();
			System.out.println("Case #"+(t+1)+": "+output);
		}
		writer.close();
		fout.close();
		reader.close();
		file.close();
	}
}
