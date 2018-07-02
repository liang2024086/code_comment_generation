package methodEmbedding.Speaking_in_Tongues.S.LYD355;

import java.io.*;
import java.io.InputStreamReader;
import java.util.HashMap;


public class a {

	public static void main(String[] args) throws Throwable
	{
		BufferedReader bf = new BufferedReader(new FileReader("a.txt"));
		System.setOut(new PrintStream("a.out"));
		
		HashMap<Character, Character> mapeo = new HashMap<Character, Character>();
		mapeo.put('a','y');
		mapeo.put('b','h');
		mapeo.put('c','e');
		mapeo.put('d','s');
		mapeo.put('e','o');
		mapeo.put('f','c');
		mapeo.put('g','v');
		mapeo.put('h','x');
		mapeo.put('i','d');
		mapeo.put('j','u');
		mapeo.put('k','i');
		mapeo.put('l','g');
		mapeo.put('m','l');
		mapeo.put('n','b');
		mapeo.put('o','k');
		mapeo.put('p','r');
		mapeo.put('q','z');
		mapeo.put('r','t');
		mapeo.put('s','n');
		mapeo.put('t','w');
		mapeo.put('u','j');
		mapeo.put('v','p');
		mapeo.put('w','f');
		mapeo.put('x','m');
		mapeo.put('y','a');
		mapeo.put('z','q');
		
		int casos = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < casos; i++) {
			String linea = bf.readLine();
			sb.append("Case #"+(i+1)+": ");
			for (int j = 0; j < linea.length(); j++) {
				char a = linea.charAt(j);
				if( Character.isLetter(a) )
					sb.append( mapeo.get(a));
				else
					sb.append(a);
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
