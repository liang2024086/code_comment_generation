package methodEmbedding.Speaking_in_Tongues.S.LYD1541;

import java.util.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		Hashtable<Character,Character> table = new Hashtable<Character,Character>();
		table.put('y','a');
		table.put('n','b');
		table.put('f','c');
		table.put('z','q');
		table.put('c','e');
		table.put('w','f');
		table.put('l','g');
		table.put('b','h');
		table.put('k','i');
		table.put('u','j');
		table.put('o','k');
		table.put('m','l');
		table.put('x','m');
		table.put('s','n');
		table.put('e','o');
		table.put('v','p');
		table.put('i','d');
		table.put('p','r');
		table.put('d','s');
		table.put('r','t');
		table.put('j','u');
		table.put('g','v');
		table.put('t','w');
		table.put('h','x');
		table.put('a','y');
		table.put('q','z');


		String N = in.nextLine();
		for(int zz = 1; zz <= T;zz++){
			N = in.nextLine();
			String outLine = "";
			for(int i = 0; i < N.length();i++){
				char c = N.charAt(i);
				if(c == ' ')
					outLine += c;
				else 
					outLine += table.get(c);
					
			}
			System.out.format("Case #%d: %s\n", zz, outLine);
		}
	}
}
