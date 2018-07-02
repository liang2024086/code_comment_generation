package methodEmbedding.Revenge_of_the_Pancakes.S.LYD743;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipPancake {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
		
		int test_no = Integer.parseInt(br.readLine());
		
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		
		for(int i = 1; i <= test_no; i++)
		{
			String pancakes = br.readLine();
			
			int maneuver = 0;
		    while(pancakes.lastIndexOf('-') >= 0)
		    {
		    	int lastindex_blank = pancakes.lastIndexOf('-');
		    	int firstindex_blank = pancakes.indexOf('-');
		    	if(firstindex_blank > 0 && firstindex_blank <= lastindex_blank)
		    	{
		    		maneuver += 1;
		    		String need_flip1 = pancakes.substring(0, firstindex_blank);
		    		String no_need_flip = pancakes.substring(firstindex_blank);
		    		StringBuilder new_need_flip1 = new StringBuilder();
		    		for(int j = need_flip1.length() - 1; j >= 0 ; j--)
		    			new_need_flip1.append('-');
		    		pancakes = new_need_flip1.toString() + no_need_flip;
		    	}
		    	
                String need_flip = pancakes.substring(0, lastindex_blank + 1);
                String no_need_flip = pancakes.substring(lastindex_blank + 1);
                StringBuilder new_need_flip = new StringBuilder();
                for(int j = need_flip.length() - 1; j >= 0 ; j--)
                {
                	if(need_flip.charAt(j) == '+')
                		new_need_flip.append('-');
                	else
                		new_need_flip.append('+');
                }
                pancakes = new_need_flip.toString() + no_need_flip;
                maneuver++;
		    }
		    out.write("Case #");
			out.write(String.valueOf(i));
			out.write(": ");
			out.write(String.valueOf(maneuver));
			out.write("\n");	
		    System.out.println(maneuver);
		}
		br.close();
		out.close();
		
	}

}
