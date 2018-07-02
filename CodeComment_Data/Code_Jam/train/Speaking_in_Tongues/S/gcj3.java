package methodEmbedding.Speaking_in_Tongues.S.LYD786;

import java.util.*;
import java.io.*;

class gcj3{
	public static void main(String[] args) throws IOException{
		BufferedReader inp = new BufferedReader(new FileReader("inp.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		int test = Integer.parseInt(inp.readLine());
		int p = 1;
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		map.put('y','a');
		map.put('e','o');
		map.put('q','z');
		map.put('j','u');
		map.put('p','r');
		map.put('m','l');
		map.put('s','n');
		map.put('l','g');
		map.put('c','e');
		map.put('k','i');
		map.put('d','s');
		map.put('x','m');
		map.put('v','p');
		map.put('n','b');
		map.put('r','t');
		map.put('i','d');
		map.put('w','f');
		map.put('u','j');
		map.put('o','k');
		map.put('z','q');
		map.put('g','v');
		map.put('t','w');
		map.put('h','x');
		map.put('a','y');
		map.put('f','c');
		map.put('b','h');
		map.put(' ',' ');
		
		while(test>0){
			String in = inp.readLine();
			StringBuffer s = new StringBuffer(in);
			int i = 0;
			while(i<in.length()){
				s.setCharAt(i,map.get(in.charAt(i)));
				i++;
			}
			out.write("Case #"+p+": "+s+"\n");
		//	System.out.println(s);
			test--;
			p++;
		}
		out.close();
	}
}
			
