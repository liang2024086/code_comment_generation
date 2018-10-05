package methodEmbedding.Speaking_in_Tongues.S.LYD498;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class SpeakingInTongues {
	
	public static void main(String[] args) throws IOException{
		FileReader inf = new FileReader("data/A-small.in"); 
		BufferedReader in = new BufferedReader(inf); 
		FileWriter outf = new FileWriter("result/A-small.out");  
		BufferedWriter out = new BufferedWriter(outf);  
		int numCases = Integer.parseInt(in.readLine());  
		Character[] map  = {'y','h','e', 's', 'o', 'c', 'v','x', 'd', 'u',
				'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 
				'f', 'm', 'a', 'q'};
 
	
		for(int index = 1; index <=numCases; index++)
		{
			String line = in.readLine();
			String result = "";
			for(int i = 0; i < line.length();i++)
			{
				if(line.charAt(i)==' ')
				{
					result += ' ';
				}
				else
				{
					result += map[line.charAt(i)-'a'];
				}
			}
			result.trim();
			System.out.println("Case #"+index+":"+" "+result);
			out.write("Case #"+index+":"+" "+result);
			if(index < numCases)
			{
				out.newLine();
			}
			out.flush();
		}
	}

}
