package methodEmbedding.Speaking_in_Tongues.S.LYD645;

import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.*;

public class SpeakingInTongues{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
		map.put(' ', ' ');
		int i = Integer.parseInt(br.readLine());
		for(int j=0; j<i; j++){
			String s = br.readLine();
			out.printf("Case #%d: ", j+1);
			for(int k=0; k<s.length(); k++){
				out.print(map.get(s.charAt(k)));
			}
			out.println();
		}
	}
}
