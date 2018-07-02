package methodEmbedding.Speaking_in_Tongues.S.LYD313;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;


public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("codejama.in"));
		BufferedWriter brout=new BufferedWriter(new FileWriter("codejama.out"));
		HashMap<Character,Character> map=new HashMap<Character, Character>();
		map.put(' ', ' ');
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
		
		StringTokenizer sb=new StringTokenizer(br.readLine());
		int t=Integer.parseInt(sb.nextToken());
		for(int x=1;x<=t;x++) {
			String s=br.readLine();
			String result="";
			for(int i=0;i<s.length();i++) {
				result+=map.get(s.charAt(i));
			}
			brout.write("Case #"+x+": "+result+"\n");
		}
		brout.close();
		return;

	}
}
