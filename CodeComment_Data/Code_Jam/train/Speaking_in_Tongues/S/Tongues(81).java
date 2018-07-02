package methodEmbedding.Speaking_in_Tongues.S.LYD25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;






public class Tongues {
	public static char [] map = new char []{
		'y',//a
		'h',//b
		'e',//c
		's',//d
		'o',//e
		'c',//f
		'v',//g
		'x',//h
		'd',//i
		'u',//j
		'i',//k
		'g',//l
		'l',//m
		'b',//n
		'k',//o
		'r',//p
		'z',//q
		't',//r
		'n',//s
		'w',//t
		'j',//u
		'p',//v
		'f',//w
		'm',//x
		'a',//y
		'q',//z
		 
	};

	 

	static String inner = "input.in";
	static Scanner scan;
	public static void main (String[]args) throws IOException
	{
		File f = new File (inner);
		File out = new File("output.out");
		FileWriter wr; 
		wr = new FileWriter(out); 
		scan = new Scanner(f);
		 
		int t = scan.nextInt();
		scan.nextLine();
		String g ="";
		for(int i = 0 ;i < t ; i++)
		{
			String s = scan.nextLine();
			 g = "Case #"+ (i+1)+": ";
			for(int j = 0 ;j < s.length() ; j++){ 
				try{g+=map[s.charAt(j)-97];}
				catch(Exception e)
				{g+=" ";} 
			}
			wr.write(g+"\n");
		}
		 wr.flush();
	}
}
