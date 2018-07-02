package methodEmbedding.Speaking_in_Tongues.S.LYD109;

import java.io.*;
import java.util.HashMap;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		HashMap<Character,Character> mapeo = new HashMap<Character, Character>();
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
		BufferedReader bf = new BufferedReader(new FileReader("A.in"));
		System.setOut(new PrintStream("A.out"));
		int N = Integer.parseInt(bf.readLine()), caso = 1;
		while(N-->0){
			String linea = bf.readLine();
			String salida = "";
			for(int i=0;i<linea.length();++i){
				if(linea.charAt(i)!=' ')
					salida += mapeo.get(linea.charAt(i));
				else
					salida += linea.charAt(i);
			}
			System.out.println("Case #"+(caso++)+": "+salida);
		}

	}

}
