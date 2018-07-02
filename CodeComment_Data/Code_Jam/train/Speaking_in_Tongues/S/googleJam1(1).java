package methodEmbedding.Speaking_in_Tongues.S.LYD1268;

import javax.swing.*;
import java.io.*;
public class googleJam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String normal[] = {"a","b","c","d","e","f","g","h",
				"i","j","k","l","m","n","o","p","q","r","s","t",
				"u","v","w","x","y","z"};
		String rese[] = {"y","n","f","i","c","w","l","b","k","u",
				"o","m","x","s","e","v","z","p","d","r","j","g","t",
				"h","a","q"};
		BufferedReader reader = null;
		PrintWriter writer = null;
		try{
			reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int numInputs = Integer.parseInt(reader.readLine());
			writer = new PrintWriter(new BufferedWriter(new FileWriter("A-small-practice.out")));
			for(int i = 0; i < numInputs; i++)
			{
				String input = reader.readLine();
				String output = "";
				output += "Case #" + (i+1) + ": ";
				while(input.length()>0)
				{
					String temp = input.substring(0, 1);
					int tempInt = -1;
					for(int k = 0; k < 26; k++)
					{
						if(temp.equals(rese[k]))
							tempInt = k;
					}
					if(tempInt == -1)
						output+=temp;
					else
						output+=normal[tempInt];
					input = input.substring(1);
				}
				writer.print(output+"\n");
				
			}
			writer.close();
			System.out.println("completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

	}
