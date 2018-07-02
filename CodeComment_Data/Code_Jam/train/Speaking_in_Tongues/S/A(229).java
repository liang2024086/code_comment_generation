package methodEmbedding.Speaking_in_Tongues.S.LYD1017;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;

public class A {
	
	public static void main(String args[]) throws Exception{
		//String inFile = args[0];
		
		String inFile = "A-small-attempt0.in";
		String outFile = inFile + ".out";
		
		LineNumberReader lin = new LineNumberReader(new InputStreamReader(new FileInputStream(inFile)));
		PrintWriter out = new PrintWriter(new File(outFile));
		
		Map<Character,Character> table = new Hashtable<Character,Character>();
		table.put('a', 'y');
		table.put('b', 'h');
		table.put('c', 'e');
		table.put('d', 's');
		table.put('e', 'o');
		table.put('f', 'c');
		table.put('g', 'v');
		table.put('h', 'x');
		table.put('i', 'd');
		table.put('j', 'u');
		table.put('k', 'i');
		table.put('l', 'g');
		table.put('m', 'l');
		table.put('n', 'b');
		table.put('o', 'k');
		table.put('p', 'r');
		table.put('q', 'z');
		table.put('r', 't');
		table.put('s', 'n');
		table.put('t', 'w');
		table.put('u', 'j');
		table.put('v', 'p');
		table.put('w', 'f');
		table.put('x', 'm');
		table.put('y', 'a');
		table.put('z', 'q');
		
		
		int nCase = Integer.parseInt(lin.readLine());
		
		for (int CASE = 1; CASE <= nCase; CASE++) {
			System.out.print("Case #" + CASE + ": ");
			String line = lin.readLine();
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				for (int i=0; i<token.length();i++) {
					System.out.print(table.get(token.charAt(i)));
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		lin.close();
		out.close();
	}
}
