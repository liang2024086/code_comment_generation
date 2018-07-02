package methodEmbedding.Speaking_in_Tongues.S.LYD99;

import java.io.*;
import java.util.*;
public class A{
	public static char[] map = new char[26];
	public static void main(String[] args){
	  try{
		map[0] = 'y';
		map[1] = 'h';
		map[2] = 'e';
		map[3] = 's';
		map[4] = 'o'; //e
		map[5] = 'c';
		map[6] = 'v';
		map[7] = 'x';
		map[8] = 'd';
		map[9] = 'u'; //j
		map[10] = 'i';
		map[11] = 'g';
		map[12] = 'l';
		map[13] = 'b';
		map[14] = 'k'; //o
		map[15] = 'r';
		map[16] = 'z';
		map[17] = 't';
		map[18] = 'n';
		map[19] = 'w'; //t
		map[20] = 'j';
		map[21] = 'p';
		map[22] = 'f'; //w
		map[23] = 'm';
		map[24] = 'a';
		map[25] = 'q';
		
		String inputFile = "A-small-attempt0.in";
		String outputFile = "A-small-attempt0.out";
		FileReader frStream = new FileReader( inputFile );
        BufferedReader brStream = new BufferedReader( frStream );
        FileWriter fwStream = new FileWriter( outputFile );
        BufferedWriter bwStream = new BufferedWriter( fwStream );
        PrintWriter pwStream = new PrintWriter( bwStream );
		String inputLine = brStream.readLine();
		int numCase = Integer.parseInt(inputLine);
		for(int i = 0; i < numCase; i++){
			String answer = "";
			String input = brStream.readLine();
			for(int j = 0 ; j < input.length(); j++){
				if(input.charAt(j) != ' ')
				answer = answer + map[(int) input.charAt(j) - 97];
				else answer = answer + " ";
			}
			pwStream.print("Case #"+(i+1)+ ": ");
			pwStream.print(answer);
			pwStream.println();
		}
		pwStream.close();
		brStream.close();
	  }
	  catch(Exception e){e.printStackTrace();}
	}
}
