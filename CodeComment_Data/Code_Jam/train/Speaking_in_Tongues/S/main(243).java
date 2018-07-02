package methodEmbedding.Speaking_in_Tongues.S.LYD171;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import com.google.common.collect.Maps;

public class main {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
		Map<Character,Character> decode = Maps.newHashMap();
		decode.put('a', 'y');
		decode.put('b', 'h');
		decode.put('c', 'e');
		decode.put('d', 's');
		decode.put('e', 'o');
		decode.put('f', 'c');
		decode.put('g', 'v');
		decode.put('h', 'x');
		decode.put('i', 'd');
		decode.put('j', 'u');
		decode.put('k', 'i');
		decode.put('l', 'g');
		decode.put('m', 'l');
		decode.put('n', 'b');
		decode.put('o', 'k');
		decode.put('p', 'r');
		decode.put('q', 'z');
		decode.put('r', 't');
		decode.put('s', 'n');
		decode.put('t', 'w');
		decode.put('u', 'j');
		decode.put('v', 'p');
		decode.put('w', 'f');
		decode.put('x', 'm');
		decode.put('y', 'a');
		decode.put('z', 'q');
		decode.put(' ', ' ');
		
		String firstLine = (br.readLine()).trim();
		Integer numLines = new Integer(firstLine);
		Integer i;
		for(i=1;i<=numLines;i++){
			
			bw.write("Case #"+i+": ");
			String line = (br.readLine()).trim();
			for(Character c:line.toCharArray()){
				bw.write(decode.get(c));
			}
			bw.newLine();	
		}		
		bw.close();
	}
}
