package methodEmbedding.Speaking_in_Tongues.S.LYD2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ASmall
{

	public static void main(String[] args) throws IOException
	{
		Scanner reader = new Scanner(new File("A-small-attempt0 (1).in"));
		FileOutputStream file = new FileOutputStream(new File("output"));
		FileWriter writer = new FileWriter(new File("output.out"));
		reader.nextLine();
		int n = 0 ;
		while(reader.hasNext())
		{
		String input =reader.nextLine(); 
		String output ="";
		n++ ;
		for(int i = 0 ; i < input.length() ; i++)
		{
			switch (input.charAt(i))
			{
			case 'y' : output+='a';break;
			case 'n' : output+='b';break;
			case 'f' : output+='c';break;
			case 'i' : output+='d';break;
			case 'c' : output+='e';break;
			case 'w' : output+='f';break;
			case 'l' : output+='g';break;
			case 'b' : output+='h';break;
			case 'k' : output+='i';break;
			case 'u' : output+='j';break;
			case 'o' : output+='k';break;
			case 'm' : output+='l';break;
			case 'x' : output+='m';break;
			case 's' : output+='n';break;
			case 'e' : output+='o';break;
			case 'v' : output+='p';break;
			case 'z' : output+='q';break;
			case 'p' : output+='r';break;
			case 'd' : output+='s';break;
			case 'r' : output+='t';break;
			case 'j' : output+='u';break;
			case 'g' : output+='v';break;
			case 't' : output+='w';break;
			case 'h' : output+='x';break;
			case 'a' : output+='y';break;
			case 'q' : output+='z';break;
			case ' ' : output+=' ';break;
			}
		}
		
		writer.write("Case #"+n+": "+output+"\r\n");
		}
		writer.close();
	}
}
