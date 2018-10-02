package methodEmbedding.Speaking_in_Tongues.S.LYD1248;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class sit {	
	static Hashtable hash;
	public static void main(String[] args) throws IOException {
		hash= new Hashtable();hash.put(' ', ' ');hash.put('z', 'q');hash.put('q', 'z');hash.put('i', 'd');hash.put('x', 'm');hash.put('g', 'v');hash.put('l', 'g');hash.put('u', 'j');hash.put('o', 'k');hash.put('a', 'y');hash.put('a', 'y');hash.put('b', 'h');hash.put('c', 'e');hash.put('d', 's');hash.put('e', 'o');hash.put('f', 'c');hash.put('h', 'x');hash.put('j', 'u');hash.put('k', 'i');hash.put('m', 'l');hash.put('n', 'b');hash.put('r', 't');hash.put('s', 'n');hash.put('p', 'r');hash.put('t', 'w');hash.put('v', 'p');hash.put('w', 'f');hash.put('y', 'a');
		BufferedReader bd= new BufferedReader(new InputStreamReader(System.in));
		int li= Integer.parseInt(bd.readLine());
		for (int i = 1; i <=li; i++) {
			String cadena=bd.readLine();
			String result="Case #"+i+": ";
				for (int i2 = 0; i2 < cadena.length(); i2++) {					
					
					try {
						result+=(char) hash.get(cadena.charAt(i2));
					} catch (Exception e) {
						System.out.println(cadena.charAt(i2));
					}			
				}
				System.out.println(result);				
		}		
	}	
}
 
