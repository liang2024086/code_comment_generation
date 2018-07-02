package methodEmbedding.Speaking_in_Tongues.S.LYD167;

import java.io.*;
import java.util.*;
public class SpeakinginTongues {
	public static void main(String[] args)throws IOException {
		boolean large = false;
		//large = true;
		String dir = "C://Users//Aayush//Desktop//";
		String InputFile = dir + (large ? "A-large-practice.in" : "A-small-attempt0.in");
		String OutputFile = dir + (large ? "A-large.out" : "A-small.out");
		BufferedReader in = new BufferedReader(new FileReader(InputFile));
		FileWriter fw = new FileWriter(OutputFile);
		int T = new Integer(in.readLine());
		for(int cases = 1; cases <= T; cases++){
			String s = in.readLine();
			System.out.print("Case #" + cases + ": ");
			fw.write("Case #" + cases + ": ");
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				char ch = ' ';
				switch(c){
				case 'a': ch = 'y'; break;
				case 'b': ch = 'h'; break;
				case 'c': ch = 'e'; break;
				case 'd': ch = 's'; break;
				case 'e': ch = 'o'; break;
				case 'f': ch = 'c'; break;
				case 'g': ch = 'v'; break;
				case 'h': ch = 'x'; break;
				case 'i': ch = 'd'; break;
				case 'j': ch = 'u'; break;
				case 'k': ch = 'i'; break;
				case 'l': ch = 'g'; break;
				case 'm': ch = 'l'; break;
				case 'n': ch = 'b'; break;
				case 'o': ch = 'k'; break;
				case 'p': ch = 'r'; break;
				case 'q': ch = 'z'; break;
				case 'r': ch = 't'; break;
				case 's': ch = 'n'; break;
				case 't': ch = 'w'; break;
				case 'u': ch = 'j'; break;
				case 'v': ch = 'p'; break;
				case 'w': ch = 'f'; break;
				case 'x': ch = 'm'; break;
				case 'y': ch = 'a'; break;
				case 'z': ch = 'q'; break;
				}
				System.out.print(ch);
				fw.write(ch);
			}
			System.out.println();
			fw.write("\n");
			
		}
		fw.flush();
		fw.close();
		
	}
}
