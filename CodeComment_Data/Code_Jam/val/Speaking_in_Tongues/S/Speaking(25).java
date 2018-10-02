package methodEmbedding.Speaking_in_Tongues.S.LYD948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;


public class Speaking {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		HashMap<Character,Character> ch = new HashMap<Character,Character>();
		ch.put('y','a');
		ch.put('n','b');
		ch.put('f','c');
		ch.put('i','d');
		ch.put('c','e');
		ch.put('w','f');
		ch.put('l','g');
		ch.put('b','h');
		ch.put('k','i');
		ch.put('u','j');
		ch.put('o','k');
		ch.put('m','l');
		ch.put('x','m');
		ch.put('s','n');
		ch.put('e','o');
		ch.put('v','p');
		ch.put('z','q');
		ch.put('p','r');
		ch.put('d','s');
		ch.put('r','t');
		ch.put('j','u');
		ch.put('g','v');
		ch.put('t','w');
		ch.put('h','x');
		ch.put('a','y');
		ch.put('q','z');
		
		String line = "";
		line = br.readLine();
		int number = Integer.valueOf(line);
		for(int i = 1; i<= number; i++){
			line = br.readLine();
			char[] tmp = line.toCharArray();
			char[] result = new char[tmp.length];
			for(int n =0; n <tmp.length;n++){
				if(tmp[n] != ' '){
					result[n] = ch.get(tmp[n]);
				}
				else{
					result[n] = tmp[n];
				}
			}
			bw.append("Case #"+i+": ");
			for(int n =0; n <tmp.length;n++)
				bw.append(result[n]);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
