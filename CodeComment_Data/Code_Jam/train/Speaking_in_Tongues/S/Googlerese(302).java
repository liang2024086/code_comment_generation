package methodEmbedding.Speaking_in_Tongues.S.LYD1126;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Googlerese {
	public static void main(String[] args) throws Exception {
		Map<Character,Character> map = new HashMap<Character, Character>();
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
		map.put('y','a');
		map.put('x','m');
		map.put('z','q');

		
		File input = new File("A-small-attempt0.in");
		BufferedReader in = new BufferedReader(new FileReader(input));

		File output = new File("1.out");
		BufferedWriter out = new BufferedWriter(new FileWriter(output));

		// parse input
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++) {
			String str = in.readLine();
			out.write("Case #"+(i+1)+": ");
			for(int j=0; j<str.length(); j++) {
				if(map.containsKey(str.charAt(j)))
					out.write(map.get(str.charAt(j)));
				else
					out.write(str.charAt(j));
			}
			out.write('\n');
		}
		out.flush();
		out.close();
		in.close();
//		Map<Character,Character> map = new HashMap<Character, Character>();
//		String[] encode = {
//				"ejp mysljylc kd kxveddknmc re jsicpdrysi",
//				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
//				"de kr kd eoya kw aej tysr re ujdr lkgc jv",
//				"y qee"
//		};
//		
//		String[] decode = {
//				"our language is impossible to understand",
//				"there are twenty six factorial possibilities",
//				"so it is okay if you want to just give up",
//				"a zoo"
//		};
//		
//		List<String> list = new ArrayList<String>();
//		for(int i = 0; i<encode.length; i++) {
//			for(int j=0;j<encode[i].length();j++) {
//				if(encode[i].charAt(j) != ' '){
//					map.put(encode[i].charAt(j), decode[i].charAt(j));
//				}
//			}
//		}
//		for(Character en : map.keySet()) {
//			System.out.println("map.put('"+en+"','"+map.get(en)+"');");
//		}
//		System.out.println("map.put('z','q');");
	}
}
