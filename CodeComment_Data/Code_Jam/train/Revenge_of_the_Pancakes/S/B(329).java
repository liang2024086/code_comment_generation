package methodEmbedding.Revenge_of_the_Pancakes.S.LYD188;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
		{
			int nb_cases = Integer.parseInt(in.readLine());
			
			for(int icase = 0; icase < nb_cases; icase++)
			{
				// read input
				String stack = in.readLine();
				
				int nb_switches = 0;
				for(int i = 0; i+1 < stack.length(); i++)
					if(stack.charAt(i) != stack.charAt(i+1))
						nb_switches++;
				if(stack.charAt(stack.length()-1) == '-')
					nb_switches++;
				
				// write output
				out.write("Case #"+(icase+1)+": "+nb_switches+"\n");
			}
		}
		out.close();
		in.close();
	}
}
