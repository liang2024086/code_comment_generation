package methodEmbedding.Speaking_in_Tongues.S.LYD990;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Scanner;


public class A {

	static HashMap<Character, Character> keys;
	public static void main(String[] args) throws Exception {
		keys = new HashMap<Character, Character>();
		keys.put('a', 'y');
		keys.put('b', 'h');
		keys.put('c', 'e');
		keys.put('d', 's');
		keys.put('e', 'o');
		keys.put('f', 'c');
		keys.put('g', 'v');
		keys.put('h', 'x');
		keys.put('i', 'd');
		keys.put('j', 'u');
		keys.put('k', 'i');
		keys.put('l', 'g');
		keys.put('m', 'l');
		keys.put('n', 'b');
		keys.put('o', 'k');
		keys.put('p', 'r');
		keys.put('q', 'z');
		keys.put('r', 't');
		keys.put('s', 'n');
		keys.put('t', 'w');
		keys.put('u', 'j');
		keys.put('v', 'p');
		keys.put('w', 'f');
		keys.put('x', 'm');
		keys.put('y', 'a');
		keys.put('z', 'q');
		keys.put(' ', ' ');

		Scanner sc = new Scanner(System.in);

		int ncases = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for ( int ncase = 1; ncase <= ncases; ncase++ ) {
			char line[] = sc.nextLine().toCharArray();
			for (int i = 0; i < line.length; i++) {
				line[i] = keys.get(line[i]);
			}
			sb.append("Case #"+ ncase +": " + new String(line) +  "\n");
		}
		System.out.println(sb.toString());
		BufferedOutputStream bos = null;
		bos= new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Christian\\Desktop\\res.txt")));
		bos.write(sb.toString().getBytes());
		bos.close();
	}
}
