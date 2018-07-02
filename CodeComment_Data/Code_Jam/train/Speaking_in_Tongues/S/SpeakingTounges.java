package methodEmbedding.Speaking_in_Tongues.S.LYD525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class SpeakingTounges {

	public static void main(String args[]) throws Exception{
		HashMap<Character,Character> trans = new HashMap<Character,Character>();
		trans.put('a', 'y');
		trans.put('b', 'h');
		trans.put('c', 'e');
		trans.put('d', 's');
		trans.put('e', 'o');
		trans.put('f', 'c');
		trans.put('g', 'v');
		trans.put('h', 'x');
		trans.put('i', 'd');
		trans.put('j', 'u');
		trans.put('k', 'i');
		trans.put('l', 'g');
		trans.put('m', 'l');
		trans.put('n', 'b');
		trans.put('o', 'k');
		trans.put('p', 'r');
		trans.put('q', 'z');
		trans.put('r', 't');
		trans.put('s', 'n');
		trans.put('t', 'w');
		trans.put('u', 'j');
		trans.put('v', 'p');
		trans.put('w', 'f');
		trans.put('x', 'm');
		trans.put('y', 'a');
		trans.put('z', 'q');
		trans.put(' ', ' ');
		
		BufferedReader br =	new BufferedReader(new FileReader("/Users/ravipalacherla/Documents/workspace/CodeJam/src/input.txt"));
		int T = Integer.parseInt(br.readLine());
		String line="";  int j=1;
		while((line = br.readLine()) != null) {
			System.out.print("Case #"+j+": ");
			for(int i= 0;i<line.length();i++) {
				System.out.print(trans.get(line.charAt(i)));
			}
			System.out.println();
			j++;
		}
	}

}
