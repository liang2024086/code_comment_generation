package methodEmbedding.Speaking_in_Tongues.S.LYD984;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;


public class g1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			HashMap<Character, Character> hm = new HashMap<Character, Character>();
			hm.put('y', 'a');
			hm.put('n', 'b');
			hm.put('f', 'c');
			hm.put('i', 'd');
			hm.put('c', 'e');
			hm.put('w', 'f');
			hm.put('l', 'g');
			hm.put('b', 'h');
			hm.put('k', 'i');
			hm.put('u', 'j');
			hm.put('o', 'k');
			hm.put('m', 'l');
			hm.put('x', 'm');
			hm.put('s', 'n');
			hm.put('e', 'o');
			hm.put('v', 'p');
			hm.put('z', 'q');
			hm.put('p', 'r');
			hm.put('d', 's');
			hm.put('r', 't');
			hm.put('j', 'u');
			hm.put('g', 'v');
			hm.put('t', 'w');
			hm.put('h', 'x');
			hm.put('a', 'y');
			hm.put('q', 'z');
			BufferedReader f = new BufferedReader(new FileReader("A-small-attempt2.in"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("g1.out")));
			String str;
			int T = 0;
			int c = 0;
			char[] ch;
			
			ArrayList<String> lines = new ArrayList<String>();
			while((str = f.readLine()) != null) {
				if (c == 0) {
					T = Integer.parseInt(str);
					if (T < 1 || T > 30) {
						return;
					}
				} else {
					String result = "";
//					System.out.println(str);
					ch = str.toCharArray();
					for (char item : ch) {
						if (item == ' ') {
							result += ' ';
						} else {
							if (hm.containsKey(item)) {
								result += hm.get(item);
							}
						}
					}
//					System.out.println(result);
					out.print("Case #" + (new Integer(c)).toString() + ": " + result);
					if (c != T) {
						out.println();
					}
				}
				c++;
			}	
//			System.out.println("ya");
			out.close();
			System.exit(0);  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
