package methodEmbedding.Standing_Ovation.S.LYD505;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Saumya Ranjan Sahu
 * Created On: Apr 10, 2015
 * 
 */
public class Contest1 {

	public static void main(String []args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no_tcs = Integer.parseInt(br.readLine());
		List<String> output = new ArrayList<String>();
		
		for(int i=1;i<=no_tcs;i++)
		{
			String []line = br.readLine().split(" ");
			int s_max = Integer.parseInt(line[0]);
			String input = line[1];
			String out = null;
			int s = 0;
			int add = 0;
			for(int j=0;j<input.length();j++)
			{
				int v = Character.getNumericValue(input.charAt(j));
				
				//when there is no one then dont do anything
				if(v == 0)
					continue;
				
				//add people when there is a shortage
				if(s<j)
				{
					add = add+(j-s);
					s+=(v+add);
				}
				else
					s+=v;
			}
			out = String.format("Case #%d: %d",i,add);
			output.add(out);
		}
		//print the output
		for(int i=0;i<output.size();i++)
		{
			System.out.println(output.get(i));
		}
	}
}

