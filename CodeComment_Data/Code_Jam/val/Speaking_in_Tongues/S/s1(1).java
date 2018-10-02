package methodEmbedding.Speaking_in_Tongues.S.LYD130;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Test {
	public static Map<Character, Character> map = new HashMap<Character, Character>();
	static{
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
		map.put(' ',' ');
	}
	public static void main(String args[]) throws Exception{
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String testC = bufferedreader.readLine();
		int testI = Integer.parseInt(testC);
		
		for(int i = 0; i < testI; ++i){
				System.out.print("Case #" + (i+1) + ": ");
				String str = bufferedreader.readLine();
				int len = str.length();
				for(int j = 0 ; j < len; ++j){
					System.out.print(map.get(str.charAt(j)));
				}
				System.out.println();
				
		}
	}
}	
