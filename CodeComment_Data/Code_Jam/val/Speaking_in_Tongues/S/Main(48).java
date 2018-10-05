package methodEmbedding.Speaking_in_Tongues.S.LYD368;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		String line = " ";
		String line2 = " ";
		FileReader reader = new FileReader("A-small-attempt2.in");
		Scanner in = new Scanner(reader);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		int number = 1;
		int count = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < count; i++)
		{
			line = in.nextLine();
			list.add(line);
		}
	
		while(count > 0)
		{
			char[] line1 = list.get(number - 1).toCharArray();
				
			for(int k = 0; k < line1.length; k++)
			{
				switch(line1[k])
				{
					case 'a': line1[k] = 'y'; break; 
					case 'b': line1[k] = 'h'; break;
					case 'c': line1[k] = 'e'; break;
					case 'd': line1[k] = 's'; break;
					case 'e': line1[k] = 'o'; break;
					case 'f': line1[k] = 'c'; break;
					case 'g': line1[k] = 'v'; break;
					case 'h': line1[k] = 'x'; break;
					case 'i': line1[k] = 'd'; break;
					case 'j': line1[k] = 'u'; break;
					case 'k': line1[k] = 'i'; break;
					case 'l': line1[k] = 'g'; break;
					case 'm': line1[k] = 'l'; break; 
					case 'n': line1[k] = 'b'; break;
					case 'o': line1[k] = 'k'; break;
					case 'p': line1[k] = 'r'; break;
					case 'q': line1[k] = 'z'; break; 
					case 'r': line1[k] = 't'; break;
					case 's': line1[k] = 'n'; break;
					case 't': line1[k] = 'w'; break;
					case 'u': line1[k] = 'j'; break;
					case 'v': line1[k] = 'p'; break;
					case 'w': line1[k] = 'f'; break;
					case 'x': line1[k] = 'm'; break;
					case 'y': line1[k] = 'a'; break;
					case 'z': line1[k] = 'q'; break;
					default: line1[k] = ' ';
				}
			}
			
			line2 = "Case #" + number + ": ";
			
			for(int k = 0; k < line1.length; k++)
			{
				line2 += line1[k];
			}
			
			list2.add(line2);
			count--;
			number++;
		}
		
		for(String a : list2)
			System.out.println(a);
						
	}
}
