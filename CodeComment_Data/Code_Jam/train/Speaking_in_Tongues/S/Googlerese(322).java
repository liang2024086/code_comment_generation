package methodEmbedding.Speaking_in_Tongues.S.LYD1588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Googlerese {

	final static String alpha =
		"abcdefghijklmnopqrstuvwxyz";
	
	final static String trans =
		"yhesocvxduiglbkrztnwjpfmaq";
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++)
		{
			StringBuilder sb = new StringBuilder();
			String input = br.readLine();
			for(int j = 0; j < input.length(); j++)
			{
				if(input.charAt(j) == ' ')
				{
					sb.append(" ");
				} else {
					sb.append(trans.charAt(input.charAt(j)-'a'));
				}
			}
			System.out.println("Case #" + (i+1) + ": " + sb);
		}

	}

}
