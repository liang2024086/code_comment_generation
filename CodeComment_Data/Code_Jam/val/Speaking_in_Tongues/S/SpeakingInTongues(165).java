package methodEmbedding.Speaking_in_Tongues.S.LYD973;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class SpeakingInTongues {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
		BufferedWriter out = new BufferedWriter(new FileWriter("SpeakingInTongues.txt"));
		int cases = Integer.parseInt(reader.readLine());
		String chars = "yhesocvxduiglbkrztnwjpfmaq ";
		
		for(int i=1; i <= cases; i++)
		{
			String line = reader.readLine();
			String temp = "";
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) == ' ')
					temp += " ";
				else
					temp += chars.charAt(line.charAt(j)- 'a');
				
			}
			System.out.print("Case #" + i+ ": " + temp+"\n");
			out.write("Case #" + i+ ": " + temp+"\n");
		}
		out.close();
		
		
		/*HashMap<String, String> map = new HashMap<String, String>();

		String[] input = {
				"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv",
				"abcdefghijklmnopqrstuvwxyz"
		};
		String[] output = {
				"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"
		};

		for(int i =0; i< 3; i++)
		{
			for(int j=0; j< input[i].length(); j++) {
				if(!map.containsKey(input[i].charAt(j)+""))
					map.put(input[i].charAt(j)+"", output[i].charAt(j)+"");
			}
		}
		
		for(int i =0; i< 4; i++)
		{
			System.out.println(input[i]);
			for(int j=0; j< input[i].length(); j++) {
				if(map.containsKey(input[i].charAt(j)+""))
					System.out.print(map.get(input[i].charAt(j)+""));
				else
					System.out.print("-");
			}
			System.out.println();
		}
		String temp = "";
		System.out.println();
		for(int j=0; j< input[3].length(); j++) {
			if(map.containsKey(input[3].charAt(j)+""))
				temp +=map.get(input[3].charAt(j)+"");
		}
		char[] test = temp.toCharArray();
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));*/
		//System.out.println(test.toString());
		
	}
}
