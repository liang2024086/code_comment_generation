package methodEmbedding.Speaking_in_Tongues.S.LYD521;



import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class StoreCredit {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt1.in")));
		PrintWriter out = new PrintWriter(new File("out.out"));
		StringBuilder resultat =new StringBuilder("");
		
		
		HashMap<Character, Character> map = new HashMap<Character, Character>(); 
		map.put(' ',' ');
		map.put('a','y');
		map.put('b','h');
		map.put('c','e');
		map.put('d','s');
		map.put('e','o');
		map.put('f','c');
		map.put('g','v');
		map.put('h','x');
		map.put('i','d');
		map.put('j','u');
		map.put('k','i');
		map.put('l','g');
		map.put('m','l');
		map.put('n','b');
		map.put('o','k');
		map.put('p','r');
		map.put('q','z');
		map.put('r','t');
		map.put('s','n');
		map.put('t','w');
		map.put('u','j');
		map.put('v','p');
		map.put('w','f');
		map.put('x','m');
		map.put('y','a');
		map.put('z','q');
		
		
		
		String line = br.readLine();
		int n= Integer.parseInt(line);
		
		
		
		for (int i = 0; i < n; i++) {
			
			if(i!=0)
				resultat.append("\n");
			
			line = br.readLine();
			StringBuffer sb = new StringBuffer();
			
			for (int j = 0; j < line.length(); j++) {
				sb.append(map.get(line.charAt(j)));
			}
			
			resultat.append("Case #"+(i+1)+": "+sb);
			
		}
		
		
		out.print(resultat);
		out.close();
	}

}
