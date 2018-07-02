package methodEmbedding.Speaking_in_Tongues.S.LYD903;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class A {
	public static void main(String[] args) throws IOException {
		
		Map<Character,Character> googlerese = new HashMap<Character, Character>(26);
		googlerese.put(' ',' ');
		googlerese.put('y','a');
		googlerese.put('n','b');
		googlerese.put('f','c');
		googlerese.put('i','d');
		googlerese.put('c','e');
		googlerese.put('w','f');
		googlerese.put('l','g');
		googlerese.put('b','h');
		googlerese.put('k','i');
		googlerese.put('u','j');
		googlerese.put('o','k');
		googlerese.put('m','l');
		googlerese.put('x','m');
		googlerese.put('s','n');
		googlerese.put('e','o');
		googlerese.put('v','p');
		googlerese.put('z','q');
		googlerese.put('p','r');
		googlerese.put('d','s');
		googlerese.put('r','t');
		googlerese.put('j','u');
		googlerese.put('g','v');
		googlerese.put('t','w');
		googlerese.put('h','x');
		googlerese.put('a','y');
		googlerese.put('q','z');
		
		int uValues = new HashSet<Character>(googlerese.values()).size();
		if(uValues != 27) 
			throw new RuntimeException("Erro1->"+uValues);
		
		int uKeys = googlerese.keySet().size();
		if(uKeys != 27) 
			throw new RuntimeException("Erro2->"+uKeys);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.valueOf(line);

		// Process which number from stdin
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			StringBuilder sb = new StringBuilder(line.length()+11);
			sb.append("Case #");
			sb.append(i+1);
			sb.append(": ");
			
			for (int j = 0; j < line.length(); j++) {
				Character f = line.charAt(j);
				Character t = googlerese.get(f);
				sb.append(t);
			}
			
			sb.append('\n');
			System.out.print(sb.toString());
		}
	}
}
