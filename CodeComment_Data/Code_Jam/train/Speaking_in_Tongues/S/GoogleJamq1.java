package methodEmbedding.Speaking_in_Tongues.S.LYD1173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class GoogleJamQ1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Hashtable<Character, Character> google_map = new Hashtable();  
		google_map.put('y', 'a');
		google_map.put('n', 'b');
		google_map.put('f', 'c');
		google_map.put('i', 'd');
		google_map.put('c', 'e');
		google_map.put('w', 'f');
		google_map.put('l', 'g');
		google_map.put('b', 'h');
		google_map.put('k', 'i');
		google_map.put('u', 'j');
		google_map.put('o', 'k');
		google_map.put('m', 'l');
		google_map.put('x', 'm');
		google_map.put('s', 'n');
		google_map.put('e', 'o');
		google_map.put('v', 'p');
		google_map.put('z', 'q');
		google_map.put('p', 'r');
		google_map.put('d', 's');
		google_map.put('r', 't');
		google_map.put('j', 'u');
		google_map.put('g', 'v');
		google_map.put('t', 'w');
		google_map.put('h', 'x');
		google_map.put('a', 'y');
		google_map.put('q', 'z');
		char currentChar;
		char resultChar;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int x = Integer.parseInt(input);
		char[][] resultString = new char[x][200];
		boolean isUpper = false;
		for(int i = 0; i< x; i++)
		{
			input = reader.readLine();
			for(int j = 0; j < input.length(); j++)
			{
				currentChar = input.charAt(j);
				if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z'))
				{
					if(Character.isUpperCase(currentChar))
					{
						isUpper = true;
						currentChar = Character.toLowerCase(currentChar);
					}
					resultChar = google_map.get(currentChar);
					if(isUpper)
					{
						resultChar = Character.toUpperCase(resultChar);
					}
					//System.out.println(resultChar);
				}
				else
				{
					resultChar = currentChar;
				}
				
				resultString[i][j] = resultChar;
			}
		}
		

		
		for(int i = 0; i < x; i++)
		{
			String resultOutput = new String(resultString[i]);
			System.out.println("Case #"+(i+1)+": "+resultOutput);
		}

	}

}

